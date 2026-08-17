package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0 ; i < numbers.length ; i++) {
            int number = number = numbers[i];
            System.out.println(number);
        }

        System.out.println(); // 위의 for문과 구분하기

        // 향상된 for문, for-each문
        // 실무에서 많이 사용한다.
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우
        // 증가하는 index값을 활용하는 경우
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.println("number " + i + "번의 결과는: " + numbers[i]);
        }
    }
}
