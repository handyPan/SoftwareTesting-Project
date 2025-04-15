package org.example;

import com.microsoft.z3.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateHelperTestCaseGeneratorByZ3 {

    public static void main(String[] args) {
        try (Context ctx = new Context(); FileWriter writer = new FileWriter("src\\main\\resources\\DateHelperZ3.csv")) {
            writer.write("datetime,format\n");

            // Define output formats
            List<String> formats = Arrays.asList(
                    "S_DDMMYYYY",
                    "S_DDMMYYYYHHMMA",
                    "D_YYYYMMDD",
                    "D_DDMMYYYY_N",
                    "S_DDMMyy"
            );

            // List to collect all datetime test cases
            Set<String> datetimeVariants = new LinkedHashSet<>();

            // Add hardcoded variants
            datetimeVariants.add("01/04/2025");
            datetimeVariants.add("01/04/2025 12:00 a.m.");
            datetimeVariants.add(getTimestamp("01/04/2025") + "L");
            datetimeVariants.add("invalid-date");

            // Add Z3-generated variants
            datetimeVariants.addAll(generateZ3DateCases(ctx));

            // Write combinations to CSV
            for (String format : formats) {
                for (String datetime : datetimeVariants) {
                    writer.write(datetime + "," + format + "\n");
                }
            }

            System.out.println("CSV content written to src\\main\\resources\\DateHelperZ3.csv");

        } catch (IOException | Z3Exception e) {
            e.printStackTrace();
        }
    }

    private static Set<String> generateZ3DateCases(Context ctx) {
        Set<String> datetimeStrings = new LinkedHashSet<>();
        IntExpr year = ctx.mkIntConst("year");
        IntExpr month = ctx.mkIntConst("month");
        IntExpr day = ctx.mkIntConst("day");
        IntExpr hour = ctx.mkIntConst("hour");
        IntExpr minute = ctx.mkIntConst("minute");
        IntExpr second = ctx.mkIntConst("second");

        List<TestCase> testCases = Arrays.asList(
                new TestCase("validLeapYear", ctx.mkAnd(
                        ctx.mkEq(year, ctx.mkInt(2020)),
                        ctx.mkEq(month, ctx.mkInt(2)),
                        ctx.mkEq(day, ctx.mkInt(29)),
                        ctx.mkEq(hour, ctx.mkInt(12)),
                        ctx.mkEq(minute, ctx.mkInt(0)),
                        ctx.mkEq(second, ctx.mkInt(0))
                )),
                new TestCase("invalidNonLeapFeb29", ctx.mkAnd(
                        ctx.mkEq(year, ctx.mkInt(2021)),
                        ctx.mkEq(month, ctx.mkInt(2)),
                        ctx.mkEq(day, ctx.mkInt(29))
                )),
                new TestCase("invalidApril31", ctx.mkAnd(
                        ctx.mkEq(month, ctx.mkInt(4)),
                        ctx.mkEq(day, ctx.mkInt(31))
                )),
                new TestCase("validEndOfYear", ctx.mkAnd(
                        ctx.mkEq(year, ctx.mkInt(2024)),
                        ctx.mkEq(month, ctx.mkInt(12)),
                        ctx.mkEq(day, ctx.mkInt(31)),
                        ctx.mkEq(hour, ctx.mkInt(23)),
                        ctx.mkEq(minute, ctx.mkInt(59)),
                        ctx.mkEq(second, ctx.mkInt(59))
                )),
                new TestCase("validStartOfCalendar", ctx.mkAnd(
                        ctx.mkEq(year, ctx.mkInt(1)),
                        ctx.mkEq(month, ctx.mkInt(1)),
                        ctx.mkEq(day, ctx.mkInt(1)),
                        ctx.mkEq(hour, ctx.mkInt(0)),
                        ctx.mkEq(minute, ctx.mkInt(0)),
                        ctx.mkEq(second, ctx.mkInt(0))
                )),
                new TestCase("validMaxDateTime", ctx.mkAnd(
                        ctx.mkEq(year, ctx.mkInt(9999)),
                        ctx.mkEq(month, ctx.mkInt(12)),
                        ctx.mkEq(day, ctx.mkInt(31)),
                        ctx.mkEq(hour, ctx.mkInt(23)),
                        ctx.mkEq(minute, ctx.mkInt(59)),
                        ctx.mkEq(second, ctx.mkInt(59))
                ))
        );

        for (TestCase tc : testCases) {
            Solver solver = ctx.mkSolver();
            solver.add(tc.constraint);

            if (solver.check() == Status.SATISFIABLE) {
                Model model = solver.getModel();
                String y = model.evaluate(year, false).toString();
                String m = pad(model.evaluate(month, false).toString());
                String d = pad(model.evaluate(day, false).toString());
                String h = model.evaluate(hour, false).toString();
                String min = model.evaluate(minute, false).toString();

                // Compose formats
                datetimeStrings.add(String.format("%s/%s/%s", d, m, y)); // e.g., 29/02/2020
                datetimeStrings.add(String.format("%s/%s/%s %s:%s a.m.", d, m, y, h, min)); // e.g., 29/02/2020 12:00 a.m.

                try {
                    long millis = getTimestamp(d + "/" + m + "/" + y);
                    datetimeStrings.add(millis + "L");
                } catch (Exception e) {
                    // Ignore if invalid date
                }
            } else {
                datetimeStrings.add("invalid-date");
            }
        }

        return datetimeStrings;
    }

    private static String pad(String val) {
        return val.length() == 1 ? "0" + val : val;
    }

    private static long getTimestamp(String dateStr) {
        String date_DDMMYYYY = dateStr.substring(6) + "-" + dateStr.substring(3,5) + "-" + dateStr.substring(0,2);
        ZonedDateTime zonedDateTime = LocalDate.parse(date_DDMMYYYY)
                .atStartOfDay(ZoneId.systemDefault());
        return zonedDateTime.toInstant().toEpochMilli();
    }

    private static class TestCase {
        String name;
        BoolExpr constraint;

        TestCase(String name, BoolExpr constraint) {
            this.name = name;
            this.constraint = constraint;
        }
    }
}
