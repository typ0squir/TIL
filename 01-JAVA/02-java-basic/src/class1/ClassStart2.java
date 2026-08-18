package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // ClassStart1의 코드를 리팩토링하기 위해 배열 사용
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        // => 한 학생의 데이터가 3개의 배열에 나누어져 있음.
        //      - 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 함.
        //      - 특정 학생의 데이터를 변경 시 실수할 가능성 높음.

        // => 사람이 관리하기 좋은 방식은 '학생'이라는 개념을 하나로 묶고, 각각의 학생 별로 정보를 관리하는 것.
        // => '클래스' 도입

        for (int i = 0 ; i < studentNames.length ; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
