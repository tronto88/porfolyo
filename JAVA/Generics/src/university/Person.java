package university;
import search.Search;
import sorting.Sorting;
public class Person implements Comparable<Person> {
    String name;
    String surname;
    Integer age;
    Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "}\n";
    }
    @Override
    public int compareTo(Person p) {
        int last = this.surname.compareTo(p.surname);
        int first = this.name.compareTo(p.name);
        int age = this.age.compareTo(p.age);

        // sort based on: surname -> name ->  age
        return last == 0 ? (first == 0 ? age : first) : last;
    }
    public static void main(String[] args) {
        Person[] array = new Person[4];
        array[0] = new Student("John", "John", 30);
        array[1] = new Person("John", "John", 20);
        array[2] = new Person("Jack", "John", 40);
        array[3] = new Lecturer("Jane", "Jane", 25);
        Person value = new Person("Jack", "John", 40);
        int index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
        Sorting.sort(array, Sorting.SortingAlgorithm.BubbleSort);
        index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
    }
}
