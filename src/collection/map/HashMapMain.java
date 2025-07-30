package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 로그인 과정 구현
public class HashMapMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id1", "1234");
		map.put("id2", "1111");
		map.put("id3", "9999");
		map.put("id4", "0000");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scanner.nextLine();
			System.out.println("---------------");

			// map.containsKey(id) : map에 들어 있는 key값들 중에 id값과 일치하는 게 있다면 true 반환
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					return;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				break;
			}
		}
	}

}
