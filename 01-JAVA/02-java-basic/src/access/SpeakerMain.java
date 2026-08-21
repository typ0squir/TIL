package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근해 수정");
        // Speaker의 volume필드가 default인 경우
        // speaker.volume = 200;   // 음량을 100보다 크게 올라가지 않도록 제약했던 것을 무력화시켜버림.
        speaker.showVolume();
    }
}
