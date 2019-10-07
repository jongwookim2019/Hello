package Test;

public class Member {
	private String name;
	private int id;
	private String course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Member() {

	}

	public Member(String course) {

		this.course = course;
	}

	public Member(int id) {

		this.id = id;
	}

	public Member(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
}
