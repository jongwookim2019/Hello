package com.yedam.lambda;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int engScore;
	int matScore;

	public Student(String name, int engScore, int matScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}

}

public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("hong", 80, 92), new Student("kang", 85, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student)); // 매개값 (student)를 받아서 list 구문 만들겠다.
		}
	}

	public static double avg(ToIntFunction<Student> func) {
		int sum = 0, cnt = 0;
		for (Student student : list) {
			cnt++;
			sum += func.applyAsInt(student);
		}
		return (double) sum / cnt;
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}

	}

//	public static void main(String[] args) {
//		Function<Student, String> func = new Function<Student, String>() { //원래 사용하는법
//
//			@Override
//			public String apply(Student t) {
//				return t.getName();
//			}
//		};
//		printString(func);
//	}
	public static void main(String[] args) {
//		Function<Student, String> func = (t) -> {  // 람다식 줄이기 과정 1
//				return t.getName();
//		};
		printString((t) -> { // 최종 정리
			return t.getName() + " 입니다.";
		});
		ToIntFunction<Student> func = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		};
		System.out.println("영어점수");
		printInt(func);

		System.out.println("수학점수");
		printInt((s) -> {
			return s.getMatScore();
		});

		System.out.println("영어평균:");
		ToIntFunction<Student> func2 = new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		};
		double result = avg(func2);
		System.out.println("result : " + result);
		result = avg((s) -> { // 수학평균
			return s.getMatScore();
		});
		System.out.println("result : " + result);
	}
}
