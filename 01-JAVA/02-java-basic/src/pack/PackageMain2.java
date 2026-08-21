package pack;

// import pack.a.User;
import pack.a.*;    // pack.a 패키지 하위의 모든 클래스를 import해 사용할 경우.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // 경로를 import해 코드에서 경로를 생략할 수 있음.
        User2 user2 = new User2();
    }
}
