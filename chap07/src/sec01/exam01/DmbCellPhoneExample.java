package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DmbCellPhone�� ��ü ����
		DmbCellPhone dmb = new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmb.model);
		System.out.println("����: "+ dmb.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä��: " + dmb.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������.");
		dmb.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�ε���.");
		dmb.sendVoice("��~ �� �ݰ����ϴ�.");
		dmb.hangUp();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOff();
		
	}

}
