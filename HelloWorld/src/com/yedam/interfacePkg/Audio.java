package com.yedam.interfacePkg;

public class Audio implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디로를 끕니다.");

	}

	@Override
	public void setVolume(int Volume) {
		this.volume = volume;
		
	}

}