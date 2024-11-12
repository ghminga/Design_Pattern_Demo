package mym.designPartten.factory.simplefactory;

/**
 * 以数据库驱动做例子
 * 让用户选择想要的数据库驱动
 */
public interface DBDriver {
    public void connect(String ip);
    public void disconnect();
    public void open();
}
