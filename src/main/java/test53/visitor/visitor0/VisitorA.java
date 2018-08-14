package test53.visitor.visitor0;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(NodeA nodeA) {        //14-e 双重委派
        System.out.println(nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
