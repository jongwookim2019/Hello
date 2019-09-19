package classes;

public class CarExamaple {
	public static void main(String[] args) {
		// Car class의 변수 car 인스턴스 Car 생성
		Car car1 = new Car();
		car1.model = "그랜저";
		car1.color = "red";
		car1.price = 1000;
		car1.maxSpeed = 200;

//		System.out.println(car1.model);
//		System.out.println(car1.color);
//		System.out.println(car1.price);
//		System.out.println(car1.maxSpeed);
//		car1.drive();
//		
		// 새로운 인스턴스 만들기 Car class의 변수 car2
		Car car2 = new Car();
		car2.model = "소나타";
		car2.color = "black";
		car2.price = 1500;
		car2.maxSpeed = 250;
		car2.drive();

		// carAry 에는 Car의 인스턴스만 들어갈수 있다.
		// Car class(data type) 의 배열 인스턴스 생성
		int[] intAry = new int[5];
		Car[] carAry = new Car[2];
		String[] strAry = null;
		// carAry에 인스턴스 대입
		carAry[0] = car1;
		carAry[1] = car2;

		for (Car c : carAry) {
			System.out.println(c.model + "," + c.color);

		}
	}
}
