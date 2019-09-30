package hello;

public class TestScore implements Comparable<TestScore> {

	String studentNo;
	String studentName;
	int korean;
	int english;
	int meth;
	int sum = korean+english+meth;


	public TestScore(int sum) {
		this.sum = sum;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMeth() {
		return meth;
	}

	public void setMeth(int meth) {
		this.meth = meth;
	}

	TestScore() {

	}

	TestScore(String studentNo) {
		this.studentNo = studentNo;
	}

	TestScore(String studentNo, String studentName, int korean, int english, int meth) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.korean = korean;
		this.english = english;
		this.meth = meth;
	}

	double TestScore(int korean, int english, int meth) {
		return (double) (korean + english + meth) / 3;

	}

	public int Sum(int korean, int english, int meth) {
		return korean+english+meth;

	}

	@Override
	public int compareTo(TestScore o) {
		return sum.compareTo(o.sum);
	}

	
}
