package ch09.sec02;

public class Audio implements RemoteControl {
	//멤버 필드
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
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
		System.out.println("현재 Auido 볼륨 : " + this.volume);
		
	}
	
	//default를 재정의 할 경우 default 적지 않음
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio 무음 처리 합니다");
		}else {
			System.out.print("Audio 무음 해제 합니다");
		}
	}

}
