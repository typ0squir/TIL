package final1;

public class FiinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1: final로 선언한 변수에 값을 재할당 할 수 없다.
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능
        // data1 = 20; // 컴파일 오류

        // final 지역 변수2: 메서도에도 마찬가지
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류
        method(10);


    }

    static void method(final int parameter) {
        // parameter = 20;  // 컴파일 오류
    }
}
