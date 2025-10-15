package com.korit.study.ch02;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerId = "";
        String productCode = "";
        String productName = "";
        int stock = 0;
        int price = 0;
        int postNumber = 0;
        String address = "";

        //배송비, 총액,
        int delivery = 0;
        int totalPrice = 0;
        String deliveryFee = "";


        System.out.print("고객 ID를 입력하세요: ");
        customerId = scanner.nextLine();
        System.out.print("상품 코드를 입력하세요: ");
        productCode = scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        productName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("수량을 입력하세요: ");
        stock = scanner.nextInt();
        System.out.print("단가를 입력하세요: ");
        price = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        postNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송 주소를 입력하세요: ");
        address = scanner.nextLine();

        //가격 계산
        totalPrice = price * stock;
        delivery = totalPrice >= 30000 ? 0 : 3000; // 3만원 이상 무료
        deliveryFee = delivery == 0 ? "무료" : delivery + "원";
        int total = totalPrice + delivery; // 총액 계산


        System.out.println("===주문 확인서===");
        System.out.println("고객 ID: " + customerId);
        System.out.println("상품정보 : ");
        System.out.println("- 상품코드: " + productCode);
        System.out.println("- 상품명: " + productName);
        System.out.println("- 단가: " + price);
        System.out.println("배송 정보: ");
        System.out.println("- 우편번호: " + postNumber);
        System.out.println("- 주소: " + address);
        System.out.println("- 배송비: " + deliveryFee);
        System.out.println("총 결제 금액: " + totalPrice);


        System.out.println(String.format("""
        고객 ID: %s
        상품 정보:
          - 상품코드: %s
          - 상품명: %s
          - 단가: %,d원 × %,개 = %,d원
        배송 정보:
          - 우편번호: %d
          - 주소: %s
          - 배송비: %s
        총 결제 금액: %d원
        """, customerId,
             productCode,
             productName,
             price,
             stock,
             totalPrice,
             postNumber,
             address,
             deliveryFee,
             total));



        scanner.close();
    }
}
