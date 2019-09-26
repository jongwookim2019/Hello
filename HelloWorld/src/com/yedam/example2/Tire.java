package com.yedam.example2;

public class Tire {
	int maxRotation; // 사용 가능한 최대 회전수.
	int accumulatedRotation; // 사용으로 인해 축적된 회전수.
	String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	boolean roll() {
		accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println("타이어 위치: " + location + " 타이어 수명: " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + " 타이어 펑크 ***");
			return false;
		}
	}
}
