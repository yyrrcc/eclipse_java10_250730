package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		// Set : java.util 패키지 인터페이스
		// 주로 사용하는 건 HashSet
		// 인덱스가 없다 -> .get 없음
		// 순서도 없음
		// 중복 제거용
		Set<String> set1 = new HashSet<String>();

		set1.add("Hi");
		set1.add("Hello");
		System.out.println("set1 객체 수: " + set1.size());

		set1.add("Good bye");
		set1.add("Hello");
		set1.add("Happy");
		set1.add("Hi");
		System.out.println("set1 객체 수: " + set1.size());

		// 향상된 for문
		for (String string : set1) {
			System.out.println(string);
		}

		// Iterator<E> iterator() : 저장된 객체를 한 번씩 가져오는 반복자를 리턴함
		// hasNext(): 꺼낼 요소가 남아 있는지 확인 (true/false 반환)
		// next(): 다음 요소를 반환
		Iterator<String> setIter = set1.iterator();
		while (setIter.hasNext()) {
			String str = setIter.next();
			if (str.equals("Good bye")) {
				setIter.remove();
			}
			System.out.println(setIter.next());
		}

		if (set1.isEmpty()) {
			System.out.println("비어 있음");
		} else {
			System.out.println("비어 있지 않음");
		}

	}

}
