package com.korit.study.ch06;

    public class GradeSystem {
        public static void main(String[] args) {
            printStudentInfo("홍길동", 80, 85, 90);
            printStudentInfo("김철수", 95, 88, 92);

        }
        // 평균을 계산하는 함수 (정수 2개)
        public static double average(int score1, int score2) {
            return (score1 + score2) / 2.0;
        }

        // 평균을 계산하는 함수 (정수 3개) - 오버로딩
        public static double average(int score1, int score2, int score3) {
            return (score1 + score2 + score3) / 3;
        }

        // 등급을 반환하는 함수
        public static char getGrade(double average) {
            // 90이상: A, 80이상: B, 70이상: C, 그 외: F
            char grade = average >= 90 ? 'A' : average >= 80 ? 'B' : average >= 70 ? 'C' : 'F';
            return grade;
        }

        // 학생 정보를 출력하는 함수
        public static void printStudentInfo(String name, int score1, int score2, int score3) {
            // average()와 getGrade() 함수를 호출하여 학생 정보를 출력하세요
            // 출력 형식: "홍길동 학생의 평균: 85.0, 등급: B"
            double average = average(score1, score2, score3);
            String grade = String.valueOf(getGrade(average));
            System.out.println(name + "학생의 평균: " + average + "," + "등급: " + grade);
            System.out.printf(String.format("%s" + "학생의 평균: " + "%.1f" + "등급: " + "%c\n"), name, average, grade);
        }




    }

