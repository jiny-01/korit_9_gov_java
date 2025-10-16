package com.korit.study.ch20;

public class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}
