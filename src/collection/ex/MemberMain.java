package collection.ex;

import java.util.List;

public class MemberMain {
	// 모든 회원 리스트 출력
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		List<MemberDto> memList = memberDao.getMemInfo();
		for (MemberDto memberDto : memList) {
			System.out.println(memberDto.getId() + " / " + memberDto.getPw() + " / " + memberDto.getName() + " / "
					+ memberDto.getEmail());
		}
	}

}
