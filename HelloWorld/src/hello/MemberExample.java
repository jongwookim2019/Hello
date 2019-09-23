package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("Kimjongwoo");
		m1.setId("Kjw");
		m1.setPassword("rlawhddn77");
		m1.setAge(29);

		Member m2 = new Member("name", "id");
		m2.setName("Administrater");
		m2.setId("Admin");
		m2.setPassword(null);
		m2.setAge(29);

		Member m3 = new Member("name", "id", "password", 10);
		m3.setName("user1");
		m3.setId("user2");
		m3.setPassword("user3");
		m3.setAge(10);
		
		Member [] memberAry = new Member [3];
		memberAry[0] = m1;
		memberAry[1] = m2;
		memberAry[2] = m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		for (Member m : memberAry) {
			if (m.getName().equals(name))
			System.out.print(" 이름 :  " +m.getName()+ " id : "+m.getId()+ " 비밀번호 :  " +m.getPassword()+ " 나이 :  " +m.getAge());
		}
		System.out.println();
	}
}
