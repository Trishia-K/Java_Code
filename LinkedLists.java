import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        //Creating a LinkedList
        LinkedList<String> list = new LinkedList<String>();
        //Adding elements to the linked list using add() method
        list.add("Exercise One");
        list.add("Exercise Two");
        list.add("Exercise Three");
        list.add("Exercise Four");
        list.add("Exercise Five");

        System.out.println(list);

        //Using the remove method
        list.remove("Exercise One");
        System.out.println(list);

        //Iterating through the new list from the
        ListIterator<String> listIterator = list.listIterator();
        //making the list vertical
        System.out.println("The list using list iterator is as below:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        //
    }

}
