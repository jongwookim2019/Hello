package Test;

import java.util.Scanner;

public class MemberExample {
	static Scanner sc = new Scanner(System.in);
	private static Member[] memberArray = new Member[100];

	public static void main(String[] args) {
		Member m1 = new Member();
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println(" 1. 회원등록 2. 회원번호조회  3.등록그룹별 리스트  4. 종료 ");
			System.out.println("-----------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();

			} else if (menu == 2) {
				getMember();

			} else if (menu == 3) {
				getCourse();
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
		System.out.println("등록과정을 입력하세요");
		String course = sc.nextLine();
		System.out.println("회원번호를 입력하세요");
		int id = sc.nextInt();

		Member createmember = new Member(name, id, course);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = createmember;
				break;

			}
		}
	}

	public static void getMember() {
		System.out.println("회원번호를 입력하세요");
		int id = sc.nextInt();
		Member getId = new Member(id);
		for (Member a : memberArray) {
			if (a != null && getId.getId()==a.getId()) {
				System.out.println("이름은: " + a.getName() + ", 회원번호는: " + a.getId() + ", 등록과정은: " + a.getCourse());
			}

		}

	}

	public static void getCourse() {
		System.out.println("종목을 입력하세요");
		String course = sc.nextLine();
		Member getCourse = new Member(course);
		for (Member a : memberArray) {
			if (a != null && getCourse.getCourse().equals(a.getCourse())) {
				System.out.println("이름은: " + a.getName() + ", 회원번호는: " + a.getId() + ", 등록과정은: " + a.getCourse());

			}
		}

	}
}
