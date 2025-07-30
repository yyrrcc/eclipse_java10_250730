package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIter {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("이름", "김지연");
		map1.put("직업", "개발자");
		map1.put("나이", "30");
		map1.put("성별", "여성");

		// key의 값을 이용해야 한다.
		Iterator<String> iter = map1.keySet().iterator();
		while (iter.hasNext()) {
			String mapKey = iter.next(); // key값 추출
			String mapValue = map1.get(mapKey); // key값을 이용하여 value값 가져오기
			System.out.println(mapValue);
		}

		System.out.println("------------------");

		// key, value 한 쌍에 대해서 사용
		Iterator<Map.Entry<String, String>> iter2 = map1.entrySet().iterator();
		while (iter2.hasNext()) {
			Map.Entry<String, String> entry = iter2.next();
			System.out.println(entry); // 이름=김지연
			System.out.println(entry.getKey()); // key의 값만 가져옴
			System.out.println(entry.getValue()); // value의 값만 가져옴
		}
	}

}
