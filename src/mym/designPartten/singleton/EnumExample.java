package mym.designPartten.singleton;

/**
 * 枚举
 * 特点:在Java中，这是实现单例的最佳方式
 * Java枚举类型的特性确保了枚举的实例永远只有一个，而且创建是线程安全的
 * 枚举类型的单例是饥饿单例
 *
 */
public enum EnumExample {
    INSTANCE;

    //上面仅仅一句话就实现了单例的对象创建，以下直接是内部方法
    public void doSomething() {
        System.out.println("我要做单例枚举类型里定义单例方法，确认接下来要做的事情");
    }
}
