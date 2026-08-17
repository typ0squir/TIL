package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력할 때까지의 합을 구합니다.");
        while (true) {
            System.out.print("입력할 정수: ");
            int num = scanner.nextInt();

            sum += num;
            System.out.println("지금까지의 합: " + sum);

            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
