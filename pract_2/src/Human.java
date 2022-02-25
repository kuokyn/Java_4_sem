import java.time.LocalDate;

public class Human {

    String firstName;
    String lastName;
    int age;
    LocalDate birthDate;
    int weight;

    public Human(String firstName,
            String lastName,
            int age,
            LocalDate birthDate,
            int weight){
        this.age = age;
        this.birthDate = birthDate;
        this.weight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}
