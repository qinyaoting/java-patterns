package test53.visitor.visitor0;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class NodeB extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "Node B is visited";
    }
}
