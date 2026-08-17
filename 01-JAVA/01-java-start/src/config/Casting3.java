package config;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고 값
//        long maxIntOver = 2147483648; // int 최고 값 + 1(초과)
        // 리터럴은 기본적으로 int형 -> 뒤에 L 적어줘야함
        long maxIntOver = 2147483648L;

        int intValue = 0;
        intValue = (int) maxIntValue; // 형 변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형 변환 (int 범위를 초과한 경우)
        System.out.println("maxIntOver casting = " + intValue); // '-' 2147483648
        // int의 가장 작은 범위부터 다시 시작 (시계가 한 바퀴 돌고 난 듯이)
    }
}
