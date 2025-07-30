package collection.list;
// 글 하나를 저장하는 객체(글쓴이, 글제목, 글내용, 작성날짜)

import java.sql.Timestamp;

public class Board {
	// 필드(멤버변수)
	private String writer; // 글쓴이
	private String subject; // 글제목
	private String content; // 글내용
	private Timestamp date; // 시간

	// 생성자 2개
	public Board() {
		super();
	}

	public Board(String writer, String subject, String content, Timestamp date) {
		super();
		this.writer = writer;
		this.subject = subject;
		this.content = content;
		this.date = date;
	}

	// getter 와 setter
	public String getWrite() {
		return writer;
	}

	public void setWriter(String write) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
