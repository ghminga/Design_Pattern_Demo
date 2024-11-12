package mym.designPartten.singleton;

/**
 * 思想:
 * 1.只有一个方法，并且内容是公用的，假如有人修改了实例里的内容，会进行保存
 * 2.防止其他人对他实例化
 * 3.只被创建一次，防止资源浪费
 */
public class OriginThought {
    // 自己持有对象
    private static OriginThought instance;

    // 构造方法私有
    private OriginThought() {

    }

    //提供获取单例对象的方法
    public static OriginThought getInstance() {
        if (instance == null) {
            instance = new OriginThought();
        }
        return instance;
    }

    //以下都是你想让单例对象提供的方法
    public void method1() {
        System.out.println("我是单例提供的方法一");
    }

    public void method2() {
        System.out.println("我是单例提供的方法二");
    }
}
