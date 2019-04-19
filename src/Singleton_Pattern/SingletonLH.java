package Singleton_Pattern;

/**
 * 作用：懒汉 单例模式
 */
public class SingletonLH {

    private static SingletonLH singletonLH;
    //私有的，是只能创建一个实例。
    private SingletonLH(){

    }

    /**
     * 供别人去调用使用这个对象。
     * 懒汉是线程不安全的。如果要在多线程中使用的话。就需要加上锁。但是会影响效率。
     * 如果A在使用，B要去使用的时候就只能排队了。
     */
    public static synchronized  SingletonLH getInstance() {
        if (singletonLH == null) {
            singletonLH = new SingletonLH();
        }
        return singletonLH;
    }

}
