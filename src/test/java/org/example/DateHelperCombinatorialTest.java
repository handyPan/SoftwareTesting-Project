package org.example;

import org.junit.Test;

public class DateHelperCombinatorialTest {
    @Test public void testCase1() { runTest(1, "01/04/2025", "S_DDMMYYYY"); }
    @Test public void testCase2() { runTest(2, "01/04/2025", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase3() { runTest(3, "01/04/2025", "D_YYYYMMDD"); }
    @Test public void testCase4() { runTest(4, "01/04/2025", "D_DDMMYYYY_N"); }
    @Test public void testCase5() { runTest(5, "01/04/2025", "S_DDMMyy"); }
    @Test public void testCase6() { runTest(6, "01/04/2025", "D_DDMMYYYY"); }
    @Test public void testCase7() { runTest(7, "01/04/2025, 12:00 a.m.", "S_DDMMYYYY"); }
    @Test public void testCase8() { runTest(8, "01/04/2025, 12:00 a.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase9() { runTest(9, "01/04/2025, 12:00 a.m.", "D_YYYYMMDD"); }
    @Test public void testCase10() { runTest(10, "01/04/2025, 12:00 a.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase11() { runTest(11, "01/04/2025, 12:00 a.m.", "S_DDMMyy"); }
    @Test public void testCase12() { runTest(12, "01/04/2025, 12:00 a.m.", "D_DDMMYYYY"); }
    @Test public void testCase13() { runTest(13, "1743480000000L", "S_DDMMYYYY"); }
    @Test public void testCase14() { runTest(14, "1743480000000L", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase15() { runTest(15, "1743480000000L", "D_YYYYMMDD"); }
    @Test public void testCase16() { runTest(16, "1743480000000L", "D_DDMMYYYY_N"); }
    @Test public void testCase17() { runTest(17, "1743480000000L", "S_DDMMyy"); }
    @Test public void testCase18() { runTest(18, "1743480000000L", "D_DDMMYYYY"); }
    @Test public void testCase19() { runTest(19, "invalid-date", "S_DDMMYYYY"); }
    @Test public void testCase20() { runTest(20, "invalid-date", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase21() { runTest(21, "invalid-date", "D_YYYYMMDD"); }
    @Test public void testCase22() { runTest(22, "invalid-date", "D_DDMMYYYY_N"); }
    @Test public void testCase23() { runTest(23, "invalid-date", "S_DDMMyy"); }
    @Test public void testCase24() { runTest(24, "invalid-date", "D_DDMMYYYY"); }
    @Test public void testCase25() { runTest(25, "25/03/2025", "S_DDMMYYYY"); }
    @Test public void testCase26() { runTest(26, "25/03/2025", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase27() { runTest(27, "25/03/2025", "D_YYYYMMDD"); }
    @Test public void testCase28() { runTest(28, "25/03/2025", "D_DDMMYYYY_N"); }
    @Test public void testCase29() { runTest(29, "25/03/2025", "S_DDMMyy"); }
    @Test public void testCase30() { runTest(30, "25/03/2025", "D_DDMMYYYY"); }
    @Test public void testCase31() { runTest(31, "45/13/2025", "S_DDMMYYYY"); }
    @Test public void testCase32() { runTest(32, "45/13/2025", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase33() { runTest(33, "45/13/2025", "D_YYYYMMDD"); }
    @Test public void testCase34() { runTest(34, "45/13/2025", "D_DDMMYYYY_N"); }
    @Test public void testCase35() { runTest(35, "45/13/2025", "S_DDMMyy"); }
    @Test public void testCase36() { runTest(36, "45/13/2025", "D_DDMMYYYY"); }
    @Test public void testCase37() { runTest(37, "01/01/1970", "S_DDMMYYYY"); }
    @Test public void testCase38() { runTest(38, "01/01/1970", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase39() { runTest(39, "01/01/1970", "D_YYYYMMDD"); }
    @Test public void testCase40() { runTest(40, "01/01/1970", "D_DDMMYYYY_N"); }
    @Test public void testCase41() { runTest(41, "01/01/1970", "S_DDMMyy"); }
    @Test public void testCase42() { runTest(42, "01/01/1970", "D_DDMMYYYY"); }
    @Test public void testCase43() { runTest(43, "31/02/2025", "S_DDMMYYYY"); }
    @Test public void testCase44() { runTest(44, "31/02/2025", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase45() { runTest(45, "31/02/2025", "D_YYYYMMDD"); }
    @Test public void testCase46() { runTest(46, "31/02/2025", "D_DDMMYYYY_N"); }
    @Test public void testCase47() { runTest(47, "31/02/2025", "S_DDMMyy"); }
    @Test public void testCase48() { runTest(48, "31/02/2025", "D_DDMMYYYY"); }
    @Test public void testCase49() { runTest(49, "2025-04-01", "S_DDMMYYYY"); }
    @Test public void testCase50() { runTest(50, "2025-04-01", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase51() { runTest(51, "2025-04-01", "D_YYYYMMDD"); }
    @Test public void testCase52() { runTest(52, "2025-04-01", "D_DDMMYYYY_N"); }
    @Test public void testCase53() { runTest(53, "2025-04-01", "S_DDMMyy"); }
    @Test public void testCase54() { runTest(54, "2025-04-01", "D_DDMMYYYY"); }
    @Test public void testCase55() { runTest(55, "01/01/2025 25:00", "S_DDMMYYYY"); }
    @Test public void testCase56() { runTest(56, "01/01/2025 25:00", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase57() { runTest(57, "01/01/2025 25:00", "D_YYYYMMDD"); }
    @Test public void testCase58() { runTest(58, "01/01/2025 25:00", "D_DDMMYYYY_N"); }
    @Test public void testCase59() { runTest(59, "01/01/2025 25:00", "S_DDMMyy"); }
    @Test public void testCase60() { runTest(60, "01/01/2025 25:00", "D_DDMMYYYY"); }
    @Test public void testCase61() { runTest(61, "29/02/2000", "S_DDMMYYYY"); }
    @Test public void testCase62() { runTest(62, "29/02/2000", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase63() { runTest(63, "29/02/2000", "D_YYYYMMDD"); }
    @Test public void testCase64() { runTest(64, "29/02/2000", "D_DDMMYYYY_N"); }
    @Test public void testCase65() { runTest(65, "29/02/2000", "S_DDMMyy"); }
    @Test public void testCase66() { runTest(66, "29/02/2000", "D_DDMMYYYY"); }
    @Test public void testCase67() { runTest(67, "29/02/2001", "S_DDMMYYYY"); }
    @Test public void testCase68() { runTest(68, "29/02/2001", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase69() { runTest(69, "29/02/2001", "D_YYYYMMDD"); }
    @Test public void testCase70() { runTest(70, "29/02/2001", "D_DDMMYYYY_N"); }
    @Test public void testCase71() { runTest(71, "29/02/2001", "S_DDMMyy"); }
    @Test public void testCase72() { runTest(72, "29/02/2001", "D_DDMMYYYY"); }
    @Test public void testCase73() { runTest(73, "01/04/2025, 04:00 p.m.", "S_DDMMYYYY"); }
    @Test public void testCase74() { runTest(74, "01/04/2025, 04:00 p.m.", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase75() { runTest(75, "01/04/2025, 04:00 p.m.", "D_YYYYMMDD"); }
    @Test public void testCase76() { runTest(76, "01/04/2025, 04:00 p.m.", "D_DDMMYYYY_N"); }
    @Test public void testCase77() { runTest(77, "01/04/2025, 04:00 p.m.", "S_DDMMyy"); }
    @Test public void testCase78() { runTest(78, "01/04/2025, 04:00 p.m.", "D_DDMMYYYY"); }
    @Test public void testCase79() { runTest(79, "01-Apr-2025", "S_DDMMYYYY"); }
    @Test public void testCase80() { runTest(80, "01-Apr-2025", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase81() { runTest(81, "01-Apr-2025", "D_YYYYMMDD"); }
    @Test public void testCase82() { runTest(82, "01-Apr-2025", "D_DDMMYYYY_N"); }
    @Test public void testCase83() { runTest(83, "01-Apr-2025", "S_DDMMyy"); }
    @Test public void testCase84() { runTest(84, "01-Apr-2025", "D_DDMMYYYY"); }
    @Test public void testCase85() { runTest(85, "01/04/25", "S_DDMMYYYY"); }
    @Test public void testCase86() { runTest(86, "01/04/25", "S_DDMMYYYYHHMMA"); }
    @Test public void testCase87() { runTest(87, "01/04/25", "D_YYYYMMDD"); }
    @Test public void testCase88() { runTest(88, "01/04/25", "D_DDMMYYYY_N"); }
    @Test public void testCase89() { runTest(89, "01/04/25", "S_DDMMyy"); }
    @Test public void testCase90() { runTest(90, "01/04/25", "D_DDMMYYYY"); }

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
            DateHelperTestMethods.test_parseDate_long(index, datetime);
            if (format.equals(DateHelper.DateFormats.S_DDMMYYYY) || format.equals(DateHelper.DateFormats.S_DDMMyy)) {
                DateHelperTestMethods.test_getDaysBetweenTwoDate_long(index, datetime, format);
                DateHelperTestMethods.test_getHoursBetweenTwoDate_long(index, datetime, format);
                DateHelperTestMethods.test_getMinutesBetweenTwoDates_long(index, datetime, format);
            }
            DateHelperTestMethods.test_parseAnyDate_long(index, datetime);
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
