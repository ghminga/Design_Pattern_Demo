package mym.designPartten.prototype;

/**
 * 克隆测试
 */
public class PrototypeTest {
    public static void main(String[] args) {
        PrototypeItem item1 = new PrototypeItem("rua1");
        PrototypeItem item2 = item1.clonePrototype();
        item2.setName("rua2");

        System.out.println(item1.getName());
        System.out.println(item2.getName());
    }
}
