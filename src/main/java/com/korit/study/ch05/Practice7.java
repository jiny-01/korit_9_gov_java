package com.korit.study.ch05;

public class Practice7 {
    public static void main(String[] args) {
        int[] 기본급 = {10000, 20000, 30000};
        double 세율 = 0.15;
        int[] 지급액 = new int[3];

        for (int i = 0; i < 기본급.length; i++) {
            double 세금 = 기본급[i] * 세율;
            int 실수령액 = (int) (기본급[i] - 세금);
            지급액[i] = 실수령액;

//            지급액[i]= (int)(기본급[i] - (기본급[i] * 세율));
//            System.out.println(지급액[i]);
        }

        for (int i = 0; i < 지급액.length; i++) {
            System.out.println(지급액[i]);
        }


    }
}
