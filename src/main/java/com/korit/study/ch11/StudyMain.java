package com.korit.study.ch11;

public class StudyMain {



    public static void main(String[] args) {
        // 과목명: JAVA 기초
        // 담당 선생님 이름: 김준일
        // 담당 선생님 나이: 32
        // 학생1 ID: 20250001
        // 학생1 이름: 박재현
        // 학생1 나이: 24
        // 학생2 ID: 2025002
        // 학생2 이름: 고대한
        // 학생2 나이: 19
        // 학생3 ID: 2025003
        // 학생3 이름: 양재원
        // 학생3 나이: 27




        Teacher teacher = new Teacher("김준일", 32);
        Subject subject = new Subject("JAVA 기초", teacher);
        Student student1 = new Student(20250001, "박재현", 24);
        Student student2 = new Student(20250002, "고대한", 19);
        Student student3 = new Student(20250003, "양재원", 27);

//        Student[] students = new Student[3];
        Student[] students = new Student[] {student1, student2, student3};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생[i] ID: " + students[i].id);
            System.out.println("학생[i] 이름: " + students[i].name);
            System.out.println("학생[i] 나이: " + students[i].age);
        }

        // Study 객체 생성
        Study study = new Study(subject, students);

        //StudyPrintService 새 객체 생성
        StudyPrintService studyPrintService = new StudyPrintService();
        studyPrintService.printInfoAll(study);
        System.out.println("====================================");
        studyPrintService.printInfoSubject(study.subject);
        System.out.println("====================================");
        studyPrintService.printInfoTeacher(study.subject.teacher);
        System.out.println("====================================");
        studyPrintService.printInfoStudent(study.students[0]);

        //과목정보
//        System.out.println("과목 수강 정보");
//        System.out.println("과목명: " + subject.name);
//        System.out.println("담당 선생님: " + subject.teacher.name.toString());
//        System.out.println("담당 선생님 나이: " + subject.teacher.age);
//        System.out.println("학생1 ID: " + student1.id);
//        System.out.println("학생1 이름: " + student1.name);
//        System.out.println("학생1 나이: " + student1.age);
//        System.out.println("학생2 ID: " + student2.id);
//        System.out.println("학생2 이름: " + student2.name);
//        System.out.println("학생2 나이: " + student2.age);
//        System.out.println("학생3 ID: " + student3.id);
//        System.out.println("학생3 이름: " + student3.name);
//        System.out.println("학생3 나이: " + student3.age);
//        System.out.println("학생정보");
//        System.out.println();

        //과목정보
//        Subject subjectInfo = new Subject("JAVA 기초", teacher);




    }
}
