package com.korit.study.ch27;

public class Product {
    private String name;
    private Integer price;
    private String size;

//AllArgu 필수 정의
    public Product(String name, Integer price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

// NoArgu 필요X
//    public Product() {
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    //builder() 호출하기 위한 static 메서드
    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private String name;
        private Integer price;
        private String size;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(Integer price) {
            this.price = price;
            return this;
        }

        public ProductBuilder size(String size) {
            this.size = size;
            return this;
        }


        //build 하기 위함
        public Product build() {
            return new Product(name, price, size);
        }
    }




}
