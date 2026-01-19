package epam;

public class SingletonClass {

    private SingletonClass() {};

    //static inner class in Bill-Pugh's approach holds the singleton instance
    //static inner class is loaded only when getInstance() first called (lazy loading)
    //jvm initialize and loads SIC in thread safe manner, so no synchronization is required
    private static class SingletonHelper {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

    //eagerly loading - as soon as jvm loaded singleton class it creates instance
    //private static final SingletonClass INSTANCE = new SingletonClass();

    public static SingletonClass getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass = getInstance();
        System.out.println(singletonClass);
    }
}



