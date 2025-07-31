package stack1;

import java.util.Stack;

public class ReverseWordMain {
	public static void main(String[] args) {
		String str = "Hello";

		// 한글자씩 뺄 거니까 타입 매개변수를 Character로 하는 게 좋다
		Stack<Character> word = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			word.push(c);
		}

		while (!word.isEmpty()) {
			System.out.println(word.pop());
		}
	}
}
