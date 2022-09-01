package kr.ac.sku.ioc;

public class DingdingTV implements TV {
	private boolean power;
	private int volume;
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	

	@Override
	public void volumUp() {
		System.out.println("소리를 높입니다.");
		
	}

	@Override
	public void volumDown() {
		System.out.println("소리를 낮춥니다.");
		
	}
}

