package mym.designPartten.factory.simplefactory;

/**
 * 作为产品来实现数据库驱动
 */
public class OracleDriver implements DBDriver{
    @Override
    public void connect(String ip) {
        System.out.println("成功连接到Oracle数据库，数据库地址是:"+ip);
    }

    @Override
    public void disconnect() {
        System.out.println("数据库连接以关闭");
    }

    @Override
    public void open() {
        System.out.println("正在对Oracle数据库进行操作");
    }
}
