package API;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		// 기본 타입값 검색
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);

		// 문자열 검색
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);

		// 객체 생성
		MemberExample2 m1 = new MemberExample2("홍길동");
		MemberExample2 m2 = new MemberExample2("박동수");
		MemberExample2 m3 = new MemberExample2("김민수");
		MemberExample2[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);

	}

}
