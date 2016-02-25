package creational.singleton;

/**
 * Static interval class
 * Created by Michael Wong on 2016/2/25.
 */
public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
