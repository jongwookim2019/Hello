package com.yedam;

public class DmbCellPhone extends Cellphone {
	int channel;

	public DmbCellPhone(int channel) {
		super(); // 부모 클래스 호출 --> 부모클래스에 매개값 없는 생성자가 있어야 한다.
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();

	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // 부모클래스 Cellphone(String model, String color) 생성자 호출
		this.channel = channel;

	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송수신을 시작합니다. ");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
}
