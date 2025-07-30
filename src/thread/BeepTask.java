package thread;

public class BeepTask implements Runnable {
// 무조건 run() 메서드 안에 들어가야 함.
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
