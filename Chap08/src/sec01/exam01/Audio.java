package sec01.exam01;

public class Audio implements RemoteControl{
	
	//필드
	private int volume;
	
	//메소드_추상
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//메소드_재정의_구현메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
}
