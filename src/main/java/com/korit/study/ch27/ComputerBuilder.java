package com.korit.study.ch27;

//ComputerBuilder 클래스
//Computer.builder() 하면 ComputerBuilder 가 호출되어야함
//이때 ComputerBuilder 는 실제 빌드를 하는 build() 메서드 필요
public class ComputerBuilder {
    private String cpu;
    private int ram;

    //Builder - NoArguConstructor 필수
    public ComputerBuilder() {
    }

//    public String getCpu() {
//        return cpu;
//    }

//    public int getRam() {
//        return ram;
//    }

    //원래 setter 인 setCpu -> cpu
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //build 하기 위한 메서드 cpu, ram 추가
    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }

    // build() 로 실제 Computer 객체 생성
    public Computer build() {
        return new Computer(cpu, ram);

    }


}
