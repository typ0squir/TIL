package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10]; // 상품 이름을 저장할 String 배열
        int[] productPrices = new int[10]; // 상품 가격을 저장할 int 배열
        int productCount = 0; // 현재 등록된 상품의 개수를 저장할 int 변수

        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                // 이미 상품 목록에 상품이 10개 등록된 경우
                if (productCount == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;

            } else if (menu == 2) {
                for (int i = 0 ; i < productCount ; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
