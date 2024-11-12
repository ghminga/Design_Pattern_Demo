package mym.designPartten.factory.abstractfactory;

/**
 * Benz品牌一
 */
public class BenzBrand1 extends AbstractBenz{
    @Override
    public void start() {
        System.out.println("品牌一奔驰跑车启动");
    }

    @Override
    public void run() {
        System.out.println("正在行驶");
    }

    @Override
    public void stop() {
        System.out.println("停车");
    }
}
