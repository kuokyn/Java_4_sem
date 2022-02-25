import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1234567890","0987654321", "1235");
        Function<String> mirrored = (array) -> {
            ListIterator<String> listIterator = list.listIterator();
            List<String> list2 = new ArrayList<>();
            while (listIterator.hasNext()) {
                String element = listIterator.next();
                element = new StringBuilder(element).reverse().toString();
                list2.add(element);
            }
            return list2;
        };

        System.out.println(Arrays.toString(mirrored.mirror(list).toArray()));
    }

}
