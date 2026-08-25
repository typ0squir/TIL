package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);    // ClassB에 기본 생성자 X -> 생략 불가
        System.out.println("ClassC 생성자");
    }
}
