package com.korit.study.ch08;

public class Array02 {
    public static void main(String[] args) {

        // 배열 실습
        String[] 사원ID배열 = new String[] {"E1001", "E1002", "E1003", "E1004"};
        String[] 이름배열 = new String[] {"김민준", "이서연", "박지훈", "최예나"};
        String[] 부서배열 = new String[] {"영업팀", "마케팅팀", "개발팀", "인사팀"};
        String[] 직급배열 = new String[] {"사원", "대리", "과장", "차장"};

        printInfo(사원ID배열, 이름배열, 부서배열, 직급배열, 0);   //index: 출력하고자 하는 인덱스의 번호
        //결과-> 사원ID: E1001 이름: 김민준 부서: 영업팀 직급: 사원


        // foundIndex 에 "박지훈" 의 인덱스 번호(2)를 담기
        // for문 열어서 인덱스 번호를 만들어주기
        // 반복의 조건 생각 - 반복 횟수, 탐색에 대한 조건
        // 배열 1~마지막을 반복 => 배열명.length 번 반복
        // 선형 탐색 시,
        // 하나의 데이터를 찾을 때는 무조건 break 걸어줘야함


        //ex) {a, b, b, a}
        //cf) indexOf(a) : 찾는 값의 인덱스 번호 - 순방향   => [0]
        // lastIndexOf(a) : 배열의 역순으로 찾은 인덱스 값  => [0]
        String name = "박지훈";
        int foundIndex = -1;

        for (int i = 0; i < 이름배열.length; i++) {    // 반복횟수
            if (이름배열[i] == name) {                 //탐색에 대한 조건 = (이름배열[i].equals(name)) 의 의미
                foundIndex = i;                      // 탐색한 값 저장 - 여기선 index 저장한 것
                break;                               //찾는 값 하나일 땐 무조건 break 필요
            }
        }
        System.out.println("찾은 인덱스: " + foundIndex);



    }


    public static void printInfo(
            String[] 사원ID배열,
            String[] 이름배열,
            String[] 부서배열,
            String[] 직급배열,
            int index) {
        System.out.printf("""
                사원ID: %s
                이름: %s
                부서: %s
                직급: %s
                """, 사원ID배열[index], 이름배열[index], 부서배열[index], 직급배열[index]);


//============================== printf 와 String.format 차이 ==========================================
        System.out.println("사원ID: " + 사원ID배열[index] + "\n이름: " + 이름배열[index] + "\n부서: " + 부서배열[index]);

        // String.format(); => 함수 호출, 리턴값 String
        // System.out.println(); => void 리턴값 없음
        // System.out.printf(); => 리턴값 printStream (String 과 다름) / 출력만을 위한 포맷팅을 할 때
        // System.out.print(String.format()); -> 문자열을 만들어내기 위함 - 변수에 저장 가능
        //이렇게 변수에 저장할 수 있음
        String text = String.format("""
                사원ID: %s
                이름: %s
                부서: %s
                직급: %s
                """, 사원ID배열[index], 이름배열[index], 부서배열[index], 직급배열[index]);
    }

}
