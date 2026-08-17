package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][4];

        for (int i = 0 ; i < 4 ; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0 ; j < 3 ; j++) {
                if (j == 0) {
                    System.out.print("국어 점수: ");
                } else if (j == 1) {
                    System.out.print("영어 점수: ");
                } else if (j == 2) {
                    System.out.print("수학 점수: ");
                }
                scores[i][j] = scanner.nextInt();
                scores[i][3] += scores[i][j];
            }
        }

        for (int i = 0 ; i < scores.length ; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + scores[i][3] + ", 평균: " + (double) scores[i][3] / 3);
        }
    }
}
