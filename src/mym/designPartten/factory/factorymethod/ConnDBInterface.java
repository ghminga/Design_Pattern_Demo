package mym.designPartten.factory.factorymethod;

/**
 * 抽象数据库
 */
public interface ConnDBInterface {
    //获取驱动
    public void getDriver();
    //获取url
    public void getUrl();
    //获取用户名和密码
    public void getUserNameAndPassword();
    //连接数据库
    public void connect();
}
