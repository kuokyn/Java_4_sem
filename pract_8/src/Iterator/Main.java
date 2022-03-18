package Iterator;

public class Main {

    public static void main(String[] args) {
        ObjectsList list = new ObjectsList();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
