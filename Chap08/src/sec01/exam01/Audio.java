package sec01.exam01;

public class Audio implements RemoteControl{
	
	//�ʵ�
	private int volume;
	
	//�޼ҵ�_�߻�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	//�޼ҵ�_������_�����޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + this.volume);
	}
	
}
