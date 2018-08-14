package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Cpu extends Equipment {
    @Override
    public void accept(Visitor vls) {
        System.out.println("Cpu has been visited");
        vls.visitCpu(this);
    }

    @Override
    public double price() {
        return 800.00;
    }
}
