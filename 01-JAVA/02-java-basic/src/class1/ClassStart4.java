package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        students[0] = student1; // students[0] = x001;
        students[1] = student2; // students[1] = x002;
        // 인스턴스를 복제하는 것이 아닌 '참조값'만 복사해서 배열에 넣는다.

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
