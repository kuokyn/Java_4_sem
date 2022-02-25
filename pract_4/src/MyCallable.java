import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

    @Override
    public Object call() {
        return "callable";
    }
}
