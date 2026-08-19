package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;   // data 변수에 아직 가리키는 객체가 없음.
        System.out.println("1. data = " + data);
        data = new Data();  // 참조값을 data에 담음.
        System.out.println("2. data = " + data);
        data = null;    // 더 이상 앞의 Data 인스턴스를 더이상 참조하지 않는다.
        // JVM의 Garbage Collection(GC)이 자동으로 정리/제거해줌.
        System.out.println("3. data = " + data);
    }

}
