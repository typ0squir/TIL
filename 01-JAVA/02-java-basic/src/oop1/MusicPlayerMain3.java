package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // ===================================
        // ============ 메서드 추출 ============
        // ===================================

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);

        // => 모듈화를 했지만 아직 기능과 데이터가 분리되어 있음.

        // - 각 메서드가 모두 MusicPlayerData의 데이터를 사용.
        // => 관련 데이터 변경 시 MusicPlayerMain3의 각 메서드들을 모두 함께 변경해야 함.
        // => 유지 보수 관점에서 관리 포인트가 2곳으로 증가.
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
