package mym.designPartten.factory.factorymethod;

import mym.designPartten.factory.simplefactory.OracleDriver;

/** * 工厂方法
 *特点:每一个产品都有自己的工厂类，不同的工厂负责不同的实例
 * 解决了simplefactory在多功能情况下太过庞大的问题
 * 例子:还是使用连接数据库作为例子
 * 优点:减轻工厂的负担，让工厂只负责单一的产品，且进行代码新增的时候，只需要新增新的工厂，不需要进行修改旧的工厂，符合开放-封闭原则
 * 缺点:对于生产产品存在产品族的情况下十分复杂
 * 思路:
 * 抽象工厂<--具体工厂 抽象类<--具体类 <--(调用)具体工厂<--(创建并使用工厂)用户
 * */
public class FactoryMethodFactory {
    public static void main(String[] args) {
        MysqlFactory mf = new MysqlFactory(); //调用mysql工厂
        OracleFactory of = new OracleFactory(); //调用Oracle工厂
        mf.getDBconn().getDriver();
        mf.getDBconn().getUrl();
        mf.getDBconn().getUserNameAndPassword();
        mf.getDBconn().connect();

        of.getDBconn().getDriver();
        of.getDBconn().getUrl();
        of.getDBconn().getUserNameAndPassword();
        of.getDBconn().connect();
    }
}
