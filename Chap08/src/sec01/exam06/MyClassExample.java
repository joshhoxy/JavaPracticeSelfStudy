package sec01.exam06;

import sec01.exam01.*;
import sec01.exam05.*;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5); // myClass1.setVolume -> �����Ͽ���: setVolume�� myClass�� �ʵ��� rc�� �޼ҵ��̱� ������ myClass. ���� ������ �Ұ����ϴ�.
		
		System.out.println("2)------------------");
		MyClass myClass2 = new MyClass(new Audio()); // import sec01.exam01 �ؾ���
//		myClass2.rc.turnOn();
//		myClass2.rc.setVolume(5); 
		// �� �ڵ尡 myClass(RemoteControl rc) ������ ���� �ڵ��Ͽ��� �����
		
		System.out.println("3)------------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA(); // Audio ���� �ѱ�
		
		System.out.println("4)------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new SmartTelevision());
	}

}
