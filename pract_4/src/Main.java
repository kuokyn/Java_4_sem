import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // создаём потоки
        MyExecutorService myExecutorService = new MyExecutorService(10);

        // возврат объекта Future
        myExecutorService.submit(new MyRunnable());

        // завершение выполнения задачи, возврат в виде объекта Future
        System.out.println(myExecutorService.submit(new MyCallable()).get());

        // упорядоченное завершение работы, новые задачи не принимаются
        myExecutorService.shutdown();
    }

}


