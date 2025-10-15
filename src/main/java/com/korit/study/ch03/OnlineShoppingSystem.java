package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String [] args){
//        Scanner scanner = new Scanner(System.in);
//        String customerId = "";
//        String productCode = "";
//        String productName = "";
//        int stock = 0;
//        int price = 0;
//        int addressCode = 0;
//        String address = "";
        Scanner scanner = new Scanner(System.in);
        String customerId = "";
        String productCode = "";
        String productName = "";
        int stock = 0;
        int price = 0;
        int addressCode = 0;
        String address = "";

        System.out.print("고객 ID를 입력하세요 : " );
        customerId = scanner.nextLine();
        System.out.print("상품 코드를 입력하세요 : " );
        productCode = scanner.next();
        scanner.nextLine();
        System.out.print("상품명을 입력하세요 : " );
        productName = scanner.nextLine();
        System.out.print("수량을 입력하세요 : " );
        stock = scanner.nextInt();
        System.out.print("단가를 입력하세요 : " );
        price = scanner.nextInt();
        System.out.print("우편번호를 입력하세요 : ");
        addressCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송주소를 입력하세요 : ");
        address = scanner.nextLine();



        System.out.println(String.format("""
                ===주문 확인서===
                고객 ID: %s
                상품 정보:
                  - 상품코드: %s 
                  - 상품명: %s
                  - 단가: %,d원 x %d,개 = 90,000원
                배송 정보:
                  - 우편번호: %d
                  - 주소: %s
                  - 배송비: 무료 (3만원 이상 구매)
                  -총 결제 금액 : 90000원""", customerId,
                productCode,
                productName,
                price,
                stock,
                addressCode,
                address));




        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
    }
}
