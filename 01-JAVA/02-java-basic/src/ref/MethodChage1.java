package ref;

public class MethodChage1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a); // 기본형으로 메서드 호출
        System.out.println("메서드 호출 후: a = " + a); // 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
