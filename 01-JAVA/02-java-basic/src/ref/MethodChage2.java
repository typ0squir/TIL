package ref;

public class MethodChage2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: a = " + dataA.value);
        changeReference(dataA); // 참조형으로 메서드 호출
        System.out.println("메서드 호출 후: a = " + dataA.value); // 20
    }

    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
