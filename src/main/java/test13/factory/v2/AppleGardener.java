package test13.factory.v2;

import test12.simplefactory.Apple;
import test12.simplefactory.Fruit;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 5:36 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
