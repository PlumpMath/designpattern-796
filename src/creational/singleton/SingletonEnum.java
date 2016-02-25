package creational.singleton;

/**
 * Enum
 * Created by Michael Wong on 2016/2/25.
 */
public enum  SingletonEnum {

    INSTANCE;

    // optional methods

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
    }

}
