package mym.designPartten.factory.abstractfactory;

/**
 * Benz品牌二
 */
public class BenzBrand2 extends AbstractBenz{
    @Override
    public void start() {
        System.out.println("品牌二奔驰跑车启动");
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
