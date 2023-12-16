package item01;

public class Item01 {
    public static void main(String[] args) {



//        Settings settings = new Settings(); //  default 생성자 private 처리로 인해 인스턴스 생성 불가

        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();
        System.out.println("settings1 = " + settings1);
        System.out.println("settings2 = " + settings2);

        Boolean aTrue = Boolean.TRUE;   //    public static final Boolean TRUE = new Boolean(true);
        Boolean aFalse = Boolean.FALSE; //   public static final Boolean FALSE = new Boolean(false);

    }
}
