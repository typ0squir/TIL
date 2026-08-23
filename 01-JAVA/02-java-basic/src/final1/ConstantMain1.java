package final1;

import java.sql.SQLOutput;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + 1000);
        // 1000 = magin number, 나를 놀라게 하는 숫자
        // 새로운 사람은 이 숫자가 뭘 뜻하는 지 한 번에 알아차릴 수 없다.
        int currentUerCount = 999;
        process(currentUerCount++);
        process(currentUerCount++);
        process(currentUerCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
