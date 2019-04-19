package AbstractFactory;

/**
 * 作用：奔驰汽车的产品类
 */
public abstract class BenzCar extends Car {
}

//奔驰C200的具体实现
class BenzC200 extends BenzCar {
    public void drive()
    {
        System.out.println("BenzC200,实惠有面");
    }
}

//奔驰E300的具体实现
class BenzE300 extends BenzCar {
    public void drive()
    {
        System.out.println("BenzE300,商务气派");
    }
}