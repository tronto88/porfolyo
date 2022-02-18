package university;
import Sorting;
import Search;
public class Student extends Person {
    public Student(String name, String surname, Integer age) {
        super(name, surname, age);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "}\n";
    }
    public static void main(String[] args) {
        Student[] array = new Student[4];
        array[0] = new Student("John", "John", 30);
        array[1] = new Student("John", "John", 20);
        array[2] = new Student("Jack", "John", 40);
        array[3] = new Student("Jane", "Jane", 25);
        Student value = new Student("Jack", "John", 40);
        int index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
        Sorting.sort(array, Sorting.SortingAlgorithm.BubbleSort);
        index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
    }
}
