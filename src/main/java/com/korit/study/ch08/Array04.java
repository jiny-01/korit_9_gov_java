package com.korit.study.ch08;

import java.util.Scanner;

public class Array04 {

    public static String[] names = new String[] {"김준일", "김준이", "김준삼", "김준사", "김준오", "김준육", "김준칠", "김준팔", "김준구"};

    public static void main(String[] args) {
        //CRUD
        //추가(Create), 조회(Read), 수정(Update), 삭제(Delete)
        System.out.println("[ 이름 관리 시스템 ]");
        showMainMenuView();

    }


    //showMainMenuView 함수 정의 - 뷰 화면을 보여주는 기능
    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;          //
    while (!isExit) {
        System.out.println("1. 이름 추가");
        System.out.println("2. 이름 조회");
        System.out.println("3. 이름 수정");
        System.out.println("4. 이름 삭제");
        System.out.println("0. 종료");
        System.out.print("선택: ");

        int selectedNumber = scanner.nextInt();
        scanner.nextLine();    //엔터 날리기용

        if (selectedNumber == 0) {          //0번 입력 시
            isExit =true;
        } else if (selectedNumber == 1) {   //1번 입력 시
            register();
        } else if (selectedNumber == 2) {
            showNameList();
        }
        }
    }

    // insertName 함수 정의 - 이름 추가 기능
    public static void register() {
        Scanner scanner = new Scanner(System.in);
        String newName = null;
        while (true) {
            System.out.println("[이름 추가 기능]");
            System.out.println("이름 입력: ");
            newName = scanner.nextLine();        //newName 에 입력값 저장

            if (findByName(newName) == null) {   //중복되는 이름 없을 때 루프 빠져나옴
                break;                           //break: while 문 빠져나감
            }
            System.out.println("이미 존재하는 이름입니다. 다시 입력하세요. ");
        }

        add(newName);
        System.out.println("<<이름 추가 완료. >>");
    }


    //findByName 함수 정의 - for/each 문 이용
    public static String findByName(String name) {
        for (String n : names) {      //for-each 문 사용 -> 1~끝까지 순회, 인덱스번호 X, 값만 꺼내서 n 에 넣고 비교
            if (n.equals(name)) {    //같을 때 n 리턴
                return n;
            }
        }
        return null;                 //같지 않을 때 null
    }



    //addName 함수 - 입력값 name 을 이름 배열에 추가
    public static void add(String name) {
        String[] newArray = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newArray[i] = names[i];   //newArray 에 전체 이동

        }
        newArray[newArray.length - 1] = name;  //매개변수로 받은 입력값 name 을 newArray 의 마지막 인덱스 자리에 추가
        names = newArray;

    }

    //showNameList() 함수 정의 - 이름 조회 기능
    public static void showNameList() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로 가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));  //한 페이지에 2개씩
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지를 찾을 수 없습니다.");
            } else {
                String[] namesOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < namesOfPagination.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, namesOfPagination[i]);
                }
            }
        }


    }

    //getLastPage 함수 : 마지막 페이지  -> 재사용성을 위함
    public static int getLastPage(int size) {
        return (names.length % size == 0) ? names.length / size : names.length / size + 1;
    }

    //이름 조회
    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size;   //한 페이지에 10개씩 -> (1-1) * 10 => 해당 페이지의 시작인덱스 0, (2-1)*10 => 시작인덱스 10
        int lastPage = getLastPage(size);
        //names.length / size : 페이지 개수   -> 나머지 0: 페이지 개수 그대로 / 나머지 0이 아님: + 1 해서 다음페이지로 올림
        boolean isLast = page == lastPage;        //현재 페이지 = 마지막 페이지
        int paginationArraySize = isLast && names.length % size == 0 ? names.length % size : size;     //마지막 페이지 -> 페이지 개수,
        // paginationArraySize -> 한 페이지에 띄워줄 개수
        //마지막 페이지일 경우 → 전체 길이에서 페이지 크기(size)로 나눈 나머지를 가져옴
        //예: names.length=23, size=10 → 마지막 페이지는 23 % 10 = 3개만
        //마지막이 아닐 경우 → 그냥 size개 담음.

        //한 페이지 = 배열  -> 호출할 때마다 새로 초기화(?)
        String[] paginationArray = new String[paginationArraySize];
        //페이지 배열에 데이터 옮겨줌
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {  //0~10까지, 11~20 까지,...
            paginationArray[i - startIndex] = names[i];    //0부터 시작해야함 -> (i - startIndex)
        }

        return paginationArray;





    }


}
