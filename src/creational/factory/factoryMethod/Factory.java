package creational.factory.factoryMethod;

/**
 * Created by Michael Wong on 2016/2/25.
 */
public class Factory {

    public Product newInstance(String productName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return newInstance(Class.forName(productName));
    }

    public Product newInstance(Class<?> productClass) throws IllegalAccessException, InstantiationException {
        return (Product) productClass.newInstance();
    }
}


