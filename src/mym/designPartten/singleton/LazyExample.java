package mym.designPartten.singleton;

/**
 * 懒汉式单例模式设计
 * 特点：在第一被需要的时候，才会创建出来，节省资源，
 * 但是要处理多线程同步问题(可能同时需求创建对象导致问题)
 */
public class LazyExample {
    private static LazyExample instance;
    private LazyExample() {

    }
    public static LazyExample getInstance() {
        if (instance == null) {
            instance = new LazyExample();
        }
        return instance;
    }
}
