package item01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**
         * Comparator로 리스트 정렬/역정렬
         */

        List<Integer> list = new ArrayList();

        list.add(50);
        list.add(100);
        list.add(1);

        for (Object o : list) {
            System.out.println(o);
        }

        /*
        Comparator<Integer> desc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        */

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        Collections.sort(list, desc); // desc
        Collections.reverse(list); // asc
        System.out.println(list);


    }
}
