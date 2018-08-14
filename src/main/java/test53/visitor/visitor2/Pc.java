package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Pc extends Composite {

    public Pc() {
        super.add(new IntegratedBoard());
        super.add(new HardDisk());
        super.add(new Case());
    }

    @Override
    public void accept(Visitor vls) {
        System.out.println("Pc has been visited");
        super.accept(vls);
    }
}
