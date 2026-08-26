package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() {
        // 추상 메서드 아님 -> 꼭 오버라이딩 할 필요 없음
        // 상속 받을 목적으로 생성
        System.out.println("동물이 움직입니다.");
    }
}
