package static2;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        // import static static2.DecoData.staticCall;
        // 클래스 명을 생략할 수 있다.
        // 해당 메서드를 많이 쓰는 경우 추천

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 참조값을 넘겨서 static이 인스턴스에 접근하는 경우
        DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근 가능
        DecoData data3 = new DecoData();
        data3.staticCall(); // 권장하지 않음.

        // 클래스를 통한 접근 가능
        DecoData.staticCall();
    }
}
