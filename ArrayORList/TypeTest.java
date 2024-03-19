package ArrayORList;

import java.util.*;

import static java.util.Arrays.stream;

public class TypeTest {

    public static void main(String[] args) {
        int[] arrayName = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayName[i] = i;
        }

        ArrayList<Integer> arrayListName = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayListName.add(i);
        }

        LinkedList<Integer> linkedListName = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedListName.add(i);
        }

        List<Integer> listName = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listName.add(i);
        }

        // print
//        System.out.println(Arrays.toString(arrayName));
//        System.out.println(arrayListName);
//        System.out.println(linkedListName);
//        System.out.println(listName);

        List<Integer> list1 = linkedListName;
        List<Integer> list2 = new ArrayList<>(linkedListName);
        list1.add(7);
        list2.add(8);

        System.out.println("linkedListName = " + linkedListName);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);


    }
}
