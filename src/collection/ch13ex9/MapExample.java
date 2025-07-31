package collection.ch13ex9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
// [ 1. 평균 점수 2. 최고 점수 3. 최고 점수를 받은 아이디 ] 출력하기 -> 키, 값을 가져와야 함

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// Map.Entry<K, V> : 한 쌍의 "키(key)와 값(value)" 담고 있는 객체
		// map.entrySet()은 Map에 들어있는 모든 entry(Entry<K, V>)를 Set 형태로 반환
		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
		for (Entry<String, Integer> entry : mapEntry) {
			int values = entry.getValue(); // 맵 value 값 가져오기
			totalScore += values;
			if (values > maxScore) {
				maxScore = values;
				name = entry.getKey(); // 맵 key 값 가져오기
			}
		}
		System.out.println("평균 점수: " + (totalScore / map.size()));
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);

	}
}
