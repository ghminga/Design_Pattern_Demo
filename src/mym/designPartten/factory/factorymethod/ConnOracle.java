package mym.designPartten.factory.factorymethod;

/**
 * 连接Oracle的实现类
 */
public class ConnOracle implements ConnDBInterface{

    @Override
    public void getDriver() {
        System.out.println("加载Oracle驱动");
    }

    @Override
    public void getUrl() {
        System.out.println("获取Oracle连接地址127.0.0.1:3306");
    }

    @Override
    public void getUserNameAndPassword() {
        System.out.println("连接Oracle的username:root password:123456");
    }

    @Override
    public void connect() {
        System.out.println("成功连接到Oracle数据库");
    }
}
