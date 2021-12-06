package singletonPattern;

public class SystemSpeaker {

    private static SystemSpeaker instance;

    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        // 시스템 스피커
        instance = instance == null ? new SystemSpeaker() : instance;
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
