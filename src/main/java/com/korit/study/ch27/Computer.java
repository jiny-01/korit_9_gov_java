package com.korit.study.ch27;

//Computer 클래스 - builder() 를 호출해야하므로 static 으로 builder 정의
public class Computer {
    private String cpu;
    private int ram;

    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    // Builder 가 필요함 - 생성없이 쓸 수 있도록 static
    //Computer.builder() 로 Builder 시작하기 위해 builder() 정의
    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }


}
