package test53.visitor.visitor2;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class InventoryVisitor extends Visitor  {        // [ˈɪnvəntɔri] 存货清单； 财产目录，财产目录的编制； 存货总值； 清查

    private Vector inv;

    public InventoryVisitor(){
        inv = new Vector(10, 5);
    }

    public int size() {
        return inv.size();
    }

    @Override
    public void visitHardDisk(HardDisk e) {
        inv.addElement(e);
    }

    @Override
    public void visitMainBoard(MainBoard e) {
        inv.addElement(e);
    }

    @Override
    public void visitCpu(Cpu e) {
        inv.addElement(e);
    }

    @Override
    public void visitPc(Pc e) {
        inv.addElement(e);
    }

    @Override
    public void visitCase(Case e) {
        inv.addElement(e);
    }

    @Override
    public void visitIntegratedBoard(IntegratedBoard e) {
        inv.addElement(e);
    }
}
