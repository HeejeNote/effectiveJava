package item01.staticfactorymethod4;

import java.util.Arrays;

public class Item01Main4 {
    public static void main(String[] args) {
        // 1
        OrderStatus[] values = OrderStatus.values();

        for (OrderStatus value : values) {
            System.out.println(value);
        }

        // 2
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);



    }

}
