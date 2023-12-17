package item01.staticfactorymethod3;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) {
        /**
         *  ServiceLoader :::
         *  ServiceLoader<S> // Iterable<S>
         *  특정 구현체에 의존적이지 않을수 있으며 , 유연한 설계가 가능해진다.
         */

        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class); // 구현체들을 로드 한다.
        Optional<HelloService> helloServiceOptional = loader.findFirst(); // 조건에 맞는 첫번째 값을 찾는다.
        helloServiceOptional.isPresent(); // 값이 존재하면 필요 로직 작성

        // 인스턴스를 직접 생성해서 특정 클래스에 의존성 부여
        HelloService helloService = new HelloService() {
            @Override
            public String hello() {
                return "hi";
            }
        };
        System.out.println("helloService = " + helloService.hello());
    }
}
