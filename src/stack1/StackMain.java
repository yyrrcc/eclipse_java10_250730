package stack1;

import java.util.Stack;

public class StackMain {
	// Stack : Last in First Out 후입선출
	// 클래스
	// 넣을 때 push(), 꺼내올 때 pop()

	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<String>();
		stack1.push("1. 하나");
		stack1.push("2. 둘");
		stack1.push("3. 셋");

		while (!stack1.isEmpty()) { // stack이 비어있지 않으면
			String str = stack1.pop();
			System.out.println(str);
		}
	}
}
