package collection.ch13ex7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	// getBoardList() 메서드 만들어보기

	public List<Board> getBoardList() {
		// List 리스트, Board 클래스에 값들을 만들기
		// 방법1 board 인스턴스 만들어서 요솟값을 하나하나 넣기
		// 방법2 리스트에 직접 인스턴스 만들고 바로 요솟값 넣기
		// 만들어준 리스트를 반환하기, 반환타입 작성
		List<Board> boards = new ArrayList<Board>();
		boards.add(new Board("제목1", "내용1"));
		boards.add(new Board("제목2", "내용2"));
		boards.add(new Board("제목3", "내용3"));
		// Board board1 = new Board("제목1", "내용1");
		return boards;
	}

}
