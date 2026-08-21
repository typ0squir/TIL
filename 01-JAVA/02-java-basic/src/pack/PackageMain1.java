package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User();   // User 클래스는 다른 패키지 소속이므로 풀경로를 명시해주어야 함.
    }
}
