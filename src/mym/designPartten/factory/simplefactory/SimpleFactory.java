package mym.designPartten.factory.simplefactory;
/**
 *
 * 简单工厂例子
 * 在工厂类里，定义静态方法，该方法是作为一个菜单这样的功能，可以根据用户需求，调用所需要的类
 * 可以联想到多态 *
 * 优点:这个简单工厂类可以负责所有的模块
 * *缺点:如果系统十分庞大的话，这SimpleFactory可能会变得十分臃肿 *
 * 思路:
 * 抽象产品(接口)-->具体产品实现(继承接口并增加特性)-->工厂类(唯一而且可能包含多个产品)<--客户类(调用)*
 * */
public class SimpleFactory {
    // 获取数据库驱动的模块
    public static  DBDriver getDBDriver(String dbType) {
        switch (dbType) {
            case "mysql":return new MysqlDriver();
            case "oracle":return new OracleDriver();
            default:return new DB2Driver();
        }
    }

    public static void main(String[] args) {
        DBDriver db = SimpleFactory.getDBDriver("oracle");
        db.connect("127.0.0.1");
        db.open();
        db.disconnect();
    }
}
