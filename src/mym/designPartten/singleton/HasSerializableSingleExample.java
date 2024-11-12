package mym.designPartten.singleton;

import java.io.Serializable;

/**
 * 单例模式失效场景1:Java的序列号和Java反序列化，两者操作都会产生新对象
 * 问题解释：因为每次反序列化都会产生新的对象，而不是使用原初的那个对象
 * 解决方案：添加readResolve方法，这个方法会在反序列化时被调用
 *
 */
public class HasSerializableSingleExample implements Serializable {
    private static final long serialVersionUID = 1L;
    private static HasSerializableSingleExample instance;
    //私有构造方法确保外部无法直接序列化
    private HasSerializableSingleExample() {

    }
    public static HasSerializableSingleExample getInstance() {
        if (instance == null) {
            instance = new HasSerializableSingleExample();
        }
        return instance;
    }

    // readResolve方法确保单例
    private Object readResolve() {
        return instance;
    }
}
