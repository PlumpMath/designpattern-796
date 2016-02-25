package creational.factory.factoryMethod;

/**
 * Created by Michael Wong on 2016/2/25.
 */
public class Process {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = null;
        try {
            product = factory.newInstance(ConcreteProduct.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        if (product != null) {
            product.doSomething();
        }
    }

}
