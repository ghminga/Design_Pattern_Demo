package mym.designPartten.singleton;

/**
 * 饿汉式单例设计模式
 * 特点:在载入时就被创建，这种创建方式可以避免多线程同步问题(多个线程同时创建该单例类)
 * 但在类载入时就占用资源
 */
public class HungeMan {
    private static HungeMan instance = new HungeMan();
    private HungeMan() {

    }
    public static HungeMan getInstance() {
        if(instance == null) {
            instance = new HungeMan();
        }
        return instance;
    }
}
