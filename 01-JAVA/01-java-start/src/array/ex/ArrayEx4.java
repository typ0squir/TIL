package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요: ");
        int[] nums = new int[5];
        for (int i = 0 ; i < nums.length ; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        average = (double) sum / nums.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
