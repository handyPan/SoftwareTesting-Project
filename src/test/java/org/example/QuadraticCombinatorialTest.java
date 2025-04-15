package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class QuadraticCombinatorialTest {

    @Test public void testCase1() { runTest(1, "1", "1", "1"); }
    @Test public void testCase2() { runTest(2, "1", "1", "0"); }
    @Test public void testCase3() { runTest(3, "1", "1", "-1"); }
    @Test public void testCase4() { runTest(4, "1", "1", "1e-100"); }
    @Test public void testCase5() { runTest(5, "1", "1", "1e100"); }
    @Test public void testCase6() { runTest(6, "0", "1", "1"); }
    @Test public void testCase7() { runTest(7, "0", "1", "0"); }
    @Test public void testCase8() { runTest(8, "0", "1", "-1"); }
    @Test public void testCase9() { runTest(9, "0", "1", "1e-100"); }
    @Test public void testCase10() { runTest(10, "0", "1", "1e100"); }
    @Test public void testCase11() { runTest(11, "-1", "1", "1"); }
    @Test public void testCase12() { runTest(12, "-1", "1", "0"); }
    @Test public void testCase13() { runTest(13, "-1", "1", "-1"); }
    @Test public void testCase14() { runTest(14, "-1", "1", "1e-100"); }
    @Test public void testCase15() { runTest(15, "-1", "1", "1e100"); }
    @Test public void testCase16() { runTest(16, "1e-100", "1", "1"); }
    @Test public void testCase17() { runTest(17, "1e-100", "1", "0"); }
    @Test public void testCase18() { runTest(18, "1e-100", "1", "-1"); }
    @Test public void testCase19() { runTest(19, "1e-100", "1", "1e-100"); }
    @Test public void testCase20() { runTest(20, "1e-100", "1", "1e100"); }
    @Test public void testCase21() { runTest(21, "1e100", "1", "1"); }
    @Test public void testCase22() { runTest(22, "1e100", "1", "0"); }
    @Test public void testCase23() { runTest(23, "1e100", "1", "-1"); }
    @Test public void testCase24() { runTest(24, "1e100", "1", "1e-100"); }
    @Test public void testCase25() { runTest(25, "1e100", "1", "1e100"); }
    @Test public void testCase26() { runTest(26, "1", "0", "1"); }
    @Test public void testCase27() { runTest(27, "1", "0", "0"); }
    @Test public void testCase28() { runTest(28, "1", "0", "-1"); }
    @Test public void testCase29() { runTest(29, "1", "0", "1e-100"); }
    @Test public void testCase30() { runTest(30, "1", "0", "1e100"); }
    @Test public void testCase31() { runTest(31, "0", "0", "1"); }
    @Test public void testCase32() { runTest(32, "0", "0", "0"); }
    @Test public void testCase33() { runTest(33, "0", "0", "-1"); }
    @Test public void testCase34() { runTest(34, "0", "0", "1e-100"); }
    @Test public void testCase35() { runTest(35, "0", "0", "1e100"); }
    @Test public void testCase36() { runTest(36, "-1", "0", "1"); }
    @Test public void testCase37() { runTest(37, "-1", "0", "0"); }
    @Test public void testCase38() { runTest(38, "-1", "0", "-1"); }
    @Test public void testCase39() { runTest(39, "-1", "0", "1e-100"); }
    @Test public void testCase40() { runTest(40, "-1", "0", "1e100"); }
    @Test public void testCase41() { runTest(41, "1e-100", "0", "1"); }
    @Test public void testCase42() { runTest(42, "1e-100", "0", "0"); }
    @Test public void testCase43() { runTest(43, "1e-100", "0", "-1"); }
    @Test public void testCase44() { runTest(44, "1e-100", "0", "1e-100"); }
    @Test public void testCase45() { runTest(45, "1e-100", "0", "1e100"); }
    @Test public void testCase46() { runTest(46, "1e100", "0", "1"); }
    @Test public void testCase47() { runTest(47, "1e100", "0", "0"); }
    @Test public void testCase48() { runTest(48, "1e100", "0", "-1"); }
    @Test public void testCase49() { runTest(49, "1e100", "0", "1e-100"); }
    @Test public void testCase50() { runTest(50, "1e100", "0", "1e100"); }
    @Test public void testCase51() { runTest(51, "1", "-1", "1"); }
    @Test public void testCase52() { runTest(52, "1", "-1", "0"); }
    @Test public void testCase53() { runTest(53, "1", "-1", "-1"); }
    @Test public void testCase54() { runTest(54, "1", "-1", "1e-100"); }
    @Test public void testCase55() { runTest(55, "1", "-1", "1e100"); }
    @Test public void testCase56() { runTest(56, "0", "-1", "1"); }
    @Test public void testCase57() { runTest(57, "0", "-1", "0"); }
    @Test public void testCase58() { runTest(58, "0", "-1", "-1"); }
    @Test public void testCase59() { runTest(59, "0", "-1", "1e-100"); }
    @Test public void testCase60() { runTest(60, "0", "-1", "1e100"); }
    @Test public void testCase61() { runTest(61, "-1", "-1", "1"); }
    @Test public void testCase62() { runTest(62, "-1", "-1", "0"); }
    @Test public void testCase63() { runTest(63, "-1", "-1", "-1"); }
    @Test public void testCase64() { runTest(64, "-1", "-1", "1e-100"); }
    @Test public void testCase65() { runTest(65, "-1", "-1", "1e100"); }
    @Test public void testCase66() { runTest(66, "1e-100", "-1", "1"); }
    @Test public void testCase67() { runTest(67, "1e-100", "-1", "0"); }
    @Test public void testCase68() { runTest(68, "1e-100", "-1", "-1"); }
    @Test public void testCase69() { runTest(69, "1e-100", "-1", "1e-100"); }
    @Test public void testCase70() { runTest(70, "1e-100", "-1", "1e100"); }
    @Test public void testCase71() { runTest(71, "1e100", "-1", "1"); }
    @Test public void testCase72() { runTest(72, "1e100", "-1", "0"); }
    @Test public void testCase73() { runTest(73, "1e100", "-1", "-1"); }
    @Test public void testCase74() { runTest(74, "1e100", "-1", "1e-100"); }
    @Test public void testCase75() { runTest(75, "1e100", "-1", "1e100"); }
    @Test public void testCase76() { runTest(76, "1", "1e-100", "1"); }
    @Test public void testCase77() { runTest(77, "1", "1e-100", "0"); }
    @Test public void testCase78() { runTest(78, "1", "1e-100", "-1"); }
    @Test public void testCase79() { runTest(79, "1", "1e-100", "1e-100"); }
    @Test public void testCase80() { runTest(80, "1", "1e-100", "1e100"); }
    @Test public void testCase81() { runTest(81, "0", "1e-100", "1"); }
    @Test public void testCase82() { runTest(82, "0", "1e-100", "0"); }
    @Test public void testCase83() { runTest(83, "0", "1e-100", "-1"); }
    @Test public void testCase84() { runTest(84, "0", "1e-100", "1e-100"); }
    @Test public void testCase85() { runTest(85, "0", "1e-100", "1e100"); }
    @Test public void testCase86() { runTest(86, "-1", "1e-100", "1"); }
    @Test public void testCase87() { runTest(87, "-1", "1e-100", "0"); }
    @Test public void testCase88() { runTest(88, "-1", "1e-100", "-1"); }
    @Test public void testCase89() { runTest(89, "-1", "1e-100", "1e-100"); }
    @Test public void testCase90() { runTest(90, "-1", "1e-100", "1e100"); }
    @Test public void testCase91() { runTest(91, "1e-100", "1e-100", "1"); }
    @Test public void testCase92() { runTest(92, "1e-100", "1e-100", "0"); }
    @Test public void testCase93() { runTest(93, "1e-100", "1e-100", "-1"); }
    @Test public void testCase94() { runTest(94, "1e-100", "1e-100", "1e-100"); }
    @Test public void testCase95() { runTest(95, "1e-100", "1e-100", "1e100"); }
    @Test public void testCase96() { runTest(96, "1e100", "1e-100", "1"); }
    @Test public void testCase97() { runTest(97, "1e100", "1e-100", "0"); }
    @Test public void testCase98() { runTest(98, "1e100", "1e-100", "-1"); }
    @Test public void testCase99() { runTest(99, "1e100", "1e-100", "1e-100"); }
    @Test public void testCase100() { runTest(100, "1e100", "1e-100", "1e100"); }
    @Test public void testCase101() { runTest(101, "1", "1e100", "1"); }
    @Test public void testCase102() { runTest(102, "1", "1e100", "0"); }
    @Test public void testCase103() { runTest(103, "1", "1e100", "-1"); }
    @Test public void testCase104() { runTest(104, "1", "1e100", "1e-100"); }
    @Test public void testCase105() { runTest(105, "1", "1e100", "1e100"); }
    @Test public void testCase106() { runTest(106, "0", "1e100", "1"); }
    @Test public void testCase107() { runTest(107, "0", "1e100", "0"); }
    @Test public void testCase108() { runTest(108, "0", "1e100", "-1"); }
    @Test public void testCase109() { runTest(109, "0", "1e100", "1e-100"); }
    @Test public void testCase110() { runTest(110, "0", "1e100", "1e100"); }
    @Test public void testCase111() { runTest(111, "-1", "1e100", "1"); }
    @Test public void testCase112() { runTest(112, "-1", "1e100", "0"); }
    @Test public void testCase113() { runTest(113, "-1", "1e100", "-1"); }
    @Test public void testCase114() { runTest(114, "-1", "1e100", "1e-100"); }
    @Test public void testCase115() { runTest(115, "-1", "1e100", "1e100"); }
    @Test public void testCase116() { runTest(116, "1e-100", "1e100", "1"); }
    @Test public void testCase117() { runTest(117, "1e-100", "1e100", "0"); }
    @Test public void testCase118() { runTest(118, "1e-100", "1e100", "-1"); }
    @Test public void testCase119() { runTest(119, "1e-100", "1e100", "1e-100"); }
    @Test public void testCase120() { runTest(120, "1e-100", "1e100", "1e100"); }
    @Test public void testCase121() { runTest(121, "1e100", "1e100", "1"); }
    @Test public void testCase122() { runTest(122, "1e100", "1e100", "0"); }
    @Test public void testCase123() { runTest(123, "1e100", "1e100", "-1"); }
    @Test public void testCase124() { runTest(124, "1e100", "1e100", "1e-100"); }
    @Test public void testCase125() { runTest(125, "1e100", "1e100", "1e100"); }
    @Test public void testCase126() { runTest(126, "1", "2", "1"); }
    @Test public void testCase127() { runTest(127, "1", "2", "0"); }
    @Test public void testCase128() { runTest(128, "1", "2", "-1"); }
    @Test public void testCase129() { runTest(129, "1", "2", "1e-100"); }
    @Test public void testCase130() { runTest(130, "1", "2", "1e100"); }
    @Test public void testCase131() { runTest(131, "0", "2", "1"); }
    @Test public void testCase132() { runTest(132, "0", "2", "0"); }
    @Test public void testCase133() { runTest(133, "0", "2", "-1"); }
    @Test public void testCase134() { runTest(134, "0", "2", "1e-100"); }
    @Test public void testCase135() { runTest(135, "0", "2", "1e100"); }
    @Test public void testCase136() { runTest(136, "-1", "2", "1"); }
    @Test public void testCase137() { runTest(137, "-1", "2", "0"); }
    @Test public void testCase138() { runTest(138, "-1", "2", "-1"); }
    @Test public void testCase139() { runTest(139, "-1", "2", "1e-100"); }
    @Test public void testCase140() { runTest(140, "-1", "2", "1e100"); }
    @Test public void testCase141() { runTest(141, "1e-100", "2", "1"); }
    @Test public void testCase142() { runTest(142, "1e-100", "2", "0"); }
    @Test public void testCase143() { runTest(143, "1e-100", "2", "-1"); }
    @Test public void testCase144() { runTest(144, "1e-100", "2", "1e-100"); }
    @Test public void testCase145() { runTest(145, "1e-100", "2", "1e100"); }
    @Test public void testCase146() { runTest(146, "1e100", "2", "1"); }
    @Test public void testCase147() { runTest(147, "1e100", "2", "0"); }
    @Test public void testCase148() { runTest(148, "1e100", "2", "-1"); }
    @Test public void testCase149() { runTest(149, "1e100", "2", "1e-100"); }
    @Test public void testCase150() { runTest(150, "1e100", "2", "1e100"); }

    private String simulateMainInput(String a, String b, String c) {
        String input = a + "\n" + b + "\n" + c + "\nn\n";
        InputStream sysInBackup = System.in;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream sysOutBackup = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(output));
            org.example.Quadratic.main(new String[0]);
        } catch (Exception e) {
            String message = "Exception: " + (e.getMessage() != null ? e.getMessage() : e.toString());
            try { output.write(message.getBytes()); }
            catch (IOException ioException) { ioException.printStackTrace(); }
        } finally {
            System.setIn(sysInBackup);
            System.setOut(sysOutBackup);
        }
        return output.toString();
    }

    private boolean isExtreme(String val) {
        return val.equals("1e-100") || val.equals("1e100");
    }

    private boolean isZero(String val) {
        return val.equals("0");
    }

    private double parse(String val) {
        return Double.parseDouble(val);
    }

    private void runTest(int index, String aStr, String bStr, String cStr) {
        String output = simulateMainInput(aStr, bStr, cStr);

        output = output.replace("Welcome to org.example.Quadratic Equation Solver.", "").trim();
        output = output.replace("A quadratic equation can be written in the form ax^2 + bx + c = 0, where x is an unknown, a, b, and c are constants, and a is not zero.", "").trim();
        output = output.replace("Given values for a, b, and c, this program will produce the two roots of the equation. Both real and complex roots are supported, but not complex coefficients.", "").trim();
        output = output.replace("Press Ctrl+C to quit at any time.", "").trim();
        output = output.replace("Enter a value for 'a':", "").trim();
        output = output.replace("Enter a value for 'b':", "").trim();
        output = output.replace("Enter a value for 'c':", "").trim();
        output = output.replace("Would you like to try again? [y/n]", "").trim();
        output = output.replace("Thank you for using org.example.Quadratic Equation Solver!", "").trim();
        output = output.replaceAll("[\\r\\n]+", " ").trim();

        double a = parse(aStr), b = parse(bStr), c = parse(cStr);
        String result = "FAIL";

        try {
            if (isZero(aStr)) {
                assertTrue(output.contains("'a' cannot be zero"));
                result = "PASS";
            } else if (isExtreme(aStr) || isExtreme(bStr) || isExtreme(cStr)) {
                if (output.contains("too small") || output.contains("too large") || output.contains("Failed to find")) {
                    assertTrue(true);
                    result = "PASS";
                }
            } else {
                double discriminant = b * b - 4 * a * c;
                if (discriminant > 0) {
                    assertTrue(output.contains("x1 ="));
                    assertTrue(output.contains("x2 ="));
                    assertFalse(output.contains("i"));
                    result = "PASS";
                } else if (discriminant == 0) {
                    assertTrue(output.contains("x1 ="));
                    assertFalse(output.contains("x2 ="));
                    assertFalse(output.contains("i"));
                    result = "PASS";
                } else {
                    assertTrue(output.contains("x1 ="));
                    assertTrue(output.contains("x2 ="));
                    assertTrue(output.contains("+") && output.contains("-") && output.contains("i"));
                    result = "PASS";
                }
            }
        } catch (AssertionError e) {
            assertFalse(false);
            System.out.println("Case " + index + ": FAIL " + output);
            org.junit.Assert.fail("Assertion failed in Case " + index + ": " + output);
            return;
        }

        System.out.println("Case " + index + ": " + result + " " + output);
    }
}
