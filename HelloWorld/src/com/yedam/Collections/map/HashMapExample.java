package com.yedam.Collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 90); // 중복키 사용불가지만 중복시 중복된 키의 마지막 입력한 value값으로 변경
		System.out.println("Entry갯수: " + map.size());
		System.out.println("방법1"); // key를 set에 담아서 iterator로 가져옴
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}

//		for(Entry< String,Integer> ent : map) {
//			System.out.println();
//		}

	}
}
