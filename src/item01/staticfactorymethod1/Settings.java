package item01.staticfactorymethod1;

public class Settings {
    /**
     * 생성자 : 외부에서 인스턴스 생성을 막을 수 없음
     * 정적 팩토리 메서드 : 외부에서 인스턴스 생성을 막고 호출만 하도록 내부에서 컨트롤이 가능하다.
     */
    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings(){ // 기본 생성자를 외부에서 사용 못하도록 막음

    }

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance(){
        return SETTINGS;
    }



}
