package thread;

public class HorseRace {
	public static void main(String[] args) {
		// 말 4마리 객체 생성
		Horse horse1 = new Horse("1번말");
		Horse horse2 = new Horse("2번말");
		Horse horse3 = new Horse("3번말");
		Horse horse4 = new Horse("4번말");

		// 스레드 시작
		horse1.start(); // horse1.run() 메소드 실행
		horse2.start();
		horse3.start();
		horse4.start();
	}

}
