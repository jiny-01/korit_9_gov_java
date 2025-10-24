package com.korit.study.ch27;

public class BuilderStudy {

    private String value1;
    private Integer value2;

    public BuilderStudy() {
    }

    public BuilderStudy(String value1, Integer value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "BuilderStudy{" +
                "value1='" + value1 + '\'' +
                ", value2=" + value2 +
                '}';
    }


    //static 클래스
    public static class BuilderStudyBuilder {
        private String value1;
        private Integer value2;

        public void value1(String value1) {
            this.value1 = value1;
        }

        public void value2(String value12) {
            this.value2 = value2;
        }

        public BuilderStudy build() {
            return new BuilderStudy(value1, value2);
        }
    }
}
