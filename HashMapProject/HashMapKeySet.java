package HashMapProject;

import java.util.HashMap;

public class HashMapKeySet {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>(){{ //초기값 지정
            put(2023,"사과");
            put(11,"바나나");
            put(2,"포도");
        }};

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
    }
}
