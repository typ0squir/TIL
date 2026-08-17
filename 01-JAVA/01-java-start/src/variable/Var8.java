package variable;

public class Var8 {

    public static void main(String[] args) {

        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483624; // 약 -20억 ~ 20억

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // 표현 범위가 작아서 소수점 아래 계산이 잘 안됨.
        double d = 10.0; // 현업에서 보통 사용
    }
}
