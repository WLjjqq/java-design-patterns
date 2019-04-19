package AbstractFactory;

/**
 * 作用：抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract Car getCar(String type) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException;
}

//宝马工厂，生产所有的宝马类型
class BMWFactory extends AbstractFactory{

    @Override
    public Car getCar(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(type);
        return (BMWCar) aClass.newInstance();
    }
}

//奔驰工厂，生产所有的奔驰
class BenzFactory extends AbstractFactory{

    @Override
    public Car getCar(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(type);
        return (BenzCar) aClass.newInstance();
    }
}
