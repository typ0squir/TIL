package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;  // this 생략 가능
        // 하지만 this를 생략하지 않아도 본인의 멤버변수에 접근한다. (코딩 스타일)
        // this.nameField = nameParameter;
        // 요새는 IDE가 색으로 구분해주기 때문에 예전의 유행을 따를 필요는 없다. (권장하지 않음)
    }
}
