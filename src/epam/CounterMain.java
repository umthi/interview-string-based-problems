package epam;

class Counter {
    static int count = 0; // shared
    int id = 0; // individual to each object
}

public class CounterMain {
    public static void main(String[] args) {
        Counter.count = 2;
        System.out.println(Counter.count);

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.id = 10;
        System.out.println(c1.id);
        System.out.println(c2.id);
    }
}
