package org.example;

import java.io.*;
import java.util.*;

public class DateHelperTestFileGeneratorByCombinatorial {
    public static void main(String[] args) {
        String inputFilePath = "src\\main\\resources\\DateHelper-Pairwise-output-after.csv";
        String outputFilePath = "src\\test\\java\\org\\example\\DateHelperCombinatorialTest.java";

        List<String[]> testCases = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("#") || line.isEmpty() || line.equals("datetime,format")) continue;
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    testCases.add(parts);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
            writer.println("package org.example;");
            writer.println();
            writer.println("import org.junit.Test;");
            writer.println();
            writer.println("public class DateHelperCombinatorialTest {");

            // Generate testCase methods
            for (int i = 0; i < testCases.size(); i++) {
                String[] tc = testCases.get(i);
                String datetime = tc[0];
                if (datetime.matches("^\\d{2}/\\d{2}/\\d{4} \\d{1,2}:\\d{2} [ap]\\.m\\.$")) {
                    datetime = datetime.replaceAll("(\\d{2}/\\d{2}/\\d{4}) ", "$1, ");
                }
                String format = tc[1];
                String methodLine = String.format("    @Test public void testCase%d() { runTest(%d, \"%s\", \"%s\"); }",
                        i + 1, i + 1, datetime, format);
                writer.println(methodLine);
            }

            // Add testCasesWithoutInput
            writer.println();
            writer.println("    @Test");
            writer.println("    public void testCasesWithoutInput() {");
            writer.println("        DateHelperTestMethods.test_getToday_string();");
            writer.println("        DateHelperTestMethods.test_getTodayWithTime_string();");
            writer.println("        DateHelperTestMethods.test_getTomorrow_string();");
            writer.println("        DateHelperTestMethods.test_getDesiredFormat_string();");
            writer.println("        DateHelperTestMethods.test_getDateFromDays_string();");
            writer.println("        DateHelperTestMethods.test_getDateFromDays_string();");
            writer.println("    }");

            // Add runTest method
            writer.println();
            writer.println("    private void runTest(int index, String datetime, String format) {");
            writer.println();
            writer.println("        // tests for cases with the format of dd/MM/yyyy");
            writer.println("        if (datetime.contains(\"/\") && !datetime.contains(\":\")) {");
            writer.println("            DateHelperTestMethods.test_getDateOnly_stringToLong(index, datetime);");
            writer.println("            DateHelperTestMethods.test_parseAnyDate_long(index, datetime);");
            writer.println("            DateHelperTestMethods.test_parseDate_long(index, datetime);");
            writer.println("            if (format.equals(DateHelper.DateFormats.S_DDMMYYYY) || format.equals(DateHelper.DateFormats.S_DDMMyy)) {");
            writer.println("                DateHelperTestMethods.test_getDaysBetweenTwoDate_long(index, datetime, format);");
            writer.println("                DateHelperTestMethods.test_getHoursBetweenTwoDate_long(index, datetime, format);");
            writer.println("                DateHelperTestMethods.test_getMinutesBetweenTwoDates_long(index, datetime, format);");
            writer.println("            }");
            writer.println("        // tests for cases with the format of dd/MM/yyyy, hh:mma");
            writer.println("        } else if (datetime.contains(\"/\") && datetime.contains(\":\")) {");
            writer.println("            DateHelperTestMethods.test_getDateAndTime_stringToString(index, datetime);");
            writer.println("            DateHelperTestMethods.test_getHoursBetweenTwoDate_long(index, datetime, format);");
            writer.println("            DateHelperTestMethods.test_getMinutesBetweenTwoDates_long(index, datetime, format);");
            writer.println();
            writer.println("        // tests for cases with the format of timestamp");
            writer.println("        } else if (datetime.contains(\"L\")) {");
            writer.println("            DateHelperTestMethods.test_getDateOnly_longToString(index, datetime);");
            writer.println("            DateHelperTestMethods.test_getDateAndTime_longToString(index, datetime);");
            writer.println("            DateHelperTestMethods.test_getTimeOnly_longToString(index, datetime);");
            writer.println("            DateHelperTestMethods.test_getDesiredFormat_longToString(index, datetime);");
            writer.println("        } else if (datetime.contains(\"invalid-date\")) {");
            writer.println("            DateHelperTestMethods.test_getDateOnly_longToString_invalidDate(index, datetime);");
            writer.println("        }");
            writer.println("    }");

            writer.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
