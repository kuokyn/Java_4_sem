/**
 * Initialization on Demand Holder
 */

public class Singleton_3 {

    private Singleton_3() {

    }
    private static class SingletonHolder{
        private final static Singleton_3 instance = new Singleton_3();
    }

    private static Singleton_3 getInstance(){
        return SingletonHolder.instance;
    }
}
