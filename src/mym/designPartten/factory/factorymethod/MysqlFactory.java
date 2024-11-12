package mym.designPartten.factory.factorymethod;

/**
 * 专门连接mysql的工厂
 */
public class MysqlFactory implements FactoryMethodInterface{
    @Override
    public ConnDBInterface getDBconn() {
        return new ConnMysql();
    }
}
