package final1;

public class ConstructInit {

    final int value;
    // final을 통해 정의된 멤버변수는 생성자를 통해서만 초기화 가능
    // 이후에는 값이 변경될 수 없다.

    public ConstructInit(int value) {
        this.value = value;
    }
}
