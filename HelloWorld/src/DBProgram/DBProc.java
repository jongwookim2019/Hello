package DBProgram;

import java.util.List;
import java.util.Scanner;

public class DBProc {
	Scanner sc = new Scanner(System.in);
	DBService service = new DBServiceImpl();
	String loginId = null;

	public void execute() {

		while (true) {
			int menu = 0;
			System.out.println("메뉴 선택 하세요.");
			System.out.println("1.사원 등록 2.사원 조회 3.부서 조회 4.부서 변경  5.퇴사  6.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getName();
			} else if (menu == 3) {
				getdept();
			} else if (menu == 4) {

			} else if (menu == 5) {
				deleteEmployee();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

	public void getdept() {
		System.out.println("부서를 입력해주세요.");
		String deptName = sc.nextLine();
		System.out.println("==========부서 조회 ===========");
		List<DB> db = service.getdepartmentName(deptName);
		if (db == null) {
			for (DB b : db) {
				System.out.println(b.getEmployeeNo() + " | " + b.getName() + " | " + b.getDepartmentName() + " | "
						+ b.getSalary() + " | " + b.getHareDate());
			}
		} else {
			System.out.println("사원번호 :" + ((DB) db).getEmployeeNo());
			System.out.println("사원명 :" + ((DB) db).getName());
			System.out.println("부서이름 :" + ((DB) db).getDepartmentName());
			System.out.println("급여 :" + ((DB) db).getSalary());
			System.out.println("입사일:" + ((DB) db).getHareDate());
		}

	}

	public void deleteEmployee() {
		System.out.println("삭제할 사원 번호:");
		int empNo = sc.nextInt();
		sc.nextLine();
		DB db = new DB();
		db.setEmployeeNo(empNo);
		service.deleteEmployee(db);
	}

	public void getName() {
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("==========사원 조회 ===========");
		DB db = service.getName(name);
		if (db != null) {
			System.out.println("사원번호 :" + db.getEmployeeNo());
			System.out.println("사원명 :" + db.getName());
			System.out.println("부서이름 :" + db.getDepartmentName());
			System.out.println("급여 :" + db.getSalary());
			System.out.println("입사일:" + db.getHareDate());
		}
	}

	public void writeBoard() {
		System.out.println("사원 등록을 시작합니다");
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		System.out.println("부서 입력:");
		String deptname = sc.nextLine();
		System.out.println("급여 입력:");
		int salary = sc.nextInt();
		DB db = new DB();
		db.setName(name);
		db.setDepartmentName(deptname);
		db.setSalary(salary);
		service.insertEmployee(db);
	}

}