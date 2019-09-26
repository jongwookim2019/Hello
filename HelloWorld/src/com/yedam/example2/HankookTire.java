package com.yedam.example2;

public class HankookTire extends Tire {
	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	@Override
	boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println("타이어 위치: " + location + "Hankook 타이어 수명: " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "Hankook 타이어 펑크 ***");
			return false;
		}
	}
}
