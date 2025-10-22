package com.korit.study.ch24;

public class Age {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 10;
        int e = 8;

        double result = ((((a + b * c) - (d / (double)c)) * (e - b)) / (a - c)) + ((d - e) + (b * c)) / 2.0;
        result = (result * 2 - (b + c)) / 2 + (a * c) - (d / (double)e);
        System.out.println(result);
    }
}
