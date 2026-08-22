package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue;      // 인스턴스 변수 접근 가능, compile error
        // instanceMethod();   // 인스턴스 메서드 접근 가능, compile error
        // 인스턴스에 접근 불가. 참조값 모름.

        // static은 static에만 접근 가능
        staticValue++;  // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

    }

    public static void staticCall(DecoData data) {
        // 외부에서 참조값을 넘겨오기 때문에 인스턴스 접근 가능
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 변수 접근 가능
        instanceMethod();   // 인스턴스 메서드 접근 가능

        staticValue++;  // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);

    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

}
