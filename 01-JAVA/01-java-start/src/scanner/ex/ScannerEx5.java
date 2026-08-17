package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int min = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int max = input.nextInt();

        int temp;
        if (min > max) {
            temp = min;
            min = max;
            max = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = min ; i < max ; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(max);
    }
}
