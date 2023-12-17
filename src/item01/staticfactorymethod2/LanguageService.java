package item01.staticfactorymethod2;

public interface LanguageService {

    /**
     * java 8 이후로는 인터페이스에 static method 선언이 가능
     */
     static LanguageService of(String lang){
        if(lang.equals("ko")){
            System.out.println("lang = " + lang);
            return new KoreanLanguageService();
        } else {
            System.out.println("lang = " + lang);
            return new EnglishLanguageService();
        }
    }

}
