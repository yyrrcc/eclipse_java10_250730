package thread;

import java.awt.Toolkit;

public class BeepTest1 {

	public static void main(String[] args) {
		// Toolkit은 추상 클래스. 객체 생성 안 됨.
		// static 메서드 .getDefaultToolkit() 가져오기(?)
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			// beep() : 비프음 발생
			toolkit.beep();
			System.out.println("빵");
			// java.lang 소속 Thread 클래스
			try {
				Thread.sleep(1000); // cpu를 ()초(1초 1000ms) 만큼 일시 정지(쉬게 만듬, 잠자게 만듬), for의 반복 속도를 조절해줌
			} catch (InterruptedException e) { // 예외처리
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 이건 스레드가 하나 밖에 없음. 이 안에서 for문이 차례대로 진행 (이렇게 되면 약 10초 걸림)
	}

}
