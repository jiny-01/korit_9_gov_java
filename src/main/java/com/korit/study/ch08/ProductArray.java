package com.korit.study.ch08;

//products ["아이폰17"]
// prices [1200000]

import java.util.Scanner;

import static com.korit.study.ch08.Array04.getLastPage;

public class ProductArray {

    public static String[] products = new String[]{
            "아이폰 120",
            "갤럭시 140",
            "에어팟 25",
            "맥북 200",
            "아이패드 90",
            "갤럭시탭 100",
            "버즈 15"
    };

    public static int[] prices = new int[] {
            120,
            140,
            25,
            200,
            90,
            100,
            15
    };

    public static void main(String[] args) {
        System.out.println("[상품 정보 시스템]");
        showMenuView();

    }


    //showMenuView 함수 정의
    public static void showMenuView() {
        Scanner scanner = new Scanner(System.in);
        //while 무한 루프 돌게
        while (true) {
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 조회");
            System.out.println("3. 상품 수정");
            System.out.println("4. 상품 삭제");
            System.out.println("선택: ");

            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 1) {
                //상품 추가 함수
                insertProduct();
            } else if (selectedNumber == 2) {
                showProductList();
                //상품 조회 함수

            }
        }

    }

    //상품 추가 함수
    public static void insertProduct() {
        Scanner scanner = new Scanner(System.in);
        String newProduct = null;

        while (true) {
            System.out.println("상품 추가 기능");
            System.out.println("추가할 상품과 가격: ");
            newProduct = scanner.nextLine();

            if (findByProductName(newProduct) == null) {
                break;                                      //break: while 문 빠져나감
            }
            System.out.println("이미 등록된 상품입니다. 다시 입력하세요.");
        }

        addProduct(newProduct);
        System.out.println("======상품 추가 완료======");
    }

    //배열에 상품 추가하는 함수
    public static void addProduct(String newProduct) {
        String[] productArray = new String[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            productArray[i] = products[i];
        }
        productArray[productArray.length - 1] = newProduct;
        products = productArray;
    }

    //findByProductName 함수 정의 - for/each 문 이용
    //중복체크는 아님

    public static String findByProductName(String newProduct) {
        for (String product : products) {
            if (product.equals(newProduct)) {    //같을 때 n 리턴
                return product;
            }
        }
        return null;                 //같지 않을 때 null
    }

    //boolean 으로 중복확인하는 방법 -> 선형 탐색
//    public static boolean isDuplicated(String product) {
//        for (String product : products) {
//            if (product.equals(product)) {
//                return true;
//            }
//        } return false;
//    }

    //상품 조회하는 함수
    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size;   //페이지당 시작인덱스
        int lastPage = 0;
        boolean isLast = page == lastPage;

        int pageArraySize = isLast && products.length % size != 0 ? products.length / size : size;   //한 페이지에 보여줄 개수
        String[] paginationArray = new String[pageArraySize];            // 페이지 별 배열
        for (int i = startIndex; i < startIndex + pageArraySize; i++) {
            paginationArray[i - startIndex] = products[i];
        }
        return paginationArray;
    }

    public static void showProductList() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        while (true) {
            System.out.println("페이지 조회");
            System.out.println("뒤로 가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));  //한 페이지에 2개씩
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지를 찾을 수 없습니다.");
            } else {
                String[] numberOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < numberOfPagination.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, numberOfPagination[i]);
                }
            }
        }



    }
}
