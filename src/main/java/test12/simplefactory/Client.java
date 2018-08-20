package test12.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Client {

    public static void main(String[] args) {

        try {
            FruitGardener.factory("grape");
            FruitGardener.factory("apple");
            FruitGardener.factory("strawberry");
        } catch (BadFruitException e) {
            System.out.println(e.getMessage());
        }
    }
}
