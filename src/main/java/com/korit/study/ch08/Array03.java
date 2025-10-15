package com.korit.study.ch08;

public class Array03 {
    public static void main(String[] args) {
        int[] nums = {15, 23, 7, 30, 4, 18};
        int 탐색횟수 = 0;
        int 찾은인덱스 = 0;

        // 30을 찾기 위한 탐색 시도가 몇 번 있었는지와 30의 인덱스 위치를 출력하시오.
        for (int i = 0; i < nums.length; i++) {
            탐색횟수++;
            if (nums[i] == 30) {
                찾은인덱스 = i;
                break;
            }
        }
        System.out.println("탐색횟수 : " + 탐색횟수);
        System.out.println("30의 인덱스 : " + 찾은인덱스);

        //ex) nums 배열에서 중간값을 찾으라고 하면
        // 개수가 짝수일 땐 중간값 2개일건데 무조건 앞에 값임
        // 길이 / 2 - 1  : 인덱스는 0부터 시작이기 때문



    }
}
