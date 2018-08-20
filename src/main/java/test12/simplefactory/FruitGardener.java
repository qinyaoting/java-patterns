package test12.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class FruitGardener  {

    /**
     *  简单工厂的结构
     */
    public static Fruit factory(String which) throws BadFruitException {
        if (which.equalsIgnoreCase("apple")) {
            return new Apple();
        }
        else if (which.equalsIgnoreCase("strawberry")) {
            return new Strawberry();
        }
        else if (which.equalsIgnoreCase("grape")) {
            return new Grape();
        }
        else {
            throw new BadFruitException("Bad fruit request");
        }
    }
}
