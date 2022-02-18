import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ListExample {
    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList();
        List<String> myLinkedList = new LinkedList();
        myArrayList.add(new String("Hello"));
        myArrayList.add(new String("World!"));
        myLinkedList.add(new String("Hello"));
        myLinkedList.add(new String("World!"));
        System.out.println("ArrayList contains \"Hello!\": " + myArrayList.contains("Hello"));
        System.out.println("LinkedList contains \"World!\": " + myLinkedList.contains("World!"));
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("ArrayList get " + i + ": " + myArrayList.get(i));
        }
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("LinkedList get " + i + ": " + myLinkedList.get(i));
        }
        System.out.println("ArrayList isEmpty(): " + myArrayList.isEmpty());
        System.out.println("LinkedList isEmpty(): " + myLinkedList.isEmpty());
        myArrayList.remove("World!");
        myLinkedList.remove(1);
        for (String str: myArrayList) {
            System.out.println("ArrayList str: " + str);
        }
        for (String str: myLinkedList) {
            System.out.println("LinkedList str: " + str);
        }
    }
}
