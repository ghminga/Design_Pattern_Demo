package mym.designPartten.factory.factorymethod;

/**
 * 专门连接Oracle的工厂
 */
public class OracleFactory implements FactoryMethodInterface{
    @Override
    public ConnDBInterface getDBconn() {
        return new ConnOracle();
    }
}
