package com.korit.study.ch18;

public class 다형성 {
    public static void main(String[] args) {
        전원[] 전원들 = new 전원[2];
        전원들[0] = new 컴퓨터(20);    //업캐스팅
        전원들[1] = new 조명(10);

        for (전원 p : 전원들) {
            p.켠다();
        }

        for (전원 p : 전원들) {
            p.끈다();
        }

        for (전원 p : 전원들) {
            System.out.println(((전자기기) p).get전압());    //get전압이 전자기기에 있으므로 전원 -> 전자기기 다운캐스팅
            //참조 연산이 우선순위 가장 높으니 주의
        }

        //instance : 메모리에 할당된 생성된 객체
        //조건에 맞는 걸로 다운캐스팅
        for (전원 p : 전원들) {
            if (p instanceof 컴퓨터) {
                ((컴퓨터) p).바이오스부팅();
            } else if (p instanceof 조명) {
                ((조명) p).조명교체필요();
            }
        }


    }
}
