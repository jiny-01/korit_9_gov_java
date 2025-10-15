package com.korit.study.ch05;

public class Array02 {
    public static void main(String[] args) {
        int [][] nums = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[] num2 = nums[1];
        int num = num2[1];
        System.out.println(nums[1][1]);

        int num3 = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }[1][1];
        //배열의 주소 => 5
        int[] num4 = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}[1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
