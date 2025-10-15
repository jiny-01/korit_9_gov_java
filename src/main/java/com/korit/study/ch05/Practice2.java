package com.korit.study.ch05;

public class Practice2 {
    public static void main(String[] args) {
        //2. 배열 모든 요소의 합 구하기 {5, 10, 15, 20, 25}
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("배열 요소들의 합: " + sum);

//        int[] nums = { 5 10, 15, 20, 25 }
//        int reult = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
//        System.out.println("배열 요소들의 합: " + result);

//        int result2 = 0;
//        result2 = result2 + nums[0];
//        result2 = result2 + nums[1];
//        result2 = result2 + nums[2];
//        result2 = result2 + nums[3];
//        result2 = result2 + nums[4];

//        for (int i = 0; i < 5; i++) {
//          result2 = result2 + nums[i];
//        if (i == 4) {
//         sout("배열 요소들의 합: " + result2);
//        }
//        }


    }
}
