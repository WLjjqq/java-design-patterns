package AbstractFactory;

/**
 * 作用：
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        //超级工厂去创建生产宝马的工厂
        AbstractFactory bmwFactory = FactoryProducer.getFactory("AbstractFactory.BMWFactory");
        //宝马工厂去生产具体的宝马类型
        bmwFactory.getCar("AbstractFactory.BMW320").drive();

        //超级工厂去创建生产宝马的工厂
        AbstractFactory benzFactory = FactoryProducer.getFactory("AbstractFactory.BenzFactory");
        //宝马工厂去生产具体的宝马类型
        benzFactory.getCar("AbstractFactory.BenzC200").drive();
    }
}
