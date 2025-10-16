package com.korit.study.ch20;

public class Factory {
    private static int id;
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public static Product createProduct(String name) {
        return new Product(++id, name);
        //공장끼리 이 static id를 공유하기 때문에 공장이 1, 2, 3 생성될 떄마다 id 를 공유함
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}
