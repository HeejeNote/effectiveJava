package item01.staticfactorymethod1;

public class Order {
    /**
     *  생성자의 타입(시그니쳐)가 중복되는 경우
     *  -> 정적 팩토리 메서드를 사용한다.
     */
    private boolean prime;

    private boolean urgent;

    private Product product;

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

    /*
    public Order(boolean urgent, Product product) {
        this.urgent = urgent;
        this.product = product;
    }

    public Order(boolean urgent, Product product) {
        this.prime = prime;
        this.product = product;
    }
    */

}
