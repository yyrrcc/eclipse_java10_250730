package collection.set;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
	public static void main(String[] args) {
		Set<MemberDto> set = new HashSet<MemberDto>();

		MemberDto member1 = new MemberDto("tiger", "1234", "김민지", 20);
		set.add(member1);
		set.add(member1);
		set.add(member1);

		System.out.println(set.size()); // 중복 허용 하지 않기 때문에 결과값 1
	}
}
