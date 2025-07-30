package collection.list;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Board> list1 = new ArrayList<Board>();
		List<Board> list2 = new LinkedList<Board>();

		Date nowDate = new Date();

		Board board = new Board("글쓴이", "제목", "내용입니다.", new Timestamp(nowDate.getTime()));

		long startTime;
		long finishTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(board);
		}
		finishTime = System.nanoTime();
		System.out.println("ArrayList 작업 시간: " + (finishTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(board);
		}
		finishTime = System.nanoTime();
		System.out.println("LinkedList 작업 시간: " + (finishTime - startTime));

		// 조회(검색) 속도 : ArrayList가 빠름
		// 삽입, 삭제 속도 : LinkedList가 빠름
	}

}
