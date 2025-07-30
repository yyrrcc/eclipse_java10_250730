package thread;

import java.awt.Toolkit;

public class BeepTest2 {

	public static void main(String[] args) {
		// Runnable : 인터페이스
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // beepTask 작업을 스레드화 -> 멀티 스레드
		thread.start(); // 메인 스레드 외 독립된 스레드도 작동 시킴.

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("빵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 이렇게 되면 동시에 진행이 됨 (총 5초 걸림)
	}

}
