package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.EmployeeServiceImpl;
//import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.Employee;
//import com.board.model.BoardService;
import com.board.model.EmployeeService;

public class EMProc {
	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴 선택 하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.삭제 5.변경 6.종료");
			int menu = 0;
			try {
				menu = sc.nextInt(); // error 발생 가능한 곳.
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
				sc.nextLine();
//				e.printStackTrace();
			}

			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				delBoard();
			} else if (menu == 5) {
				updateBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}

	public void writeBoard() {
		System.out.println("직원 등록.");
		System.out.println("직원번 호 입력:");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 입력:");
		String firstName = sc.nextLine();
		System.out.println("성 입력:");
		String lastName = sc.nextLine();
		System.out.println("email 입력:");
		String email = sc.nextLine();
		System.out.println("입사일 입력:");
		String hireDate = sc.nextLine();
		System.out.println("급여 입력:");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Job ID를 입력:");
		String jobId = sc.nextLine();
		// 입력 받은 값을 emp 인스턴스에 담는다.
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate); // 2010-10-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);
//		Board board = new Board(boardNo, title, contents, writer);
//		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//
//		}
	}

	public void getBoard() {
		System.out.println("직원 조회");
		System.out.println("조회할 번호를 입력");
		int empNo = sc.nextInt();
		Employee emp = service.getEmployee(empNo);
		System.out.println(emp);
	}

//	List<Board> boardAry = new ArrayList<>();
	public void getBoardList() {
		System.out.println("전체직원조회");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void delBoard() {
		System.out.println("한건삭제");
		System.out.println("삭제할 번호를 입력");
		int empId = sc.nextInt();
		service.deleteEmployee(empId);

//			for (int i = 0; i < boardAry.length; i++) {
//				if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//					System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getBoardNo() + ","+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//				}
//			}
	}

	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 제목 :");
		String title = sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		System.out.println("변경할 작성자:");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, content, writer);
//		service.updateBoard(board, boardAry);
	}
}
