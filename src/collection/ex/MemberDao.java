package collection.ex;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	// 멤버 리스트 데이터 가져오기
	public List<MemberDto> getMemInfo() {
		List<MemberDto> getMems = new ArrayList<MemberDto>();
		getMems.add(new MemberDto("kimmj", "1234", "김민지", "kim@java.com"));
		getMems.add(new MemberDto("parksj", "4567", "박수진", "park@java.com"));
		getMems.add(new MemberDto("choijy", "9999", "최지연", "choi@java.com"));
		getMems.add(new MemberDto("jeongsy", "0000", "정소영", "jeong@java.com"));
		return getMems;

	}
}
