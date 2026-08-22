package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스를 생성하지 못하도록 생성자를 private으로 막기
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int i = 1 ; i < array.length ; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int i = 0 ; i < array.length ; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
