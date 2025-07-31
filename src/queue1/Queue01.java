package queue1;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
// Queue : 선입선출 First In First Out

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1. 하나");
		queue.offer("2. 둘");
		queue.offer("3. 셋");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
