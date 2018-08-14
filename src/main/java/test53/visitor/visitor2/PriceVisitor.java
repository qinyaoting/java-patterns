package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class PriceVisitor extends Visitor {

    private float total;
    public PriceVisitor(){
        total = 0;
    }

    public float value() {
        return total;
    }

    @Override
    public void visitHardDisk(HardDisk e) {
        total += e.price();
    }

    @Override
    public void visitMainBoard(MainBoard e) {
        total += e.price();
    }

    @Override
    public void visitCpu(Cpu e) {
        total += e.price();
    }

    @Override
    public void visitPc(Pc e) {
        total += e.price();
    }

    @Override
    public void visitCase(Case e) {
        total += e.price();
    }

    @Override
    public void visitIntegratedBoard(IntegratedBoard e) {
        total += e.price();
    }
}
