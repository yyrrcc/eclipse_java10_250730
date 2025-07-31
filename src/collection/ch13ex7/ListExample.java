package collection.ch13ex7;

import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();

		// 1. 향상된 for문
//		for (Board board : list) {
//			System.out.println(board.getTitle() + "-" + board.getContent());
//		}

		// 2. iterator
		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			Board brd = iterator.next();
			System.out.println(brd.getTitle() + "-" + brd.getContent());

		}
	}

}