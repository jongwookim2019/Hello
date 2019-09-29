package hello;

import java.util.Arrays;
import java.util.Scanner;

import Practice0924.Member;

public class TestScoreExample {
	static Scanner sc = new Scanner(System.in);
	public static TestScore[] scoreArray = new TestScore[100];
	public static TestScore[] orderArray = new TestScore[scoreArray.length];

	public static void main(String[] args) {
		TestScore t1 = new TestScore();
		boolean run = true;

		while (run) {

			System.out.println("============================================================");
			System.out.println(" 1. 학생성적등록 2. 전체리스트 3.학생번호조회  4.전체통계 5. 총점기준정렬 6. 종료");
			System.out.println("============================================================");
			System.out.println("선택 >");
			int menu;
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("학생번호를 입력하세요");
				String studentNo = sc.nextLine();
				System.out.println("학생이름를 입력하세요");
				String studentName = sc.nextLine();
				System.out.println("국어성적을 입력하세요");
				int korean = sc.nextInt();
				System.out.println("영어성적을 입력하세요");
				int english = sc.nextInt();
				System.out.println("수학성적을 입력하세요");
				int meth = sc.nextInt();
				TestScore create = new TestScore(studentNo, studentName, korean, english, meth);
				for (int i = 0; i < scoreArray.length; i++) {
					if (scoreArray[i] == null) {
						scoreArray[i] = create;
						break;

					}
				}

			} else if (menu == 2) {
				System.out.println("학생리스트를 출력합니다");
				for (TestScore a : scoreArray) {
					if (a != null) {
						System.out.println(" 번호>: " + a.getStudentNo() + " 이름>: " + a.getStudentName() + " 국어>: "
								+ a.getKorean() + " 영어>: " + a.getEnglish() + " 수학>: " + a.getMeth());
					}
				}
			} else if (menu == 3) {
				System.out.println("학생번호를 입력하세요");
				String number = sc.nextLine();
				for (TestScore a : scoreArray) {
					if (a != null && number.equals(a.getStudentNo())) {
						System.out.println(" 번호>: " + a.getStudentNo() + " 이름>: " + a.getStudentName() + " 국어>: "
								+ a.getKorean() + " 영어>: " + a.getEnglish() + " 수학>: " + a.getMeth() + "총점>: "
								+ a.Sum(a.getKorean(), a.getEnglish(), a.getMeth()) + "평균>: "
								+ a.TestScore(a.getKorean(), a.getEnglish(), a.getMeth()));
					}
				}

			} else if (menu == 4) {
				System.out.println("전체 통계를 출력합니다.");
				int sum = 0;
				int count = 0;
				for (TestScore a : scoreArray) {
					if (a != null) {
						sum += a.getKorean() + a.getEnglish() + a.getMeth();
						count++;

					}

				}
				System.out.println("반 전체 점수 >:" + sum + " 반 전체 평균>: " + (double) sum / (count));

			} else if (menu == 5) {
				Arrays.sort(scoreArray);
				for (TestScore a : scoreArray) {
					if (a != null) {
						System.out.println(" 번호>: " + a.getStudentNo() + " 이름>: " + a.getStudentName() + " 국어>: "
								+ a.getKorean() + " 영어>: " + a.getEnglish() + " 수학>: " + a.getMeth() + " 총점>: "
								+ (a.getKorean() + a.getEnglish() + a.getMeth()));

					}
				}

			} else if (menu == 6) {
				run = false;

			}

		}

		System.out.println("프로그램을 종료합니다.");
	}
}
