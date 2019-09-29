package API;

public class MemberExample2 implements Comparable<MemberExample2> {

	String name;

	MemberExample2(String name) {
		this.name = name;

	}

	@Override
	public int compareTo(MemberExample2 o) {

		return name.compareTo(o.name);
	}
}
