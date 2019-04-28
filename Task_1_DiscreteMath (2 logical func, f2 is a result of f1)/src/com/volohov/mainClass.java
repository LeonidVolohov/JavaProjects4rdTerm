package com.volohov;

/**
 * Непосредственное применение класса functionImpl.java
 */
public class mainClass {

    public static void main(String[] args) {

        System.out.println("---------------------------");
        System.out.println("  a" + " b" + " c" + " d" + "   f1" + " f2" + " f1 -> f2" + "\t");

        functionImpl operator = new functionImpl();

        for (int a = 0; a <= 1; a++) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 0; c <= 1; c++) {
                    for (int d = 0; d <= 1; d++) {

                        boolean newA = operator.intToBoolean(a);
                        boolean newB = operator.intToBoolean(b);
                        boolean newC = operator.intToBoolean(c);
                        boolean newD = operator.intToBoolean(d);

                        int newNewA = newA ? 1 : 0;
                        int newNewB = newB ? 1 : 0;
                        int newNewC = newC ? 1 : 0;
                        int newNewD = newD ? 1 : 0;

                        boolean f1, f2, implication;

                        f1 = operator.function1st(newA, newB, newC, newD);
                        f2 = operator.function2nd(newA, newB, newC, newD);
                        implication = operator.checkImplication(f1, f2);

                        System.out.println("| " + newNewA + " " + newNewB + " " + newNewC + " " + newNewD + "   " +
                                (f1 ? 1 : 0) + "  "  +(f2 ? 1 : 0) + "     " + (implication ? 1 : 0) + "    |" + "\t");
                    }
                }
            }
        }
        System.out.println("---------------------------");
    }
}
