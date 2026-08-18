package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        iterate(message, 3);
        System.out.println("==================");
        iterate(message, 5);
        System.out.println("==================");
        iterate(message, 7);
    }

    public static void iterate(String msg, int count) {
        for (int i = 0 ; i < count ; i++) {
            System.out.println(msg);
        }
    }
}
