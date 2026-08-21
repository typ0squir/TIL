package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();  // 다른 패키지의 같은 이름인 경우
        // => 하나의 클래스만 import할 수 있고 동명의 다른 클래스는 경로를 명시해주어야 함.
        // => 자주 쓰는 클래스를 import해 사용
    }
}
