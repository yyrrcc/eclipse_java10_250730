package thread;

// Thread 클래스를 상속하기
public class Horse extends Thread {
	private String horseName;

	public Horse(String horseName) {
		super();
		this.horseName = horseName;
	}

	@Override
	public void run() {
		int distance = 0;
		final int ENDLINE = 50;

		// 말 달리기
		while (distance < ENDLINE) {
			// 1~3 사이 랜덤값만큼 갈 수 있게
			distance += (int) (Math.random() * 3 + 1);

			// 말의 이름, 현재 distance 값 입력
			printHorse(horseName, distance);

			// 스레드
			try {
				Thread.sleep(1000); // 1초마다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(horseName + " 결승선을 통과하였습니다.");
	}

	public void printHorse(String horseName, int position) { // 말의 위치 출력하는 메서드
		System.out.println(horseName + " : " + position);
	}

}
