package kr.ac.sku.ioc;

public class BTV {
	private boolean power;
	private int volume;

	public BTV() { 
		volume = 1;
	}

	public void turnOnTV() {
		this.power = true;
	}

	public void turnOffTV() {
		this.power = false;
	}

	public void volumeUp() {
		this.volume++;
	}

	public void volumeDown() {
		this.volume--;
	}
}

