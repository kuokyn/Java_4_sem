import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyMap myMap = new MyMap();
        Map<String, String> map = new HashMap<>();

        Thread one = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                map.put("key_"+i, "value_"+i);
            }
        });

        Thread two = new Thread(()->{
            for (int i = 5000; i < 10000; i++) {
                map.put("key_"+i, "value_"+i);
            }
        });

        Thread three = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                myMap.put("key_"+i, "value_"+i);
            }
        });

        Thread four = new Thread(()->{
            for (int i = 5000; i < 10000; i++) {
                myMap.put("key_"+i, "value_"+i);
            }
        });

        one.start();
        two.start();
        three.start();
        four.start();
        Thread.sleep(3000);
        System.out.println("sync: "+myMap.size());
        System.out.println("non-sync: "+map.size());

        /*-------------------------------------------------*/


        MySet mySet = new MySet();
        Set<String> set = new HashSet<>();

        Thread five = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                set.add(""+i);
            }
        });

        Thread six = new Thread(()->{
            for (int i = 5000; i < 10000; i++) {
                set.add(""+i);
            }
        });

        Thread seven = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                mySet.add(""+i);
            }
        });

        Thread eight = new Thread(()->{
            for (int i = 5000; i < 10000; i++) {
                mySet.add(""+i);
            }
        });

        five.start();
        six.start();
        seven.start();
        eight.start();
        Thread.sleep(3000);
        System.out.println("sync: "+mySet.size());
        System.out.println("non-sync: "+set.size());
    }
}
