package final1;

public class FInalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        // - FieldInit과 같이 필드에서 초기화하는 것은 해당 값이 미리 정해져있음
        // - 모든 인스턴스가 같은 값 사용 -> 메모리 낭비
        // - 이럴 때, static을 이용하는 것이 좋음
        // => static final (상수)

        // 상수 접근
        System.out.println("상수 출력");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
