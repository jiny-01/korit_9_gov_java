package com.korit.study.ch23;

public class GenericMain {
    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열 데이터");   //문자열
        NonGeneric b = new NonGeneric(10);  //숫자
        NonGeneric c = new NonGeneric(new NonGeneric(null));  //객체 생성
        NonGeneric d = new NonGeneric(a);  //객체
        //Object 로 전부 업캐스팅시켜버리면 최상위 (부모)가 Object 로 본다는 것인데
        // 그러면 하위 자료형들의 특성을 다 무시해버림 ex) 메서드, 기능...
        NonGeneric[] arr = {a, b, c, d};
        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String data) {  //data : 지역변수
//                String data = (String) n.getData();
                System.out.println(data);
            } else if (n.getData() instanceof NonGeneric data) {
                System.out.println(data.getData());
            }
        }

        //generic 적용방법 - <> 명시 안해주면 Object
        Generic<String, Integer> e = new Generic<>("문자열 데이터", "", 3.14, 10);   //() 안에 들어갈 자료형 명시
        e.getData();   //-> String

        //int a = 10;
        //Integer a = 10;  이 과정에는 new Integer(10);
        //Integer - wrapper 클래스 (일반 자료형)


//        Object[] arr2 = new Object[1];
        //일반자료형 -> 제네릭으로 쓸 수 없음
        //Arrays..?
        // 배열은 객체가 아님 -> 객체가 아니면 참조자료형이 아님..
        // 일반/참조로 나누는 것이 아닌 자료형들을 묶어둔 것일 뿐





    }
}
