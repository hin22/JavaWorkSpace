package ch09.sec02;

public class SmartTelvision implements RemoteControl, ISearchable {
	int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다");
		
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

}
