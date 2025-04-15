package org.example;

import org.junit.Test;

public class DateHelperZ3Test {
    @Test public void testCase1() { runTest(1, "01/04/2025", "S_DDMMYYYY"); }
    @Test public void testCase2() { runTest(2, "01/04/2025, 12:00 a.m.", "S_DDMMYYYY"); }
    @Test public void testCase3() { runTest(3, "1743480000000L", "S_DDMMYYYY"); }
    @Test public void testCase4() { runTest(4, "invalid-date", "S_DDMMYYYY"); }
    @Test public void testCase5() { runTest(5, "29/02/2020", "S_DDMMYYYY"); }
    @Test public void testCase6() { runTest(6, "29/02/2020 12:0 a.m.", "S_DDMMYYYY"); }
    @Test public void testCase7() { runTest(7, "1582952400000L", "S_DDMMYYYY"); }
    @Test public void testCase8() { runTest(8, "29/02/2021", "S_DDMMYYYY"); }
    @Test public void testCase9() { runTest(9, "29/02/2021 hour:minute a.m.", "S_DDMMYYYY"); }
    @Test public void testCase10() { runTest(10, "31/04/year", "S_DDMMYYYY"); }
    @Test public void testCase11() { runTest(11, "31/04/year hour:minute a.m.", "S_DDMMYYYY"); }
    @Test public void testCase12() { runTest(12, "31/12/2024", "S_DDMMYYYY"); }
    @Test public void testCase13() { runTest(13, "31/12/2024, 23:59 a.m.", "S_DDMMYYYY"); }
    @Test public void testCase14() { runTest(14, "1735621200000L", "S_DDMMYYYY"); }
    @Test public void testCase15() { runTest(15, "01/01/1", "S_DDMMYYYY"); }
    @Test public void testCase16() { runTest(16, "01/01/1 0:0 a.m.", "S_DDMMYYYY"); }
    @Test public void testCase17() { runTest(17, "31/12/9999", "S_DDMMYYYY"); }
    @Test public void testCase18() { runTest(18, "31/12/9999, 23:59 a.m.", "S_DDMMYYYY"); }
    @Test public void testCase19() { runTest(19, "253402232400000L", "S_DDMMYYYY"); }
    @Test public void testCase20() { runTest(20, "01/04/2025", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase21() { runTest(21, "01/04/2025, 12:00 a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase22() { runTest(22, "1743480000000L", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase23() { runTest(23, "invalid-date", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase24() { runTest(24, "29/02/2020", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase25() { runTest(25, "29/02/2020 12:0 a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase26() { runTest(26, "1582952400000L", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase27() { runTest(27, "29/02/2021", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase28() { runTest(28, "29/02/2021 hour:minute a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase29() { runTest(29, "31/04/year", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase30() { runTest(30, "31/04/year hour:minute a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase31() { runTest(31, "31/12/2024", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase32() { runTest(32, "31/12/2024, 23:59 a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase33() { runTest(33, "1735621200000L", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase34() { runTest(34, "01/01/1", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase35() { runTest(35, "01/01/1 0:0 a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase36() { runTest(36, "31/12/9999", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase37() { runTest(37, "31/12/9999, 23:59 a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase38() { runTest(38, "253402232400000L", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase39() { runTest(39, "01/04/2025", "D_YYYYMMDD"); }
    @Test public void testCase40() { runTest(40, "01/04/2025, 12:00 a.m.", "D_YYYYMMDD"); }
    @Test public void testCase41() { runTest(41, "1743480000000L", "D_YYYYMMDD"); }
    @Test public void testCase42() { runTest(42, "invalid-date", "D_YYYYMMDD"); }
    @Test public void testCase43() { runTest(43, "29/02/2020", "D_YYYYMMDD"); }
    @Test public void testCase44() { runTest(44, "29/02/2020 12:0 a.m.", "D_YYYYMMDD"); }
    @Test public void testCase45() { runTest(45, "1582952400000L", "D_YYYYMMDD"); }
    @Test public void testCase46() { runTest(46, "29/02/2021", "D_YYYYMMDD"); }
    @Test public void testCase47() { runTest(47, "29/02/2021 hour:minute a.m.", "D_YYYYMMDD"); }
    @Test public void testCase48() { runTest(48, "31/04/year", "D_YYYYMMDD"); }
    @Test public void testCase49() { runTest(49, "31/04/year hour:minute a.m.", "D_YYYYMMDD"); }
    @Test public void testCase50() { runTest(50, "31/12/2024", "D_YYYYMMDD"); }
    @Test public void testCase51() { runTest(51, "31/12/2024, 23:59 a.m.", "D_YYYYMMDD"); }
    @Test public void testCase52() { runTest(52, "1735621200000L", "D_YYYYMMDD"); }
    @Test public void testCase53() { runTest(53, "01/01/1", "D_YYYYMMDD"); }
    @Test public void testCase54() { runTest(54, "01/01/1 0:0 a.m.", "D_YYYYMMDD"); }
    @Test public void testCase55() { runTest(55, "31/12/9999", "D_YYYYMMDD"); }
    @Test public void testCase56() { runTest(56, "31/12/9999, 23:59 a.m.", "D_YYYYMMDD"); }
    @Test public void testCase57() { runTest(57, "253402232400000L", "D_YYYYMMDD"); }
    @Test public void testCase58() { runTest(58, "01/04/2025", "D_DDMMYYYY_N"); }
    @Test public void testCase59() { runTest(59, "01/04/2025, 12:00 a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase60() { runTest(60, "1743480000000L", "D_DDMMYYYY_N"); }
    @Test public void testCase61() { runTest(61, "invalid-date", "D_DDMMYYYY_N"); }
    @Test public void testCase62() { runTest(62, "29/02/2020", "D_DDMMYYYY_N"); }
    @Test public void testCase63() { runTest(63, "29/02/2020 12:0 a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase64() { runTest(64, "1582952400000L", "D_DDMMYYYY_N"); }
    @Test public void testCase65() { runTest(65, "29/02/2021", "D_DDMMYYYY_N"); }
    @Test public void testCase66() { runTest(66, "29/02/2021 hour:minute a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase67() { runTest(67, "31/04/year", "D_DDMMYYYY_N"); }
    @Test public void testCase68() { runTest(68, "31/04/year hour:minute a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase69() { runTest(69, "31/12/2024", "D_DDMMYYYY_N"); }
    @Test public void testCase70() { runTest(70, "31/12/2024, 23:59 a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase71() { runTest(71, "1735621200000L", "D_DDMMYYYY_N"); }
    @Test public void testCase72() { runTest(72, "01/01/1", "D_DDMMYYYY_N"); }
    @Test public void testCase73() { runTest(73, "01/01/1 0:0 a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase74() { runTest(74, "31/12/9999", "D_DDMMYYYY_N"); }
    @Test public void testCase75() { runTest(75, "31/12/9999, 23:59 a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase76() { runTest(76, "253402232400000L", "D_DDMMYYYY_N"); }
    @Test public void testCase77() { runTest(77, "01/04/2025", "S_DDMMyy"); }
    @Test public void testCase78() { runTest(78, "01/04/2025, 12:00 a.m.", "S_DDMMyy"); }
    @Test public void testCase79() { runTest(79, "1743480000000L", "S_DDMMyy"); }
    @Test public void testCase80() { runTest(80, "invalid-date", "S_DDMMyy"); }
    @Test public void testCase81() { runTest(81, "29/02/2020", "S_DDMMyy"); }
    @Test public void testCase82() { runTest(82, "29/02/2020 12:0 a.m.", "S_DDMMyy"); }
    @Test public void testCase83() { runTest(83, "1582952400000L", "S_DDMMyy"); }
    @Test public void testCase84() { runTest(84, "29/02/2021", "S_DDMMyy"); }
    @Test public void testCase85() { runTest(85, "29/02/2021 hour:minute a.m.", "S_DDMMyy"); }
    @Test public void testCase86() { runTest(86, "31/04/year", "S_DDMMyy"); }
    @Test public void testCase87() { runTest(87, "31/04/year hour:minute a.m.", "S_DDMMyy"); }
    @Test public void testCase88() { runTest(88, "31/12/2024", "S_DDMMyy"); }
    @Test public void testCase89() { runTest(89, "31/12/2024, 23:59 a.m.", "S_DDMMyy"); }
    @Test public void testCase90() { runTest(90, "1735621200000L", "S_DDMMyy"); }
    @Test public void testCase91() { runTest(91, "01/01/1", "S_DDMMyy"); }
    @Test public void testCase92() { runTest(92, "01/01/1 0:0 a.m.", "S_DDMMyy"); }
    @Test public void testCase93() { runTest(93, "31/12/9999", "S_DDMMyy"); }
    @Test public void testCase94() { runTest(94, "31/12/9999, 23:59 a.m.", "S_DDMMyy"); }
    @Test public void testCase95() { runTest(95, "253402232400000L", "S_DDMMyy"); }

    @Test
    public void testCasesWithoutInput() {
        DateHelperTestMethods.test_getToday_string();
        DateHelperTestMethods.test_getTodayWithTime_string();
        DateHelperTestMethods.test_getTomorrow_string();
        DateHelperTestMethods.test_getDesiredFormat_string();
        DateHelperTestMethods.test_getDateFromDays_string();
        DateHelperTestMethods.test_getDateFromDays_string();
    }

    private void runTest(int index, String datetime, String format) {

        // tests for cases with the format of dd/MM/yyyy
        if (datetime.contains("/") && !datetime.contains(":")) {
            DateHelperTestMethods.test_getDateOnly_stringToLong(index, datetime);
            DateHelperTestMethods.test_parseAnyDate_long(index, datetime);
            DateHelperTestMethods.test_parseDate_long(index, datetime);
            if (format.equals(DateHelper.DateFormats.S_DDMMYYYY) || format.equals(DateHelper.DateFormats.S_DDMMyy)) {
                DateHelperTestMethods.test_getDaysBetweenTwoDate_long(index, datetime, format);
                DateHelperTestMethods.test_getHoursBetweenTwoDate_long(index, datetime, format);
                DateHelperTestMethods.test_getMinutesBetweenTwoDates_long(index, datetime, format);
            }
        // tests for cases with the format of dd/MM/yyyy, hh:mma
        } else if (datetime.contains("/") && datetime.contains(":")) {
            DateHelperTestMethods.test_getDateAndTime_stringToString(index, datetime);
            DateHelperTestMethods.test_getHoursBetweenTwoDate_long(index, datetime, format);
            DateHelperTestMethods.test_getMinutesBetweenTwoDates_long(index, datetime, format);

        // tests for cases with the format of timestamp
        } else if (datetime.contains("L")) {
            DateHelperTestMethods.test_getDateOnly_longToString(index, datetime);
            DateHelperTestMethods.test_getDateAndTime_longToString(index, datetime);
            DateHelperTestMethods.test_getTimeOnly_longToString(index, datetime);
            DateHelperTestMethods.test_getDesiredFormat_longToString(index, datetime);
        } else if (datetime.contains("invalid-date")) {
            DateHelperTestMethods.test_getDateOnly_longToString_invalidDate(index, datetime);
        }
    }
}
