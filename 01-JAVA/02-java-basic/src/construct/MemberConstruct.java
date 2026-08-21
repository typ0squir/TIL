package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 추가
//    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    // 변경
    MemberConstruct(String name, int age) {
        this(name, age, 50);    // 기존의 MemberConstruct(String name, int age, int grade) 호출, grade값만 default로 제공
        // => 중복 제거 가능
        // ※ 단, this()는 첫 줄에 작성해야만 함.
    }
}
