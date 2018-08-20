package test12.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/20/18
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("Apple is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Apple has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Apple has been planted");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int a){
        this.treeAge = a;
    }
}
