package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animalArr = {dog, cat, caw};
        /*Animal index1 = dog;
        Animal index2 = cat;
        Animal index3 = caw;*/

        // 추후에 다른 종류의 동물 인스턴스가 추가되더라도 변하지 않음
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

}
