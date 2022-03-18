import java.util.HashSet;
import java.util.Set;

public class Building {

    public static void main(String[] args) {
        Set<Person> parents = new HashSet<>();

        Person father = new Person.Builder()
                .withName("Carl")
                .withSurname("Smith")
                .withAge(30)
                .withHeight(165)
                .withWeight(55)
                .build();

        Person mother = new Person.Builder()
                .withName("Joanne")
                .withSurname("Smith")
                .withAge(32)
                .withHeight(180)
                .withWeight(70)
                .build();

        parents.add(father);
        parents.add(mother);

        Person child = new Person.Builder()
                .withName("Noah")
                .withSurname("Smith")
                .withAge(4)
                .withHeight(110)
                .withWeight(20)
                .withParents(parents)
                .build();
        System.out.println(child);
    }
}

class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    Person(){}

    /* // различные конструкторы
    Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person (String name, String surname, int age, int height){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    public Person(String name, String surname, int age, int height, int weight, Set<Person> parents) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.parents = parents;
    }

    public Person(String name, String surname,Set<Person> parents) {
        this.name = name;
        this.surname = surname;
        this.parents = parents;
    }

    public Person(String name, String surname, int age, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    */
    @Override
    public String toString() {
        return "\nPerson{" +
                "\n\tname='" + name + '\'' +
                ",\n\t surname='" + surname + '\'' +
                ",\n\t age=" + age +
                ",\n\t height=" + height +
                ",\n\t weight=" + weight +
                ",\n\t parents=" + parents +
                "\n}";
    }
    /* //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Set<Person> getParents() {
        return parents;
    }

    public void setParents(Set<Person> parents) {
        this.parents = parents;
    }
       */
    public static class Builder {
        private final Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){
            newPerson.parents = parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }
}