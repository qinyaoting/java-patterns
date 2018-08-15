package test53.visitor.visitor0;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Client {

    /**
     * 节点固定不变, 使用访问者模式, 如果节点经常增加, 不能使用
     */
    private static ObjectStructure aObjects;
    private static Visitor visitor;

    public static void main(String[] args) {
        aObjects = new ObjectStructure();
        aObjects.add(new NodeA());
        aObjects.add(new NodeB());
        // 创建访问者,
        visitor = new VisitorA();
        // 让访问者访问结构     14-a
        aObjects.action(visitor);
    }
}
