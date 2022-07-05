package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        boolean minus = s.indexOf(" - ") != -1;
        boolean mul = s.indexOf(" * ") != -1;
        boolean div = s.indexOf(" / ") != -1;
        boolean plus = s.indexOf(" + ") != -1;
        int rs = 0;
        if(minus){
            rs = rs + runMinus(s);
        }
        if(mul){
            rs = rs + runMul(s);
        }
        if(div){
            rs = rs + rundiv(s);
        }
        if(plus) {
            rs = rs + runPlus(s);
        }
        return rs;
    }

    private static int rundiv(String s) {
        String[] sBits = s.split(" \\/ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        return no1 / no2;
    }

    private static int runMul(String s) {
        String[] sBits = s.split(" \\* ");
        System.out.println("sBits = " + sBits);
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        return no1 * no2;
    }

    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }
}