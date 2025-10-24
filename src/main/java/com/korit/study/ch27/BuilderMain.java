package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);
        //builder - 결국 setter 응용한 것
        BuilderStudy builderStudy1 = BuilderStudy.builder()     // .builder 호출하면 -> BuilderStudyBuilder 객체 리턴
                .value1("김준일")    // -> BuilderStudyBuilder 안의 메서드 value1 호출 -> void 이므로 리턴값 없으므로
                .value2(32)
                .build();

        ComputerBuilder computerBuilder = Computer.builder(); // 빌더 생성
        computerBuilder.setCpu("i7");
        computerBuilder.setRam(8);
        Computer computer = computerBuilder.build();                 // 빌드

//        ComputerBuilder computerBuilder2 = Computer.builder().cpu("i5").ram(16); // 빌더 생성
        computerBuilder.setCpu("i7");
        computerBuilder.setRam(8);
//        Computer computer2 = computerBuilder2.build();                 // 빌드

//        Computer computer3 = Computer.builder().cpu("i5").ram(16).build();

        Product product = Product.builder().name("상품1").price(1000).size("L").build();
        System.out.println(product);
    }


}
