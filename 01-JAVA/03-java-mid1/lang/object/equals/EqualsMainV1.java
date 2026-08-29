package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));       // 둘의 참조값이 다르다.
        System.out.println("equality = " + (user1.equals(user2)));  // 기본적으로 동일성을 비교
        // => 동등성 비교를 위해 equals() 메서드를 재정의해야 함.
    }
}
