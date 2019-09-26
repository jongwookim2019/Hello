package Practice0923;

import java.util.Scanner;

public class MemberExample2 {
	static Scanner sc = new Scanner(System.in);
	private static Member[] memberArray = new Member[100];

	public static void main(String[] args) {
		Member m1 = new Member();
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------");
			System.out.println(" 1. 멤버생성 2. 전체리스트  3. id조회  4. 종료 ");
			System.out.println("------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();

			} else if (menu == 2) {
				getMember();

			} else if (menu == 3) {
				getIDPassword();

			} else if (menu == 4) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");
	}

	public static void createMember() {
		System.out.println("Create Member");
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		System.out.println("password를 입력하세요");
		String pwd = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		Member createmb = new Member(name, id, pwd, age);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = createmb;
				break;

			}
		}
	}

	public static void getMember() {
		System.out.println("getMemberList()");
		for (Member a : memberArray) {
			if (a != null) // && !a.getAno().equals(""))
				System.out.println("이름: " + a.getName() + ", Id: " + a.getId() + ", 비밀번호: " + a.getPassword() + ", 나이:"
						+ a.getAge());
		}
	}

	public static void getIDPassword() {
		System.out.println("Id를 입력하시오");
		String id = sc.nextLine();
		System.out.println("Password를 입력하시오");
		String pwd = sc.nextLine();
//		Member getIP = new Member(id, pwd);
//		for (Member a : memberArray) {
//			if (a != null & getIP.getId().equals(a.getId()) & getIP.getPassword().equals(a.getPassword())) {
//				System.out.println("Name: " + a.getName() + ", Age: " + a.getAge());
//				
//			} else if (getIP.getId().equals(a.getId()) & !getIP.getPassword().equals(a.getPassword())) {
//				System.out.println("패스워드가 잘못되었습니다.");
//
//			} else if (!getIP.getId().equals(a.getId()) & !getIP.getPassword().equals(a.getPassword())) {
//				System.out.println("존재하지 않는 Id입니다.");

		boolean isId = false, isPw = false;
		String name = null;
		int age = 0;
		for (Member a : memberArray) {
			if (a != null && a.getId().equals(id)) {
				if (a.getPassword().contentEquals(pwd)) {
					isId = true;
					isPw = true;
					name = a.getName();
					age = a.getAge();
					break;
				} else {
					isId = true;
					isPw = false;
					break;
				}
			} else {
				isId = false;
				isPw = false;
			}
		}
		if (isId == true && isPw == true)
			System.out.println("이름은: " + name + "나이는: " + age);
		else if (isId == true && isPw == false)
			System.out.println("비번이 틀립니다.");
		else if (isId == false && isPw == false)
			System.out.println("존재하지 않는 아이디입니다.");

	}

}
