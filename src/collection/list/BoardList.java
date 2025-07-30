package collection.list;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardList {

	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<Board>();
		Date nowDate = new Date();

		// add 방법 1
		Board board1 = new Board();
		board1.setWriter("김민지");
		board1.setSubject("안녕하세요.");
		board1.setContent("만나서 반갑습니다");
		board1.setDate(new Timestamp(nowDate.getTime()));
		boardList.add(board1);

		// add 방법 2
		boardList.add(new Board("박지연", "저도 안녕하세요.", "만나서 반가워요", new Timestamp(nowDate.getTime())));

		// add 방법 3
		Board board2 = new Board("최수정", "ㅎㅇㅎㅇ", "반갑", new Timestamp(nowDate.getTime()));
		boardList.add(board2);

		// 출력
		for (int i = 0; i < boardList.size(); i++) {
			Board board = boardList.get(i);
			System.out.println(board.getSubject() + " / " + board.getContent() + " / " + board.getWrite() + " / "
					+ board.getDate());
		}

	}

}
