package test53.visitor.visitor0;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ObjectStructure {

    /**
     * 持有一个集合,并对外提供add方法来添加元素
     */
    private Vector nodes;
    private Node node;

    public ObjectStructure() {
        nodes = new Vector();
    }

    // 遍历集合, 并把visitor传给node    14-c
    public void action(Visitor visitor) {
        for (Enumeration e = nodes.elements(); e.hasMoreElements();) {
            node = (Node) e.nextElement();
            node.accept(visitor);
        }
    }

    public void add(Node node) {
        nodes.add(node);    //14-b
    }
}
