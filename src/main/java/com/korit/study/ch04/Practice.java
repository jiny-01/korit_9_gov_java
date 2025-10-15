package com.korit.study.ch04;

public class Practice {
    public static void main(String[] args) {

        //1. 정수형 배열 {10, 20, 30, 40, 50} 한 줄에 하나씩 출력
        int[] nums = {10, 20, 30, 40, 50};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

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


        //3. 배열에서 최댓값 찾기 {23, 45, 12, 67, 34, 89, 11} -> 최댓값 89
        int[] maxList = {23, 45, 12, 67, 34, 89, 11};
        int max = maxList[0];
        for (int i = 1; i < maxList.length; i++) {
            if (maxList[i] > max) {
                max = maxList[i];
            }
        }
        System.out.println("배열의 최댓값: " + max);

        //4. 배열의 짝수만 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        int[] evens = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < evens.length; i++) {
            if (evens[i] % 2 == 0) {
                System.out.println(evens[i] + ": 짝수");
            }
        }

        //5. 배열 역순으로 출력 {1, 2, 3, 4, 5}
        int[] numlist = {1, 2, 3, 4, 5};
        for (int i = numlist.length - 1; i >= 0; i--) {
            System.out.println(numlist[i]);
        }

        //6. 특정 값 개수 세기 {3, 7, 3, 9, 3, 1, 3, 5}
        int[] count = {3, 7, 3, 9, 3, 1, 3, 5};
        int target = 3;
        int cnt = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == target) {
                cnt++;
            }
        }
        System.out.println(target + "의 개수: " + cnt);

        //7. 배열의 평균 {80, 90, 75, 85, 95}
        int[] nList = {80, 90, 75, 85, 95};
        int totalSum = 0;
        for (int i = 0; i < nList.length; i++) {
            totalSum += nList[i];
        }
        double listAvg = (double) totalSum / nList.length;
        System.out.println("평균: " + listAvg);

        //8. 두 배열의 합 만들기
        //같은 인덱스의 요소를 더한 새로운 배열
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arrSum = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] = arr1[i] + arr2[i];
            System.out.println(arr1[i] + " + " + arr2[i] + " = " + arrSum[i]);
        }

        System.out.print("합 배열: ");
        for (int i = 0; i < arrSum.length; i++) {
            System.out.print(arrSum[i] + " ");
        }

        //9. 배열에서 최소/최대 찾기
                int[] minMax = {45, 23, 67, 12, 89, 34, 78};

                int min = minMax[0];
                int max2 = minMax[0];

                for (int i = 0; i < minMax.length; i++) {
                    if (minMax[i] < min) {
                        min = minMax[i];
                    }
                    if (minMax[i] > max2) {
                        max2 =  minMax[i];
                    }
                }

                System.out.println("최솟값: " + min);
                System.out.println("최댓값: " + max2);


        //10. 성적 등급 매기기 {85, 92, 78, 96, 88, 73, 99, 82}
        // 출력 - "학생 1: 85점 - B등급"

        int[] scores = {85, 92, 78, 96, 88, 73, 99, 82};
        for (int i = 0; i < scores.length; i++) {
            String grade;
            if (scores[i] >= 90){
                grade = "A등급";
            } else if (scores[i] >= 80) {
                grade = "B등급";
            } else if (scores[i] >= 70) {
                grade = "C등급";
            } else {
                grade = "D등급";
            }

            System.out.println("학생" + (i + 1) + ":" + scores[i] + "점" + "-" + grade);
        }
    }
}
