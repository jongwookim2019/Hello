package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HighStudent {
	String name;
	String sex;
	int score;

	public HighStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
}

public class PredicateExample {

	static List<HighStudent> list = Arrays.asList(new HighStudent("김성현", "남자", 87), new HighStudent("이지아", "여자", 100),
			new HighStudent("이진성", "남자", 89), new HighStudent("원유리", "여자", 83));

	static double avg(Predicate<HighStudent> pred) {
		boolean bool = false;
		int cnt = 0, sum = 0;
		for (HighStudent student : list) {
			bool = pred.test(student); // getSex() = "남자"
			if (bool) {
				cnt++;
				sum += student.getScore();
			}

		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		Predicate<HighStudent> pred = new Predicate<HighStudent>() {

			@Override
			public boolean test(HighStudent t) {
				t.getSex().equals("남자");
				return true; 
			}
		};
		double avg = avg(pred);
		System.out.println("남자평균: " + avg);

		avg = avg((t) -> {
			return t.getSex().equals("여자");

		});
		System.out.println("여자평균: " + avg);
	}
}
