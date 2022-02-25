import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        LocalDate date = LocalDate.of(2003, 1, 26);
        list.add(new Human("Куки", "Чен", 26, date, 53));
        list.add(new Human("Иван", "Иванов", 18, date, 65));
        list.add(new Human("Андрей", "Андреев", 33, date, 83));
        list.add(new Human("Ян", "Янг", 21, date, 61));

        list.stream()
                .filter(human -> !human.lastName.equals("Иванов"))
                .sorted(Comparator.comparingInt(Human::getWeight).reversed())
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Multiplied: " + list.stream()
                                            .mapToInt(Human::getAge)
                                            .reduce(1, (a,b) -> a*b));
    }
}
