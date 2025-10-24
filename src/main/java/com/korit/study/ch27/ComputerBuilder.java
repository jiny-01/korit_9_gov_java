package com.korit.study.ch27;

public class ComputerBuilder {
    private String cpu;
    private int ram;

    //Builder - NoArguConstructor 필수
    public ComputerBuilder() {
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //build() 기능이 있어야함
    public Computer build() {
        return new Computer(cpu, ram);

    }

    // Builder 가 필요함 - 생성없이 쓸 수 있도록 static
    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }


}
