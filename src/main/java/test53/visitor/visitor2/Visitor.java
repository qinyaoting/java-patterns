package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public abstract class Visitor {

    // 提供访问每个对象的方法      14-a
    public abstract void visitHardDisk(HardDisk e);
    public abstract void visitMainBoard(MainBoard e);
    public abstract void visitCpu(Cpu e);
    public abstract void visitPc(Pc e);
    public abstract void visitCase(Case e);
    public abstract void visitIntegratedBoard(IntegratedBoard e);
}
