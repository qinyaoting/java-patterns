package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public abstract class Equipment {

    public abstract void accept(Visitor vls);

    public abstract double price();
}
