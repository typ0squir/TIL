package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int N = 0;
        for (int num =  1 ; N < 10 ; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
                N++;
            }
        }

        // 선생님 풀이
        // 세미콜론 사이에 여러 개의 변수를 정의할 수 있다.
        // 좋은 코드는 아니고 가능하다는 것만 알기.
        for (int num = 2, count = 1 ; count <= 10 ; num += 2, count++) {
            System.out.println(num);
        }
    }
}
