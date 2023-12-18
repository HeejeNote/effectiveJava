package item01.staticfactorymethod4;

public enum OrderStatus {
    /**
     * ::: Class 와의 차이점 :::
     * Enum은 상속을 받을 수 없다. -> 다형성 설계 불가
     * Enum은 동적으로 객체를 생성할 수 없다. -> 객체를 인스턴스화 해서 갖는 인스턴스 변수를 가질 수 없다.
     */
//    PREPARING, SHIPPED, DELIVERING, DELIVERED
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }


}
