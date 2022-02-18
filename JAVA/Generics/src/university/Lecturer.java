package university;
import search.Search;
import sorting.Sorting;
public class Lecturer extends Person {
    public Lecturer(String name, String surname, Integer age) {
        super(name, surname, age);
    }
    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "}\n";
    }
    public static void main(String[] args) {
        Lecturer[] array = new Lecturer[4];
        array[0] = new Lecturer("John", "John", 30);
        array[1] = new Lecturer("John", "John", 20);
        array[2] = new Lecturer("Jack", "John", 40);
        array[3] = new Lecturer("Jane", "Jane", 25);
        Lecturer value = new Lecturer("Jack", "John", 40);
        int index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0 ? array[index] : "?"));
        Sorting.sort(array, Sorting.SortingAlgorithm.BubbleSort);
        index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0 ? array[index] : "?"));

    }
}
