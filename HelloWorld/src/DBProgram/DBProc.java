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
				getDeptName();
			} else if (menu == 4) {
				updateDept();
			} else if (menu == 5) {
				deleteEmployee();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

	public void getDeptName() {
		System.out.println("부서를 입력해주세요.");
		String deptname = sc.nextLine();
		System.out.println("==========부서 조회 ===========");
		
		
		
		if (!deptname.equals("")) {//전체보기
			List<DB> db = service.getDeptName(deptname);
			for (DB dB : db) {
				System.out.println(dB.getEmpId() + " | " + dB.getName() + " | " + dB.getDeptName() + " | " + dB.getSalary()
						+ " | " + dB.getHireDate());
			}
		} else {
			List<DB> list = service.getEmpList();
			for (DB e : list) {
				System.out.println("-> " + e.getEmpId() + "|" + e.getName() + "|" + e.getDeptName() + "|"
						+ e.getSalary() + "|" + "|" + e.getHireDate());
			}
		}

	}

	public void updateDept() {
		System.out.println("변경할 사원 번호:");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 부서 이름:");
		String deptName = sc.nextLine();
		DB db = new DB();
		db.setEmpId(empId);
		db.setDeptName(deptName);
		service.updateDept(db);

	}

	public void getEmpList() {
		System.out.println("-------[전체글]-------");
		System.out.println("==============================================");
		System.out.println("사원번호 |  이름   |    부서     |  급여   | 고용일자 ");
		System.out.println("==============================================");
		List<DB> db = service.getEmpList();
		for (DB b : db) {
			System.out.println(b.getEmpId() + " | " + b.getName() + " | " + b.getDeptName() + " | " + b.getSalary()
					+ " | " + b.getHireDate());
		}

	}

	public void deleteEmployee() {
		System.out.println("삭제할 사원 번호:");
		int empID = sc.nextInt();
		sc.nextLine();
		DB db = new DB();
		db.setEmpId(empID);
		service.deleteEmp(db);
	}

	public void getName() {
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("==========사원 조회 ===========");
		List<DB> db = service.getName(name);
		for (DB dB : db) {
			System.out.println(((DB) dB).getEmpId() + " | " + ((DB) dB).getName() + " | " + ((DB) dB).getDeptName()
					+ " | " + ((DB) dB).getSalary() + " | " + ((DB) dB).getHireDate());
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
		db.setDeptName(deptname);
		db.setSalary(salary);
		service.insertEmp(db);
	}

}