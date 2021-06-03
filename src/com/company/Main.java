package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(abc(128));
    }

    public static String abc(int n) {
        int a = n;
        int[] ints = new int[10];
        while (n > 1) {
            for (int i = 1; i < ints.length; i++) {
                if (n == 1) {
                    break;
                }
                if (n % (i + 1 ) == 0) {
                    n = n / (i + 1);
                    ints[i]++;
                    i = 0;
                }
            }
        }
        String s = "n = " + a + " = ";
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 1) {
                s = s + "(" + (i + 1) + "**" + ints[i] + ")";
            } else if (ints[i] == 1) {
                s = s + "(" + (i + 1) + ")";
            }
        }
        return s;
    }
}
