package Singleton_Pattern;

/**
 * 作用：单例模式  饿汉
 */
public class SingletonEH {
    private SingletonEH(){}

    //类加载的时候就要创建出来
    private static SingletonEH singletonEH = new SingletonEH();

    //供调用
    public static SingletonEH getInstance() {
        return singletonEH;
    }
}
