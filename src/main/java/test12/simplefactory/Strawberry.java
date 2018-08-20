package test12.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Strawberry implements Fruit {
    @Override
    public void grow() {
        System.out.println("Strawberry is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Strawberry has been planted");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }
}
