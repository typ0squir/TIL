package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        cal(1, 2, 3);
        cal(15, 25, 35);
    }

    public static void cal(int a, int b, int c) {
        System.out.println("평균값: " + ((double) (a + b + c) / 3.0));
    }
}
