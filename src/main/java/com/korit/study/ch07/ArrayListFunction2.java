package com.korit.study.ch07;

import java.util.Random;
import java.util.Scanner;

public class ArrayListFunction2 {

    public static int[] inputNums() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print((i + 1) + "번 숫자 입력: ");
                int inputValue = scanner.nextInt();
                if (inputValue > 0 && inputValue < 46) {
                    boolean isFind = false;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == inputValue) {
                            isFind = true;
                            break;
                        }
                    }

                    if (isFind) {
                        System.out.println("중복된 번호입니다.");
                        continue;
                    }

                    int[] newNums = new int[nums.length + 1];
                    for (int j = 0; j < nums.length; j++) {
                        newNums[j] = nums[j];
                    }
                    newNums[newNums.length - 1] = inputValue;
                    nums = newNums;
                    break;
                }
                System.out.println("숫자는 1 ~ 45까지만 입력할 수 있습니다.");
            }
        }

        return nums;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] 당첨번호 = new int[7];
        for (int i = 0; i < 당첨번호.length; i++) {
            while (true) {
                int 새로운랜덤번호 = random.nextInt(45) + 1;
                boolean isFind = false;
                for (int j = 0; j < 당첨번호.length; j++) {
                    if (당첨번호[j] == 새로운랜덤번호) {
                        isFind = true;
                        break;
                    }
                }
                if (!isFind) {
                    당첨번호[i] = 새로운랜덤번호;
                    break;
                }
            }
        }

        printArray(당첨번호);


        int[] nums = new int[0];
        nums = inputNums();

        printArray(nums);


        int 당첨개수 = 0;
        boolean 보너스당첨 = false;

        for (int i = 0; i < 당첨번호.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == 당첨번호[i] && i < 당첨번호.length - 1) {
                    당첨개수++;
                } else if (nums[j] == 당첨번호[i]) {
                    보너스당첨 = true;
                }
            }
        }

        if (당첨개수 == 6) {
            System.out.println("1등");
        } else if (당첨개수 == 5 && 보너스당첨) {
            System.out.println("2등");
        } else if (당첨개수 == 5) {
            System.out.println("3등");
        } else if (당첨개수 == 4) {
            System.out.println("4등");
        } else if (당첨개수 == 3) {
            System.out.println("5등");
        } else {
            System.out.println("꽝");
        }

    }

}