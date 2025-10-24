package com.korit.study.ch27;

public class Computer {
    private String cpu;
    private int ram;

    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }


}
