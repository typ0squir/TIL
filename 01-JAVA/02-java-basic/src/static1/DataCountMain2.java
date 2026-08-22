package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        // - Data2의 개수를 세고 싶은데 Data2 안에서 해결하지 못하고 밖에서 Counter를 가지고 들어와야함.
        // - Data2의 인스턴스를 생성할 때 매개변수 갯수가 늘어남.
        // => 개선 필요

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
