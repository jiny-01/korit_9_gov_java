// 이 파일이 속한 패키지를 정의합니다. 코드를 체계적으로 관리하기 위해 사용됩니다.
package com.korit.study.ch07;

// 필요한 기능(클래스)들을 외부에서 가져옵니다.
import java.util.Random;   // 난수(무작위 숫자)를 생성하는 기능을 가져옵니다.
import java.util.Scanner;  // 키보드 입력을 받는 기능을 가져옵니다.

// ArrayListFunction2 라는 이름의 클래스(프로그램의 본체)를 정의
public class Review {

    // 사용자가 6개의 숫자를 입력하게 하는 함수(메서드)
    public static int[] inputNums() {
        // 키보드 입력을 받기 위한 Scanner 객체를 생성
        Scanner scanner = new Scanner(System.in);
        // 사용자가 입력한 숫자들을 저장할 배열입니다. 처음에는 크기가 0
        int[] nums = new int[0];

        // 6번 반복하여 사용자로부터 숫자를 입력
        for (int i = 0; i < 6; i++) {
            // 올바른 숫자가 입력될 때까지 무한 반복
            while (true) {
                // "(i+1)번 숫자 입력: " 메시지를 화면에 출력
                System.out.print((i + 1) + "번 숫자 입력: ");
                // 사용자가 입력한 정수를 읽어와 inputValue 변수에 저장
                int inputValue = scanner.nextInt();

                // 입력된 숫자가 1보다 크고 46보다 작은지 확인 (1~45 사이인지)
                if (inputValue > 0 && inputValue < 46) {
                    // 중복된 숫자인지 확인하기 위한 변수 / 기본값은 false(중복 아님)
                    boolean isFind = false;
                    // 현재까지 입력된 숫자 배열(nums)을 처음부터 끝까지 확인
                    for (int j = 0; j < nums.length; j++) {
                        // 만약 현재 입력된 숫자가 배열에 이미 존재한다면,
                        if (nums[j] == inputValue) {
                            isFind = true; // isFind를 true(중복 찾음)로 바꾸고,
                            break;         // 중복 검사 반복문을 즉시 종료
                        }
                    }

                    // isFind가 true라면 (중복된 번호라면)
                    if (isFind) {
                        System.out.println("중복된 번호입니다.");
                        continue; // 아래 코드를 실행하지 않고 다시 while문의 처음으로 돌아가 입력을 다시
                    }

                    // --- 중복이 아닐 경우 아래 코드 실행 ---
                    // 기존 배열(nums)보다 크기가 1 더 큰 새 배열(newNums)
                    int[] newNums = new int[nums.length + 1];
                    // 기존 배열의 모든 요소를 새 배열로 복사
                    for (int j = 0; j < nums.length; j++) {
                        newNums[j] = nums[j];
                    }
                    // 새 배열의 마지막 위치에 방금 입력받은 값을 추가
                    newNums[newNums.length - 1] = inputValue;
                    // 원래 배열(nums)이 새 배열(newNums)을 가리키도록 변경 (배열 확장)
                    nums = newNums;
                    // 올바른 숫자를 입력했으므로 while(true) 무한 반복문을 빠져나감
                    break;
                }
                // 입력된 숫자가 1~45 사이가 아닐 경우 이 메시지를 출력
                System.out.println("숫자는 1 ~ 45까지만 입력할 수 있습니다.");
            }
        }

        // 6개의 숫자가 모두 담긴 배열(nums)을 반환
        return nums;
    }

    // 정수 배열을 받아서 예쁘게 출력해주는 함수(메서드)
    public static void printArray(int[] array) {
        System.out.print("[ ");
        // 배열의 모든 요소를 하나씩 순회하면서
        for (int num : array) {
            // 각 요소를 출력하고 한 칸 띄웁니다.
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    // 프로그램이 실제로 시작되는 main 함수(메서드)
    public static void main(String[] args) {
        // 난수 생성을 위한 Random 객체
        Random random = new Random();
        // 7개의 당첨 번호(보너스 번호 포함)를 저장할 배열
        int[] 당첨번호 = new int[7];

        // 당첨 번호 배열을 채우기 위해 7번 반복
        for (int i = 0; i < 당첨번호.length; i++) {
            // 중복되지 않는 번호가 뽑힐 때까지 무한 반복
            while (true) {
                // 1부터 45까지의 무작위 정수 하나. (random.nextInt(45)는 0~44를 반환)
                int 새로운랜덤번호 = random.nextInt(45) + 1;
                // 중복 여부를 확인하는 변수
                boolean isFind = false;
                // 현재까지 만들어진 당첨 번호 배열을 확인
                for (int j = 0; j < 당첨번호.length; j++) {
                    // 만약 새로 뽑은 번호가 이미 배열에 있다면,
                    if (당첨번호[j] == 새로운랜덤번호) {
                        isFind = true; // 중복이라고 표시하고,
                        break;         // 중복 검사를 멈춤
                    }
                }
                // isFind가 false라면 (중복이 아니라면)
                if (!isFind) {
                    당첨번호[i] = 새로운랜덤번호; // 배열의 현재 위치에 새 번호를 저장하고,
                    break;                  // while(true) 무한 반복문을 빠져나감.
                }
            }
        }

        // 생성된 당첨 번호를 화면에 출력
        printArray(당첨번호);

        // 사용자가 입력할 번호를 저장할 배열.
        int[] nums = new int[0];
        // 위에서 만든 inputNums() 함수를 호출하여 사용자가 입력한 6개 번호
        nums = inputNums();

        // 사용자가 입력한 번호를 화면에 출력
        printArray(nums);

        // 맞춘 번호의 개수를 저장할 변수
        int 당첨개수 = 0;
        // 보너스 번호를 맞췄는지 여부를 저장할 변수
        boolean 보너스당첨 = false;

        // 당첨 번호 배열을 처음부터 끝까지 확인
        for (int i = 0; i < 당첨번호.length; i++) {
            // 사용자가 입력한 번호 배열을 처음부터 끝까지 확인
            for (int j = 0; j < nums.length; j++) {
                // 사용자 번호와 당첨 번호가 같고, 현재 확인하는 당첨 번호가 보너스 번호가 아니라면(앞 6개 중 하나라면)
                if(nums[j] == 당첨번호[i] && i < 당첨번호.length - 1) {
                    당첨개수++; // 맞춘 개수를 1 증가시킵니다.
                    // 사용자 번호와 당첨 번호가 같고, 현재 확인하는 당첨 번호가 보너스 번호(마지막 7번째)라면
                } else if (nums[j] == 당첨번호[i]) {
                    보너스당첨 = true; // 보너스를 맞췄다고 표시
                }
            }
        }

        // 최종적으로 맞춘 개수와 보너스 당첨 여부에 따라 등수를 출력
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