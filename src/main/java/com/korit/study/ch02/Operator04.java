package com.korit.study.ch02;

//관계 연산자
public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int n = 10;
        //연산의 순서가 중요한 이유
        boolean r = (n >= 5 && n <= 15);  //5~15 사이면 n의 값이 true;
        System.out.println(r);

        a = 10;
        b = 10;
        System.out.println("a" == "b");
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println('a' == 'a');

        int 키 = 170;
        int 몸무게 = 65;

//        double result = 170 / 100;
//        double BMI = 65 / (result * result);          //키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
//        double BMI = 몸무게 / ((키/100.0)*(키/100.0));

        double BMI = (double) (몸무게 / ((키/100.0) * (키/100.0)));
        System.out.println(BMI);
        boolean 저체중 = BMI < 18.5;                       //18.5 미만
        boolean 정상 = BMI >= 18.5 && BMI < 25;            //18.5에서 24.9사이
        boolean 과체중 = BMI >= 25 && BMI < 30;            //25에서 29.9사이
        boolean 비만 = BMI >= 30;                          //30 이상

        /*
        * 정수끼리 대소비교는 초과/미만 권장
        * 소수가 들어간다면 이상, 미만*/
        //기준 데이터는 항상 오른쪽 / 변수는 왼족
        System.out.println("저체중: " + 저체중);
        System.out.println("정상: " + 정상);
        System.out.println("과체중: " + 과체중);
        System.out.println("비만: " + 비만);


        System.out.println((double) 키/100);  //키가 double 로 먼저 업캐스팅 -> 캐스팅이 연산보다 먼저 일어남
        System.out.println(키/100.0);


//      급여 계산(근로기준법 총근로시간 40시간, 나머지는 시간외 근무시간)
        System.out.println("+++++++++++++급여계산하기++++++++++++");
        int 기본급 = 2400000;
        int 기준근로시간 = 40 * 4;
        int 근무시간 = 52 * 4;
        int 시급 = 기본급 / 기준근로시간;
        System.out.println("시급: " + 시급);

        int 초과근무시간 = 근무시간 - 기준근로시간;
        int 시간외수당 = (int)(초과근무시간 * 시급 * 1.5);
        System.out.println("시간외수당: " + 시간외수당);

        int 총급여 = (int)(기본급 + (double)(시간외수당));  //기본급 + (시간외 수당 * 1.5배)
        int 세금 = (int)(총급여 * 0.1);    //총급여의 10%
        int 지급급여 = 총급여 - 세금;  //총급여 - 세금

        System.out.println("총급여: " + 총급여);
        System.out.println("세금: " + 세금);
        System.out.println("지급급여: " + 지급급여);

        //급여 계산 풀이
//        int 기본급 = 2400000;
//        int 근무시간 = 52 8 4;
//        int 시급 = 2400000 / 160;
//        System.out.println(시급);
//        int 시간외수당 = (int) (시급 * 1.5 * 48);
//        int 총급여 = 기본급 + 시간외수당;



    }
}
