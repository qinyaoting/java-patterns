package test13.factory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Creator c1 = new ConcreteCreator1();
        Product p1 = c1.factory();

        Creator c2 = new ConcreteCreator2();
        Product p2 = c1.factory();
    }
}
