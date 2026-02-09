package ch09.sec02;

public class TV implements RemoteControl{

	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume; //왜?
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
		
	}

}
