package collection.ch13ex9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// 배열처럼 키값을 넣어주기 -> 순서 상관 없으니 set으로
		Set<String> setKey = new HashSet<String>();
		// for문으로 높은 점수 찾기?
		for (int i = 0; i < map.size(); i++) {

		}
	}
}