package Practice0924;

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
		String mbname = sc.nextLine();
		System.out.println("id를 입력하세요");
		String mbid = sc.nextLine();
		System.out.println("password를 입력하세요");
		String mbpassword = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int mbage = sc.nextInt();
		Member cremb = new Member(mbname, mbid, mbpassword, mbage);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = cremb;
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
		String mbid = sc.nextLine();
		System.out.println("Password를 입력하시오");
		String mbpassword = sc.nextLine();
		Member getIP = new Member(mbid, mbpassword);
		for (Member a : memberArray) {
			if (a != null & getIP.getId().equals(a.getId()) & getIP.getPassword().equals(a.getPassword())) {
				System.out.println("Name: " + a.getName() + ", Age: " + a.getAge());
				break;
			} else if (getIP.getId().equals(a.getId()) & !getIP.getPassword().equals(a.getPassword())) {
				System.out.println("패스워드가 잘못되었습니다.");
				break;
			} else if (!getIP.getId().equals(a.getId()) & !getIP.getPassword().equals(a.getPassword())) {
				System.out.println("존재하지 않는 Id입니다.");
				break;
			}
		}

	}
}
