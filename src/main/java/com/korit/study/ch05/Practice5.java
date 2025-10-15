package com.korit.study.ch05;

public class Practice5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 1, 3, 3};
        int[] arr1 = new int[0];   //1들만 모으기
        int[] arr2 = new int[0];   //1들만 모으기
        int[] arr3 = new int[0];   //1들만 모으기
//        int[] count = new int[0];


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int[] temp = new int[arr1.length + 1];
                for (int j = 0; j < arr1.length; j++) {
                    temp[j] = arr1[j];
                }
                temp[temp.length - 1] = nums[i];
                arr1 = temp;
                System.out.println("1번 배열 만드는 과정: " + arr1[arr1.length - 1]);
            } else if (nums[i] == 2) {
                int[] temp = new int[arr2.length + 1];
                for (int j = 0; j < arr2.length; j++) {
                    temp[j] = arr2[j];
                }
                temp[temp.length - 1] = nums[i];
                arr2 = temp;
            } else if (nums[i] == 3) {
                int[] temp = new int[arr3.length + 1];
                for (int j = 0; j < arr3.length; j++) {
                    temp[j] = arr3[j];
                }
                temp[temp.length - 1] = nums[i];
                arr3 = temp;
            }
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("arr1[" + j + "]: " + arr1[j]);
            }

            for (int j = 0; j < arr2.length; j++) {
                System.out.println("arr2[" + j + "]: " + arr1[j]);
            }

            for (int j = 0; j < arr3.length; j++) {
                System.out.println("arr3[" + j + "]: " + arr1[j]);
            }

        }

    }
}
