package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 * Description: 集成主板, 包括主板和cpu
 */
public class IntegratedBoard extends Composite {    //[ˈɪntɪɡretɪd] 完整的； 整体的； 结合的

    public IntegratedBoard() {
        super.add(new MainBoard());
        super.add(new Cpu());
    }

    @Override
    public void accept(Visitor vls) {
        System.out.println("IntegratedBoard has been visited");
        super.accept(vls);
    }
}
