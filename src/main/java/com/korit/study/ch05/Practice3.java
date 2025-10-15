package com.korit.study.ch05;

public class Practice3 {
    public static void main(String[] args) {
        //3. 배열에서 최댓값 찾기 {23, 45, 12, 67, 34, 89, 11} -> 최댓값 89
        int[] nums = {23, 45, 12, 67, 34, 89, 11};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("배열의 최댓값: " + max);

        // #2)
        for (int i = 0; i < 7; i++) {
            max = nums [i] > max ? nums[i] : max;
        }
    }

}
