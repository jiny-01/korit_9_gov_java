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

    //static 메서드 - 생성없이 쓸 수 있음
    //호출했을 때 BuilderStudyBuilder 객체 생성
    public static BuilderStudyBuilder builder() {
        return new BuilderStudyBuilder();
    }


    //static 클래스
    public static class BuilderStudyBuilder {
        private String value1;
        private Integer value2;

        public BuilderStudyBuilder value1(String value1) {
            this.value1 = value1;             //자기자신의 주소 -> return this
            return this;
        }

        public BuilderStudyBuilder value2(Integer value2) {
            this.value2 = value2;
            return this;            //그러면 여기 return BuilderStudyBuilder 가 들어가면??
        }

        public BuilderStudy build() {
            return new BuilderStudy(value1, value2);
        }
    }
}
