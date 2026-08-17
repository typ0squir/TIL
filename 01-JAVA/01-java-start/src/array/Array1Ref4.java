package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int [] students = {90, 80, 70, 60, 50}; // 자바가 좌변을 보고 추론.
        // 학생이 추가되더라도 위의 코드만 수정되고 아래의 코드는 수정되지 않음

        // 변수 값 사용
        for (int i = 0 ; i < students.length ; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

    }
}
