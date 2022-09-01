package kr.ac.sku.ioc;

public class CaramiTV implements TV{
	public void turnOn() {
		System.out.println("CaramiTV 전원을 켭니다.");
	}
		
	public void turnOff() {
		System.out.println("CaramiTV 전원을 끕니다.");
	}
	public void volumUp() {
		System.out.println("CaramiTV 소리를 키웁니다.");
	}

	
	public void volumDown() {
		System.out.println("CaramiTV 소리를 줄입니다.");
	}
}
