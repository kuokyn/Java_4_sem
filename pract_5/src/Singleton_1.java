/**
 * Lazy initialized Singleton
 */

public class Singleton_1 {

    private Singleton_1 instance;
    public synchronized Singleton_1 getInstance() {
        if(instance == null) {
            instance = new Singleton_1();
            return instance;
        }
        return instance;
    }

}
