package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);

//builder - 결국 setter 응용한 것
//BuilderStudy 예시
        BuilderStudy builderStudy1 = BuilderStudy.builder()     // .builder 호출하면 -> BuilderStudyBuilder 객체 리턴
                .value1("김준일")    // BuilderStudyBuilder의 value1() 호출 void, 리턴값 없으므로 → this 반환 => BuilderStudyBuilder
                .value2(32)
                .build();
        //build() 호출 → BuilderStudy 객체 생성 ,
        //new Computer(cpu, ram) 실행 → 완성된 Computer 객체 리턴

//Computer
        ComputerBuilder computerBuilder = Computer.builder(); // Computer의 static builder() 호출 → new ComputerBuilder() 리턴
        computerBuilder.setCpu("i7");                         //setCpu() / setRam()으로 값 세팅
        computerBuilder.setRam(8);
        Computer computer = computerBuilder.build();                 // 빌드

        ComputerBuilder computerBuilder2 = Computer.builder().cpu("i5").ram(16);
        Computer computer2 = computerBuilder2.build();

        Computer computer3 = Computer.builder()
        .cpu("i5")
        .ram(16)
        .build();

/////////////////////////////실제 사용///////////////////////////////////////////////////////
        //객체를 단계적으로 설정하고 마지막에 build()로 생성하는 방식
        //        Computer.builder()        // ① Computer의 static builder() 호출 → ComputerBuilder 생성
        //          .cpu("Intel i7")        // ② Builder에서 값 설정 -> cpu, ram
        //          .ram(16)
        //          .build();               // ③ Builder의 build() 호출 → new Computer(cpu, ram)

        Product product = Product.builder().name("상품1").price(1000).size("L").build();
        System.out.println(product);
    }


}
