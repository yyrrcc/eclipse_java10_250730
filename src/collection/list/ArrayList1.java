package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		// List : java.util 인터페이스
		// <E> : 타입 파라미터 (보통 클래스 이름 적음)
		// 인터페이스니까 객체 못 만듬. List의 자식 중 제일 많이 사용되는 건 ArrayList. 업캐스팅.
		List<String> strList = new ArrayList<String>();

		// 요솟값 추가 add
		strList.add("Java");
		strList.add("JavaScipt");
		strList.add(1, "Spring");

		// 요솟값 가져오기 get
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));

		// 요솟값 지우기 remove
		strList.remove(0);
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));

		// 향상된 for문으로 요솟값 가져오기
		for (String string : strList) {
			System.out.println(string);
		}

	}
}
