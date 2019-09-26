package com.yedam;

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle(); // 똑같은 구문을 실행했는데 결과가 다르게 나오는 것을 다형성 이라고 한다.
		vehicle = new Bus(); // 인스턴스를 어떤 것을 넣은것인가에 대한 차이
		vehicle = new Taxi();
		driver.drive(vehicle);
	}
}
