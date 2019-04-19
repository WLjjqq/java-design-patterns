package AbstractFactory;

/**
 * 作用：宝马产品的产品类
 */
public abstract class BMWCar extends Car{
}

//宝马BMW320的具体实现
class BMW320 extends BMWCar{

    @Override
    void drive() {
        System.out.println("BMW320，老板专用。");
    }
}

//宝马BMW530的具体实现
class BMW530 extends BMWCar {
    public void drive()
    {
        System.out.println("BMW530，时不我待。");
    }
}

