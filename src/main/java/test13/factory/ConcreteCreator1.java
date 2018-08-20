package test13.factory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ConcreteCreator1 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
