package mym.designPartten.factory.abstractfactory;

/**
 * 奔驰具体实现类
 */
public class BenzFactory extends AbstractFactory{
    @Override
    public AbstractBenz getBenzBrand1() {
        return new BenzBrand1();
    }

    @Override
    public AbstractBenz getBenzBrand2() {
        return new BenzBrand2();
    }
}
