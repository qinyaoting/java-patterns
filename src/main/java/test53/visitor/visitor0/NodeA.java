package test53.visitor.visitor0;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class NodeA extends Node {

    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);    //14-d
        // 用访问者, 调用visit(this)
    }

    /**
     * NodeA的特有操作
     */
    public String operationA(){
        return "Node A is visited";
    }
}
