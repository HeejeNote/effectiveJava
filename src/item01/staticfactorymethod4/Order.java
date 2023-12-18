package item01.staticfactorymethod4;

import java.util.EnumMap;
import java.util.HashMap;

public class Order {
    /**
     *  생성자의 타입(시그니쳐)가 중복되는 경우
     *  -> 정적 팩토리 메서드를 사용한다.
     */
    private boolean prime;
    private boolean urgent;
    private Product product;
    private OrderStatus orderStatus;

    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Order order = new Order();

        if(order.orderStatus == OrderStatus.DELIVERED){
            System.out.println("== DELIVERED");
        } else {
            System.out.println("== None");
        }

        // equals() 메서드는 null 체크를 하기 때문에 NullPointerException 에러 발생.
        /*
        if(order.orderStatus.equals(OrderStatus.DELIVERED)){
            System.out.println("equals DELIVERED");
        }
        */

        /**
         * EnumMap 정렬순서 -> Enum에 정의된 순서대로 정렬
         *
         */
        EnumMap<OrderStatus, String> enumMap = new EnumMap<>(OrderStatus.class);
        long enumMapStartTime = System.nanoTime();

        enumMap.put(OrderStatus.PREPARING, "발송준비중");
        enumMap.put(OrderStatus.SHIPPED, "발송완료");
        enumMap.put(OrderStatus.DELIVERING,"배송중");
        enumMap.put(OrderStatus.DELIVERED,"배송완료");

        for (String value : enumMap.values()) {
            System.out.println("value = " + value);
        }

        long enumMapEndTime = System.nanoTime();
        long enumMapTime = enumMapEndTime - enumMapStartTime;
        System.out.println("EnumMapTime :::" + enumMapTime);


        HashMap<OrderStatus, String> hashMap = new HashMap<>();
        long hashMapStartTime = System.nanoTime();

        hashMap.put(OrderStatus.PREPARING,"발송준비중");
        hashMap.put(OrderStatus.SHIPPED, "발송완료");
        hashMap.put(OrderStatus.DELIVERING,"배송중");
        hashMap.put(OrderStatus.DELIVERED,"배송완료");

        for (String value : hashMap.values()) {
            System.out.println("value = " + value);
        }

        long hashMapEndTime = System.nanoTime();
        long hashMapTime = hashMapEndTime - hashMapStartTime;
        System.out.println("HashMapTime ::: " + hashMapTime);

    }


}
