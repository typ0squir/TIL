package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);    // 인스턴스에 방문해서 정적 변수인 것을 확인하고 static 영역으로 보내서 확인
        // -> 권장하지 않음. 코드 가독성이 떨어짐(인스턴스 변수인지 정적 변수인지 오해할 수 있음)


        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
