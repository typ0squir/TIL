package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int len = scanner.nextInt();


        System.out.println(len + "개의 정수를 입력하세요: ");
        int[] arr = new int[len];
        int sum = 0;
        double average;
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        average = (double) sum / arr.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
