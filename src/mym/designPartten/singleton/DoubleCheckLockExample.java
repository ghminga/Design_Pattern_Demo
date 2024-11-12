package mym.designPartten.singleton;

/**
 * 双重检测所锁定
 * 特点:
 * 结合了懒汉与饿汉式的特点，在创建之前与之后都做了校验，以确保只创建了一个实例
 * 这种方式在多线程环境，也可以做的很好，缺点是由于Java模型问题，在某些情况下失效
 *
 * 某些情况导致失效并解决方法:见类HasSerializableSingleExample
 */
public class DoubleCheckLockExample {
    private static volatile DoubleCheckLockExample instance;
    private DoubleCheckLockExample() {

    }
    public static DoubleCheckLockExample getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockExample.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockExample();
                }
            }
        }
        return instance;
    }
}
