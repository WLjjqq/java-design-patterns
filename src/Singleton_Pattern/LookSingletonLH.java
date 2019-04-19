package Singleton_Pattern;

/**
 * 作用：使用双重加锁机制
 */
public class LookSingletonLH {
    private LookSingletonLH(){}

    private static LookSingletonLH lookSingletonLH;


    public static LookSingletonLH getInstance() {
        if(lookSingletonLH == null){

            //在同一个时刻加了锁的那部分程序只有一个线程可以进入
            synchronized (LookSingletonLH.class) {
                if (lookSingletonLH == null) {
                    lookSingletonLH = new LookSingletonLH();
                }
            }
        }
        return lookSingletonLH;
    }
}
