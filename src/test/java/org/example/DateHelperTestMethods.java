package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DateHelperTestMethods {
    public static void test_getDateOnly_stringToLong(int index, String datetime) {
        String date_DDMMYYYY = datetime.substring(6) + "-" + datetime.substring(3,5) + "-" + datetime.substring(0,2);
        ZonedDateTime zonedDateTime = LocalDate.parse(date_DDMMYYYY)
                .atStartOfDay(ZoneId.systemDefault());
        long timestamp = zonedDateTime.toInstant().toEpochMilli();
        assertEquals(timestamp, DateHelper.getDateOnly(datetime));
    }

    public static void test_getDateOnly_longToString(int index, String datetime) {
        long timestamp = Long.parseLong(datetime.replace("L",""));
        ZonedDateTime zonedDateTime = Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = zonedDateTime.format(formatter);
        assertEquals(formattedDate, DateHelper.getDateOnly(timestamp));
    }

    public static void test_getDateOnly_longToString_invalidDate(int index, String datetime) {
        assertEquals(0, DateHelper.getDateOnly(datetime));
    }

    public static void test_getDateAndTime_longToString(int index, String datetime) {
        long timestamp = Long.parseLong(datetime.replace("L",""));
        ZonedDateTime zonedDateTime = Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm a");
        String formattedDate = zonedDateTime.format(formatter);
        assertEquals(formattedDate, DateHelper.getDateAndTime(timestamp));
    }

    public static void test_getDateAndTime_stringToString(int index, String datetime) {
        try {
            assertEquals(datetime, DateHelper.getDateAndTime(datetime));
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Cannot format"));
        }
    }

    public static void test_getTimeOnly_longToString(int index, String datetime) {
        long timestamp = Long.parseLong(datetime.replace("L",""));
        ZonedDateTime zonedDateTime = Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedDate = zonedDateTime.format(formatter);
        assertEquals(formattedDate, DateHelper.getTimeOnly(timestamp));
    }

    public static void test_getToday_string() {
        String result = DateHelper.getToday();
        assertTrue(result.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    public static void test_getTodayWithTime_string() {
        String result = DateHelper.getTodayWithTime();
        assertTrue(result.matches("\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}"));
    }

    public static void test_getTomorrow_string() {
        String result = DateHelper.getTomorrow();
        assertTrue(result.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    public static void test_getDaysBetweenTwoDate_long(int index, String datetime, String format) {
        Long result = 0L;

        try {
            if (format.equals("S_DDMMYYYY") || format.equals("S_DDMMyy")) {
                result = DateHelper.getDaysBetweenTwoDate(
                        format.equals("S_DDMMYYYY")? "27/03/2025" : "27/03/25",
                        datetime,
                        DateHelper.DateFormats.valueOf(format)
                );
            } else {
                result = DateHelper.getDaysBetweenTwoDate(
                        "27/03/2025",
                        datetime,
                        DateHelper.DateFormats.valueOf(format)
                );
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(e.getMessage().contains("Unparseable date"));
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String oldDateTimeStr = "27/03/2025" + " 00:00:00";
        // 01/04/2025
        if (datetime.matches("\\d{2}/\\d{2}/\\d{4}")) {
            datetime = datetime;
        } else if (datetime.matches("\\d{2}/\\d{2}/\\d{4},\\s\\d{2}:\\d{2}\\s(a\\.m\\.|p\\.m\\.)")) {
            datetime = datetime.substring(0, 10);
        } else if (datetime.matches("\\d{2}/\\d{2}/\\d{2}")) {
            datetime = datetime.substring(0, 6) + "20" + datetime.substring(6);
        }
        System.out.println(datetime);
        String newDateTimeStr = datetime + " 00:00:00";
        LocalDateTime epochStart = LocalDateTime.parse(oldDateTimeStr, formatter);
        LocalDateTime targetDate = LocalDateTime.parse(newDateTimeStr, formatter);
        long daysDifference = - ChronoUnit.DAYS.between(epochStart, targetDate);
        System.out.println(daysDifference);
        assertTrue(daysDifference == result);
    }

    // format is "S_DDMMYYYY", or "S_DDMMyy", the test will pass
    public static void test_getHoursBetweenTwoDate_long(int index, String datetime, String format) {
        Long result = 0L;

        try {
            if (format.equals("S_DDMMYYYY") || format.equals("S_DDMMyy")) {
                result = DateHelper.getHoursBetweenTwoDate(
                        format.equals("S_DDMMYYYY")? "27/03/2025" : "27/03/25",
                        datetime,
                        DateHelper.DateFormats.valueOf(format)
                );
            } else {
                result = DateHelper.getHoursBetweenTwoDate(
                        "27/03/2025",
                        datetime,
                        DateHelper.DateFormats.valueOf(format)
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(e.getMessage().contains("Unparseable date"));
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String oldDateTimeStr = "27/03/2025" + " 00:00:00";
        // 01/04/2025
        if (datetime.matches("\\d{2}/\\d{2}/\\d{4}")) {
            datetime = datetime;
        } else if (datetime.matches("\\d{2}/\\d{2}/\\d{4},\\s\\d{2}:\\d{2}\\s(a\\.m\\.|p\\.m\\.)")) {
            datetime = datetime.substring(0, 10);
        } else if (datetime.matches("\\d{2}/\\d{2}/\\d{2}")) {
            datetime = datetime.substring(0, 6) + "20" + datetime.substring(6);
        }
        String newDateTimeStr = datetime + " 00:00:00";
        LocalDateTime epochStart = LocalDateTime.parse(oldDateTimeStr, formatter);
        LocalDateTime targetDate = LocalDateTime.parse(newDateTimeStr, formatter);
        long hoursDifference = - ChronoUnit.HOURS.between(epochStart, targetDate);
        assertTrue(hoursDifference == result);
    }

    public static void test_getMinutesBetweenTwoDates_long(int index, String datetime, String format) {
        Long result = 0L;

        try {
            if (format.equals("S_DDMMYYYY") || format.equals("S_DDMMyy")) {
                result = DateHelper.getMinutesBetweenTwoDates(
                        format.equals("S_DDMMYYYY")? "27/03/2025" : "27/03/25",
                        datetime,
                        DateHelper.DateFormats.valueOf(format)
                );
            } else {
                result = DateHelper.getMinutesBetweenTwoDates(
                        "27/03/2025",
                        datetime,
                        DateHelper.DateFormats.valueOf(format)
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(e.getMessage().contains("Unparseable date"));
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String oldDateTimeStr = "27/03/2025" + " 00:00:00";
        // 01/04/2025
        if (datetime.matches("\\d{2}/\\d{2}/\\d{4}")) {
            datetime = datetime;
        } else if (datetime.matches("\\d{2}/\\d{2}/\\d{4},\\s\\d{2}:\\d{2}\\s(a\\.m\\.|p\\.m\\.)")) {
            datetime = datetime.substring(0, 10);
        } else if (datetime.matches("\\d{2}/\\d{2}/\\d{2}")) {
            datetime = datetime.substring(0, 6) + "20" + datetime.substring(6);
        }
        String newDateTimeStr = datetime + " 00:00:00";
        LocalDateTime epochStart = LocalDateTime.parse(oldDateTimeStr, formatter);
        LocalDateTime targetDate = LocalDateTime.parse(newDateTimeStr, formatter);
        long minutesDifference = - ChronoUnit.MINUTES.between(epochStart, targetDate);
        assertTrue(minutesDifference == result);
    }

    public static void test_parseAnyDate_long(int index, String datetime) {
        long result = DateHelper.parseAnyDate(datetime);
        assertTrue(result > 0);
    }

    public static void test_parseDate_long(int index, String datetime) {
        String date_DDMMYYYY = datetime.substring(6) + "-" + datetime.substring(3,5) + "-" + datetime.substring(0,2);
        ZonedDateTime zonedDateTime = LocalDate.parse(date_DDMMYYYY)
                .atStartOfDay(ZoneId.systemDefault());
        long timestamp = zonedDateTime.toInstant().toEpochMilli();
        assertEquals(timestamp, DateHelper.parseDate(datetime, DateHelper.DateFormats.S_DDMMYYYY));
    }

    public static void test_getDesiredFormat_string() {
        String result = "";
        result = DateHelper.getDesiredFormat(DateHelper.DateFormats.D_YYYYMMDD);
        assertTrue(result.matches("\\d{4}-\\d{2}-\\d{2}"));
        result = DateHelper.getDesiredFormat(DateHelper.DateFormats.S_DDMMYYYY);
        assertTrue(result.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    public static void test_getDesiredFormat_longToString(int index, String datetime) {
        String result = "";
        result = DateHelper.getDesiredFormat(DateHelper.DateFormats.D_YYYYMMDD, Long.parseLong(datetime.replace("L","")));
        assertTrue(result.matches("\\d{4}-\\d{2}-\\d{2}"));
        result = DateHelper.getDesiredFormat(DateHelper.DateFormats.S_DDMMYYYY, Long.parseLong(datetime.replace("L","")));
        assertTrue(result.matches("\\d{2}/\\d{2}/\\d{4}"));
        result = DateHelper.getDesiredFormat(DateHelper.DateFormats.D_DDMMYYYY_N, Long.parseLong(datetime.replace("L","")));
        assertTrue(result.matches("\\d{2}-[A-Za-z]{3}.-\\d{4}"));
    }

    public static void test_getDateFromDays_string() {
        assertTrue(DateHelper.getDateFromDays(1).matches("\\d{2}-[A-Za-z]{3}.-\\d{2}"));
    }
}
