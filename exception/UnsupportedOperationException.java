package exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationException {

    public static void main(String[] args) {
        // UnsupportedOperationException 이 일어나는 코드
//        List<String> tempList = Arrays.asList("aaa");
//        System.out.println("tempList = " + tempList);
//
//        tempList.add("bbb");

        List<String> tempList = new ArrayList<>(Arrays.asList("aaa"));
        System.out.println("tempList = " + tempList);

        tempList.add("bbb");
        System.out.println("tempList = " + tempList);
    }
}
