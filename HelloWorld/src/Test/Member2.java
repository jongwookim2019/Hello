package Test;

public class Member2 {
	private String name;
	private String id;
	private String course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Member2() {

	}

	public Member2(String id) {

		this.id = id;
	}

	public Member2(String name, String id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
}
