package test12.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 4:41 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Grape implements Fruit {
    @Override
    public void grow() {
        System.out.println("Grape is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Grape is harvest");
    }

    @Override
    public void plant() {
        System.out.println("Grape is plant");
    }

    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
