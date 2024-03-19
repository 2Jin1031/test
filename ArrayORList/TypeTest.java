package ArrayORList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TypeTest {

    public static void main(String[] args) {
        int [] arrayName = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayName[i] = i;
        }

        ArrayList<Object> arrayListName = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayListName.add(i);
        }

        LinkedList<Object> linkedListName = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedListName.add(i);
        }

        List<Integer> listName = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listName.add(i);
        }

        // print
        System.out.println(Arrays.toString(arrayName));
        System.out.println(arrayListName);
        System.out.println(linkedListName);
        System.out.println(listName);
    }

}
