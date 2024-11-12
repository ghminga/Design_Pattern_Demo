package mym.designPartten.singleton;

/**
 * 静态内部类
 * 特点：这种实现使用了一个静态内部类来持有单例的实例，这个静态内部类不会在单例类被载入的时候就载入
 * 而是在实例被需要的时候载入，这种方式既实现了懒加载，也保证了线程安全，是比较推荐的一种方式
 */
public class StaticInnerExample {
    private StaticInnerExample() {

    }

    // 把原本直接定义的对象，放到静态方法里定义
    public static class StaticInnerHolder {
        private final static StaticInnerExample instance = new StaticInnerExample();
    }

    public static StaticInnerExample getInstance() {
        return StaticInnerHolder.instance;
    }
}
