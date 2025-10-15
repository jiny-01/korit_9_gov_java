package com.korit.study.ch05;

public class Practice4 {
    public static void main(String[] args) {
        //4. 배열의 짝수만 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        // #1)
        int[] evens = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < evens.length; i++) {
            if (evens[i] % 2 == 0) {
                System.out.println(evens[i] + ": 짝수");
            }
        }


        //#2)
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(" " + nums[i]);
            }
        }

        // #3) 배열 새로 만들어서
//        int[] evens = new int[0];  //공간이 없으므로 밑에서 크기 지정해서 새 공간을 만들어줌
//
//        for (int i = 0; i < evens.length; i++) {
//            if (nums[i] % 2 == 0) {
//                int[] temp = new int[evens.length + 1]; 새로운 걸 하나 만들어줌
//                for (int j = 0; j <evens.length ; j++) {   //기존에 방을 이동시켜줌
//                    int[] temp;
//                    temp[j] = evens[j];
//                }
//                  evens = new int[2];
//                  규칙 : evens = new int[evens.length + 1];
//                        새로 만드는 배열은 기존 배열의 길이 + 1;
//                evens[0] = nums[i];    -> 현재 evens 의 배열 크기는 0 이므로 nums[i] 못넣음
//





            }
        }

//        evens = new int[1];
//        evens = new int[2];
//                  규칙 : evens = new int[evens.length + 1];
//                        새로 만드는 배열은 기존 배열의 길이 + 1;
//                evens[0] = nums[i];    -> 현재 evens 의 배열 크기는 0 이므로 nums[i] 못넣음
//
//                int[] temp = new int[evens.length + 1]; 새로운 걸 하나 만들어줌
//                주소를 임시 보관하기 위함 -> temp : 기존의 주소를 가리킬 방법이 없어지면 값을 못 옮기므로
//                                                새로운 걸 임시로 하나 만들어 임시저장해두는 목적
//
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] evens = new int[0];
//
//        for (int i = 0; i < evens.length; i++) {
//            if (nums[i] % 2 == 0) {
//
//            }
//                int[]temp = new int[evens.length + 1];
//                for (int j = 0; j < evens.length; j++) {
//                    temp[j] = evens[i];
//
//                }
//        }
//
//        //만약 , 이런 식으로 한다면 마지막에 들어간 짝수를 찾는 방식
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                int even = nums[i];
//                evens = new int[1];  //1개짜리 방 만듦
//                evens[0] = even;
//            }
//
//        }
//
//        //최종
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                int[] temp = new int[evens.length + 1];
//                for (int j = 0; j < evens.length; j++) {
//                    temp[j] = evens[j];
//
//                }
//                temp[temp.length - 1] = nums[i];
//                evens = temp;
//            }
//
//        }

//            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int[] evens = new int[0];
//
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] % 2 == 0) {
//                    int[] temp = new int[evens.length + 1];
//                    for (int j = 0; j < evens.length; j++) {
//                        temp[j] = evens[j];
//                    }
//                    temp[temp.length - 1] = nums[i];
//                    evens = temp;
//                }
//            }
//
//
//    }
//}
