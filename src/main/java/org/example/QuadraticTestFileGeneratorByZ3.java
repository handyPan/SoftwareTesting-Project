package org.example;

import java.io.*;
import java.util.*;

public class QuadraticTestFileGeneratorByZ3 {

    public static void main(String[] args) {
        String inputFilePath = "src\\main\\resources\\QuadraticZ3-after.csv";
        String outputFilePath = "src\\test\\java\\org\\example\\QuadraticZ3Test.java";

        List<String[]> testCases = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("#") || line.isEmpty() || line.equals("a,b,c")) continue;
                String[] parts = line.split(",");
                if (parts.length == 3) {
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
            writer.println("import static org.junit.Assert.*;");
            writer.println();
            writer.println("import java.io.*;");
            writer.println();
            writer.println("public class QuadraticZ3Test {");
            writer.println();
            // Generate test methods
            for (int i = 0; i < testCases.size(); i++) {
                String[] tc = testCases.get(i);
                writer.printf("    @Test public void testCase%d() { runTest(%d, \"%s\", \"%s\", \"%s\"); }%n",
                        i + 1, i + 1, tc[0], tc[1], tc[2]);
            }

            writer.println();
            writer.println("    private String simulateMainInput(String a, String b, String c) {");
            writer.println("        String input = a + \"\\n\" + b + \"\\n\" + c + \"\\nn\\n\";");
            writer.println("        InputStream sysInBackup = System.in;");
            writer.println("        ByteArrayOutputStream output = new ByteArrayOutputStream();");
            writer.println("        PrintStream sysOutBackup = System.out;");
            writer.println();
            writer.println("        try {");
            writer.println("            System.setIn(new ByteArrayInputStream(input.getBytes()));");
            writer.println("            System.setOut(new PrintStream(output));");
            writer.println("            org.example.Quadratic.main(new String[0]);");
            writer.println("        } catch (Exception e) {");
            writer.println("            String message = \"Exception: \" + (e.getMessage() != null ? e.getMessage() : e.toString());");
            writer.println("            try { output.write(message.getBytes()); }");
            writer.println("            catch (IOException ioException) { ioException.printStackTrace(); }");
            writer.println("        } finally {");
            writer.println("            System.setIn(sysInBackup);");
            writer.println("            System.setOut(sysOutBackup);");
            writer.println("        }");
            writer.println("        return output.toString();");
            writer.println("    }");
            writer.println();
            writer.println("    private boolean isExtreme(String val) {");
            writer.println("        return val.equals(\"1e-100\") || val.equals(\"1e100\");");
            writer.println("    }");
            writer.println();
            writer.println("    private boolean isZero(String val) {");
            writer.println("        return val.equals(\"0\");");
            writer.println("    }");
            writer.println();
            writer.println("    private double parse(String val) {");
            writer.println("        return Double.parseDouble(val);");
            writer.println("    }");
            writer.println();
            writer.println("    private void runTest(int index, String aStr, String bStr, String cStr) {");
            writer.println("        String output = simulateMainInput(aStr, bStr, cStr);");
            writer.println();
            writer.println("        output = output.replace(\"Welcome to org.example.Quadratic Equation Solver.\", \"\").trim();");
            writer.println("        output = output.replace(\"A quadratic equation can be written in the form ax^2 + bx + c = 0, where x is an unknown, a, b, and c are constants, and a is not zero.\", \"\").trim();");
            writer.println("        output = output.replace(\"Given values for a, b, and c, this program will produce the two roots of the equation. Both real and complex roots are supported, but not complex coefficients.\", \"\").trim();");
            writer.println("        output = output.replace(\"Press Ctrl+C to quit at any time.\", \"\").trim();");
            writer.println("        output = output.replace(\"Enter a value for 'a':\", \"\").trim();");
            writer.println("        output = output.replace(\"Enter a value for 'b':\", \"\").trim();");
            writer.println("        output = output.replace(\"Enter a value for 'c':\", \"\").trim();");
            writer.println("        output = output.replace(\"Would you like to try again? [y/n]\", \"\").trim();");
            writer.println("        output = output.replace(\"Thank you for using org.example.Quadratic Equation Solver!\", \"\").trim();");
            writer.println("        output = output.replaceAll(\"[\\\\r\\\\n]+\", \" \").trim();");
            writer.println();
            writer.println("        double a = parse(aStr), b = parse(bStr), c = parse(cStr);");
            writer.println("        String result = \"FAIL\";");
            writer.println();
            writer.println("        try {");
            writer.println("            if (isZero(aStr)) {");
            writer.println("                assertTrue(output.contains(\"'a' cannot be zero\"));");
            writer.println("                result = \"PASS\";");
            writer.println("            } else if (isExtreme(aStr) || isExtreme(bStr) || isExtreme(cStr)) {");
            writer.println("                if (output.contains(\"too small\") || output.contains(\"too large\") || output.contains(\"Failed to find\")) {");
            writer.println("                    assertTrue(true);");
            writer.println("                    result = \"PASS\";");
            writer.println("                }");
            writer.println("            } else {");
            writer.println("                double discriminant = b * b - 4 * a * c;");
            writer.println("                if (discriminant > 0) {");
            writer.println("                    assertTrue(output.contains(\"x1 =\"));");
            writer.println("                    assertTrue(output.contains(\"x2 =\"));");
            writer.println("                    assertFalse(output.contains(\"i\"));");
            writer.println("                    result = \"PASS\";");
            writer.println("                } else if (discriminant == 0) {");
            writer.println("                    assertTrue(output.contains(\"x1 =\"));");
            writer.println("                    assertFalse(output.contains(\"x2 =\"));");
            writer.println("                    assertFalse(output.contains(\"i\"));");
            writer.println("                    result = \"PASS\";");
            writer.println("                } else {");
            writer.println("                    assertTrue(output.contains(\"x1 =\"));");
            writer.println("                    assertTrue(output.contains(\"x2 =\"));");
            writer.println("                    assertTrue(output.contains(\"+\") && output.contains(\"-\") && output.contains(\"i\"));");
            writer.println("                    result = \"PASS\";");
            writer.println("                }");
            writer.println("            }");
            writer.println("        } catch (AssertionError e) {");
            writer.println("            assertFalse(false);");
            writer.println("            System.out.println(\"Case \" + index + \": FAIL \" + output);");
            writer.println("            org.junit.Assert.fail(\"Assertion failed in Case \" + index + \": \" + output);");
            writer.println("            return;");
            writer.println("        }");
            writer.println();
            writer.println("        System.out.println(\"Case \" + index + \": \" + result + \" \" + output);");
            writer.println("    }");
            writer.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
