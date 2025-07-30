package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("피겨", "김연아");
		map1.put("배구", "김연경");
		map1.put("배드민턴", "안세영");
		map1.put("양궁", "안산");

		System.out.println(map1.get("배구"));
		System.out.println(map1.get("배드민턴"));

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("햇님반", 90);
		map2.put("꽃님반", 70);
		map2.put("장미반", 85);
		System.out.println(map2.size());

	}

}
