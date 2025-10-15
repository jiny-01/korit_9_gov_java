package com.korit.study.ch02;

//public class Practice01 {
//    public static void main(String[] args) {
//    // 테스트 케이스 1
//    int baseSalary = 4000000;    // 기본급
//    int workYears = 12;          // 근무년수
//    int position = 3;            // 직급코드 (1:사원, 2:대리, 3:과장, 4:부장)
//    int overtimeHours = 15;      // 야근시간

// 테스트 케이스 2 (추가로 테스트해볼 값들)
// int baseSalary = 3500000, workYears = 18, position = 4, overtimeHours = 8;
// int baseSalary = 2800000, workYears = 5, position = 2, overtimeHours = 25;


/*
* ### **계산 로직**
1. **직급수당**: 사원(0), 대리(50만), 과장(100만), 부장(200만)
2. **연차수당**: 3년 미만(0%), 3-7년(5%), 7-15년(10%), 15년 이상(20%)
3. **야근수당**: 10시간 이하(시간당 1만원), 초과시(시간당 1.5만원)
4. **세금**: 총급여 500만원 이하(10%), 초과시(15%)
5. **특별보너스**: 부장이면서 15년 이상 근무시 50만원 추가
* */

/*
=== 급여 명세서 ===
기본급: 4,000,000원
직급: 과장
직급수당: 1,000,000원
연차수당: 400,000원 (10%)
야근수당: 175,000원 (기본 10시간 + 초과 5시간)
특별보너스: 0원
총 지급액: 5,575,000원
세금(15%): 836,250원
실수령액: 4,738,750원
*/

//        // 테스트 데이터
//        int baseSalary = 4000000;
//        int workYears = 12;
//        int position = 3;
//        int overtimeHours = 15;
//
//        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
//        // 직급수당 계산
//        int positionAllowance = (position == 1 ? 0 :
//                        position == 2 ? 500000 :
//                        position == 3 ? 1000000 :
//                        position == 4 ? 2000000 : 0);
//                        //조건에 예외(찾지못함) 일 땐 0보단 -1 로 오류데이터 명시
//        System.out.println("직급수당:" + positionAllowance);
//
//        // 연차수당 계산 (기본급 기준 %)
//        double yearsRate =  workYears < 3 ? 0.0 :
//                            workYears < 7 ? 0.1 :   //이미 앞쪽에서 3보다 작은 건 걸러지므로
//                            workYears < 15 ? 0.1 :  //3이상 7 미만 => 7미만 조건만
//                            workYears > 15 ? 0.2: -1;
//        //삼항연산자보다 캐스팅의 우선순위가 빠르기 때문에 전체 묶어서 형변환
//        double yearAllowance = (workYears < 3) ? 0 :
//                (workYears < 7) ? baseSalary * 0.5:
//
//        System.out.println("연차수당: " + yearAllowance);
//
//        // 야근수당 계산
//        boolean isOverTime = overtimeHours - 15 > 0;
//        int overtimePayment = isOverTime ? 10 : overtimeHours;
//        int overTime = isOverTime ? overtimeHours - 10 : 0;
//        int overTimePayment =
//                overtimeHours * 10000 :
//                (10 * 10000) + ((overtimeHours - 10) * 15000);
//
//        // 특별보너스 계산
//        int specialBonus = (position == 4 && workYears > 14) ? 500000 : 0;
//
//        // 총 지급액 계산
//        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;
//
//        double taxRate = totalSalary <= 5000000 > 0.1 : 0.15;
//
//        // 세금 계산
//        int tax = (int) (totalSalary <= 5000000 ? totalSalary * 0.1 : totalSalary * 1.5);
//
//        // 실수령액 계산
//        int finalSalary = totalSalary - tax;
//
//
//
//        // 직급명 출력용
//        String positionName = position == 1 ? "사원" :
//                    position == 2 ? "대리":
//                    position == 3 ? "과장":
//                    position == 4 ? "부장" : "미지정";
//
//        // 결과 출력
//        System.out.println("=== 급여 명세서 ===");
//        System.out.println("기본급: " + String.format("%,d ---> %d", baseSalary) + "원");
//        System.out.println("직급: " + positionName);
//        System.out.println("직급수당: " + String.format("연차수다이 %, d원", yearAllowance));
//        System.out.println("야근 수당: %,d원 (기본 %d시간 + 초과 %d시간)\n", overtimePayment, baseOvertime, overTime);
//        System.out.println("특별보너싀 " + String.format("%,d", specialBonus) + "원");
//        //, 주면 숫자는 3자리씩 알아서 끊어줌  %,d : 3자리씩 끊어줌   %d: 그냥 숫자만
//        // 나머지 출력 구현
//    }
//    }
//}
