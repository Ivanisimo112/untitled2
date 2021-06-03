package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(abc(31223808));
    }

    public static String abc(int n) {
        int[] numbers = new int[0];
        int[] power = new int[0];
        while (n > 1) {
            int smallerNumberByWhichToDivide = smallerNumberByWhichToDivide(n);
            n = n / smallerNumberByWhichToDivide;
            int cellNumber = cellNumber(numbers, smallerNumberByWhichToDivide);
            if (cellNumber == -1) {
                numbers = addItem(numbers, smallerNumberByWhichToDivide);
                power = addItem(power, 1);
            } else {
                power[cellNumber]++;
            }
        }

        String s = "n = " + n + " = ";
        for (int i = 0; i < numbers.length; i++) {
            if (power[i] > 1) {
                s = s + "(" + (numbers[i]) + "**" + power[i] + ")";
            } else if (power[i] == 1) {
                s = s + "(" + (numbers[i]) + ")";
            }
        }
        return s;
    }

    private static int[] addItem(int[] ints, int newNumb) {
        int[] temp = new int[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            temp[i] = ints[i];
        }
        temp[temp.length - 1] = newNumb;
        return temp;
    }

    private static int smallerNumberByWhichToDivide(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    private static int cellNumber(int[] ints, int n) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
