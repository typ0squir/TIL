package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int sum = 0;
        int n = 0; // 변수명이 count가 더 좋을 듯
        double average;

        while (true) {
            int num = input.nextInt();

            if (num == -1) {
                break;
            }

            n++;
            sum += num;
        }

        /* 더 축약하는 방법. 종종 쓰인다.
        int num;
        while ((num = input.nextInt()) != -1) {
            sum += num;
            n++;
        }
         */

        average = (double) sum / n;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

    }
}
