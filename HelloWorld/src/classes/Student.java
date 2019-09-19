package classes;
// class는 대문자로 시작 Student String System 등등
public class Student {
	// 특성(필드)
	String name;
	String major;
	int studentNo;

	// 생성자
	Student() {
		
	}
	Student(String name) {
		this.name = name;
	}
	
	// this는 생성자를 필드에 대입하기 위함
	Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
	// 기능(메소드)
	void study() {
		System.out.println("공부합니다.");
	}

	void gotoSchool() {
		System.out.println("학교갑니다.");
	}
}
