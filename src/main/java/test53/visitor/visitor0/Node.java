package test53.visitor.visitor0;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public abstract class Node {

    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
