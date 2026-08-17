package config;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 강제 형변환 (손실)
        System.out.println("intValue = " + intValue);

        System.out.println((int) 10.5); // 10 출력 (casting)
    }
}
