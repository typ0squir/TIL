package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // Child 인스턴스인 경우 childMehtod() 실행
        if (parent instanceof Child child) {    // 인스턴스 확인과 변수 선언 동시에 가능 (Java16)
            System.out.println("Child 인스턴스 맞음");
            // Child child = (Child) parent;    // 위에서 선언 했으므로 변수 선언 생략
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
