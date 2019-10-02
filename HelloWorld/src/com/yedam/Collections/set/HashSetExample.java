package com.yedam.Collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample { // set은 중복 허용 x
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>(); //hashcode와 equals 정의에 따라 값 변동
//		Member mem = new Member("1", 1);
//		Member mem1 = new Member("2", 1);
//		System.out.println("hashCode: " +mem1.hashCode());
		memSet.add(new Member("홍길동", 30));
		memSet.add(new Member("김길동", 30));
		System.out.println("memSet의 객체수:" + memSet.size());
		for (Member m : memSet) {
			System.out.println(m.name + "/" + m.age);
		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");
		System.out.println("객체수: " + set.size());
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("반복자 소진후");
		iter = set.iterator(); // 반복자 소진시 다시 가지고와야 실행됨
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("Nice"); // 객체로만 삭제 가능하다.
		System.out.println("확장 for: ");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
