package mym.designPartten.factory.factorymethod;

/**
 * 连接Mysql的实现类
 */
public class ConnMysql implements ConnDBInterface{

    @Override
    public void getDriver() {
        System.out.println("加载mysql驱动");
    }

    @Override
    public void getUrl() {
        System.out.println("获取mysql连接地址127.0.0.1:3306");
    }

    @Override
    public void getUserNameAndPassword() {
        System.out.println("连接mysql的username:root password:123456");
    }

    @Override
    public void connect() {
        System.out.println("成功连接到mysql数据库");
    }
}
