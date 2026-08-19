package oop1;

public class ValueData {
    int value;

    void add() {
        value++;    // 기본적으로 본인 인스턴스에 있는 멤버 변수에 접근.
        System.out.println("숫자 증가 value = " + value);
    }
}
