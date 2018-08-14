package test53.visitor.visitor1;

import test53.visitor.visitor0.NodeA;
import test53.visitor.visitor0.NodeB;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class VisitorB extends VisitorAdapter {

    @Override
    public void visit(NodeA nodeA) {
        System.out.println(nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
