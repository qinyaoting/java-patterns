package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Client {

    private static PriceVisitor pv;
    private static InventoryVisitor iv;

    private static Equipment equipment;

    public static void main(String[] args) {
        equipment = new Pc();
        pv = new PriceVisitor();
        equipment.accept(pv);
        System.out.println("price:" + pv.value());  // 零件的总价格
        iv = new InventoryVisitor();
        equipment.accept(iv);
        System.out.println("number:" + iv.size());  //零件总数
    }
}
