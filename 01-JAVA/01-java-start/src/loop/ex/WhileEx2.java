package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int N = 0;

        while (N < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                N++;
            }
            num++;
        }
    }
}
