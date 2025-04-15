package org.example;

import com.microsoft.z3.*;
import java.io.FileWriter;
import java.io.IOException;

public class QuadraticTestCaseGeneratorByZ3 {

    public static void main(String[] args) {
        try (Context ctx = new Context(); FileWriter writer = new FileWriter("src\\main\\resources\\QuadraticZ3.csv")) {
            writer.write("a,b,c\n");

            int testCasesPerType = 3;

            // Case: All zero coefficients (not a valid quadratic or linear)
            generateCases(ctx, writer, testCasesPerType, "coefficientsAllZero",
                            ctx.mkAnd(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0")),
                                        ctx.mkEq(ctx.mkRealConst("b"), ctx.mkReal("0")),
                                        ctx.mkEq(ctx.mkRealConst("c"), ctx.mkReal("0"))));
            // Case: a == 0
            generateCases(ctx, writer, testCasesPerType, "aEqualsZero",
                    ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0")));

            // Case: b == 0
            generateCases(ctx, writer, testCasesPerType, "bEqualsZero",
                    ctx.mkEq(ctx.mkRealConst("b"), ctx.mkReal("0")));

            // Case: c == 0
            generateCases(ctx, writer, testCasesPerType, "cEqualsZero",
                    ctx.mkEq(ctx.mkRealConst("c"), ctx.mkReal("0")));

            // Case: large coefficients
            generateCases(ctx, writer, testCasesPerType, "largeCoefficients",
                    ctx.mkAnd(ctx.mkGt(ctx.mkRealConst("a"), ctx.mkReal("1e9")),
                                ctx.mkGt(ctx.mkRealConst("b"), ctx.mkReal("1e9")),
                                ctx.mkGt(ctx.mkRealConst("c"), ctx.mkReal("1e9"))));

            // Case: two real roots, b^2 - 4ac > 0
            generateCases(ctx, writer, testCasesPerType, "twoRealRoots",
                    ctx.mkAnd(ctx.mkNot(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0"))),
                            ctx.mkGt(ctx.mkSub(ctx.mkMul(ctx.mkRealConst("b"), ctx.mkRealConst("b")),
                                    ctx.mkMul(ctx.mkReal(4), ctx.mkRealConst("a"), ctx.mkRealConst("c"))), ctx.mkReal("0"))));

            // Case: one real root, b^2 - 4ac = 0
            generateCases(ctx, writer, testCasesPerType, "twoRealRoots",
                    ctx.mkAnd(ctx.mkNot(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0"))),
                            ctx.mkEq(ctx.mkSub(ctx.mkMul(ctx.mkRealConst("b"), ctx.mkRealConst("b")),
                                    ctx.mkMul(ctx.mkReal(4), ctx.mkRealConst("a"), ctx.mkRealConst("c"))), ctx.mkReal("0"))));

            // Case: two complex roots, b^2 - 4ac < 0
            generateCases(ctx, writer, testCasesPerType, "twoRealRoots",
                    ctx.mkAnd(ctx.mkNot(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0"))),
                            ctx.mkLt(ctx.mkSub(ctx.mkMul(ctx.mkRealConst("b"), ctx.mkRealConst("b")),
                                    ctx.mkMul(ctx.mkReal(4), ctx.mkRealConst("a"), ctx.mkRealConst("c"))), ctx.mkReal("0"))));

            // Case: subtractive cancellation (b² >> 4ac)
            generateCases(ctx, writer, testCasesPerType, "subtractiveCancellation",
                    ctx.mkAnd(ctx.mkNot(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0"))),
                            ctx.mkGt(ctx.mkMul(ctx.mkRealConst("b"), ctx.mkRealConst("b")),
                                        ctx.mkMul(ctx.mkReal("1e8"), ctx.mkRealConst("a"), ctx.mkRealConst("c")))));

            // Case: b != 0, ac = 0
            generateCases(ctx, writer, testCasesPerType, "bIsNotZEROacIsZero",
                    ctx.mkAnd(ctx.mkNot(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0"))),
                            ctx.mkNot(ctx.mkEq(ctx.mkRealConst("b"), ctx.mkReal("0"))),
                            ctx.mkEq(ctx.mkMul(ctx.mkRealConst("a"), ctx.mkRealConst("c")), ctx.mkReal("0"))));

            // Case: Extreme Small Discriminant
            generateCases(ctx, writer, testCasesPerType, "extremeSmallDiscriminant",
                    ctx.mkAnd(ctx.mkNot(ctx.mkEq(ctx.mkRealConst("a"), ctx.mkReal("0"))),
                            ctx.mkLt(ctx.mkSub(ctx.mkMul(ctx.mkRealConst("b"), ctx.mkRealConst("b")),
                                                ctx.mkMul(ctx.mkReal(4), ctx.mkRealConst("a"), ctx.mkRealConst("c"))),
                                    ctx.mkReal("1e-8")),
                            ctx.mkGt(ctx.mkSub(ctx.mkMul(ctx.mkRealConst("b"), ctx.mkRealConst("b")),
                                                ctx.mkMul(ctx.mkReal(4), ctx.mkRealConst("a"), ctx.mkRealConst("c"))),
                                    ctx.mkReal("0"))));

            generateEdgeCases(writer);

            System.out.println("CSV content written to src\\main\\resources\\QuadraticZ3.csv");

        } catch (IOException | Z3Exception e) {
            e.printStackTrace();
        }
    }

    private static void generateCases(Context ctx, FileWriter writer, int count, String label, BoolExpr constraint)
            throws IOException {
        for (int i = 0; i < count; i++) {
            Solver solver = ctx.mkSolver();

            RealExpr a = ctx.mkRealConst("a");
            RealExpr b = ctx.mkRealConst("b");
            RealExpr c = ctx.mkRealConst("c");

            // Bound variables to reasonable ranges
            solver.add(ctx.mkAnd(
                    ctx.mkGe(a, ctx.mkReal("-1e308")), ctx.mkLe(a, ctx.mkReal("1e308")),
                    ctx.mkGe(b, ctx.mkReal("-1e308")), ctx.mkLe(b, ctx.mkReal("1e308")),
                    ctx.mkGe(c, ctx.mkReal("-1e308")), ctx.mkLe(c, ctx.mkReal("1e308"))
            ));

            // Apply root condition
            solver.add(constraint);

            // For all cases except linear, ensure a ≠ 0
            if (!label.equals("LINEAR")) {
                solver.add(ctx.mkNot(ctx.mkEq(a, ctx.mkReal("0"))));
            }

            if (solver.check() == Status.SATISFIABLE) {
                Model model = solver.getModel();
                String aVal = model.eval(a, false).toString();
                String bVal = model.eval(b, false).toString();
                String cVal = model.eval(c, false).toString();
                writer.write(aVal + "," + bVal + "," + cVal + "\n");
            }
        }
    }

    private static void generateEdgeCases(FileWriter writer) throws IOException {
        String[] values = { "-1", "0", "1", "1e-100", "1e100", "-1e-100", "-1e100" };

        for (String a : values) {
            for (String b : values) {
                for (String c : values) {
                    writer.write(a + "," + b + "," + c + "\n");
                }
            }
        }
    }
}
