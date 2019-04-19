package factorymethod;

/**
 * 作用：定义抽象工厂类  定义具体工厂的公共接口
 */
abstract class Factory {
    public abstract Product Manufacture();
}


//工厂A类 - 生产A类产品
class  FactoryA extends Factory{
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}

//工厂B类 - 生产B类产品
class  FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
