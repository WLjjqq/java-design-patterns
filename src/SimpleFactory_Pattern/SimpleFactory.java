package SimpleFactory_Pattern;

/**
 * 作用：简单工厂模式
 */
public class SimpleFactory {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        factory.produce(1).run();
    }
}
    //抽象产品
    interface Phone {
        void run();
    }

    //具体产品 meizu
    class MeiZuPhone implements Phone {

        @Override
        public void run() {
            System.out.println("魅族手机");
        }
    }

    //具体产品 huawei
    class HuaWeiPhone implements Phone {

        @Override
        public void run() {
            System.out.println("华为手机");
        }
    }

    class Factory{
        Phone produce(int produce) throws Exception{
            if(produce == 1){
                return new MeiZuPhone();
            }
            else if (produce == 2) {
                return new HuaWeiPhone();
            }
            throw new Exception("没有手机");
        }
    }

