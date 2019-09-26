package com.yedam.example2;

public class Car {
	
	Tire tlocation[] = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };		

	int run() {
		System.out.println("[자동차가 달립니다]");
		for (int i =0; i<tlocation.length; i++ ) {
			if (tlocation[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
//		if (tlocation[0].roll() == false) {
//			stop();
//			return 1; // 왼쪽 앞바퀴가 문제가 발생하면 1값을 보내겠다.
//		} else if (tlocation[1].roll() == false) {
//			stop();
//			return 2; // 오 앞 문 2
//		} else if (tlocation[2].roll() == false) {
//			stop();
//			return 3; // 왼 뒤 문 3
//		} else if (tlocation[3].roll() == false) {
//			stop();
//			return 4; // 오 뒤 문 4
//		}
		return 0; // 고장난 부분이 없다.	
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	
		
	
}
