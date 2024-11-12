package mym.designPartten.factory;
/**工厂模式原型
 * 思想:你不需要知道接口里面的实现，只需要知道这个对象里有的功能
 * 优点:
 * 1.封装性:你只需要知道接口里的方法功能描述，不需要知道具体的实现
 * 2.扩展性:增加新功能，只需要扩展工厂类，不需要修改现有的代码，符合开放封闭原则
 * 3.解耦:减少客户端和具体产品之间的紧密耦合
 * 缺点:
 * 1.类的个数增多，例如有个一个电器工厂，原本只有电饭煲工厂类与电视机工厂类，现在再加一个空调工厂类，如果需要的越多，那么类就会越来越多
 * 2.增加系统理解程度，如果类越来越多会让系统变得无法理解
 * 例子:
 * 1.java.util.Calendar使用工廠方法 getInstance()根據不同的時區和語言環境返回不同的 Calendar子類實例
 * 2.java.text.NumberFormat.使用工廠方法來獲得不同類型的數字格式化象
 * 3.java.sql.DriverManager:獲得資料庫連接的工廠方法
 * 4.Spring 框架中的 Bean 工廠，用於創建和管理應用程序中的對象

 * 3种类
 * 1.简单工模式(simple factory)
 * 4个角色以下所示
 * (1)抽象类(DBDriver)
 * (2)具体产品类[实现抽象类](MysqlDriver，0racleDriver,DB2Driver)
 * (3)工厂类[具体产品类的调用者](SimpleFactory)
 * (4)客户端(调用方，可能有很多种形态，在某个方法里，包括main)

 * 2.工厂方法模式(factory method)
 * 4个角色以下所示
 * (1)抽象产品[唯一,根据不同产品增加](ConnDBInterface)
 * (2)具体产品(ConnMysql,Connoracle)
 * (3)抽象工厂[唯一](FactoryMethodInterface)
 * (4)具体工厂(MysqlFactory,OracleFactory)

 * 3.抽象工厂式(abstract factory)
 * 角色以下所示
 * (1)抽象产品[没有规定唯一或者不唯一，根据情况用来形容各个品牌，可能还有其它品牌](AbstractBenz)
 * (2)具体产品[实现各自的抽象产品以及对应方法](BenzBrand1,BenzBrand2)
 * (3)抽象工厂[与抽象产品一样，没有规定是否唯一，用来形容各个品牌的生产工厂](AbstractFactory)
 * (4)具体工厂[实现各自的抽象工厂以及对应方法](BenzFactory)
 * */
public class OriginThought {
}
