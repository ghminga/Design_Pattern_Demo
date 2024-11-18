package mym.designPartten.prototype;

/**
 * 因为是想要复制的对象，按照实际填写即可
 */
public class PrototypeItem implements Cloneable{
    String name;

    public PrototypeItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeItem clonePrototype() {
        return new PrototypeItem(name);
    }
}
