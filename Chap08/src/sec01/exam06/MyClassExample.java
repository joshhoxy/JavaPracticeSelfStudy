package sec01.exam06;

import sec01.exam01.*;
import sec01.exam05.*;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5); // myClass1.setVolume -> 컴파일에러: setVolume은 myClass의 필드인 rc의 메소드이기 때문에 myClass. 식의 접근은 불가능하다.
		
		System.out.println("2)------------------");
		MyClass myClass2 = new MyClass(new Audio()); // import sec01.exam01 해야함
//		myClass2.rc.turnOn();
//		myClass2.rc.setVolume(5); 
		// 위 코드가 myClass(RemoteControl rc) 생성자 내부 코드블록에서 실행됨
		
		System.out.println("3)------------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA(); // Audio 전원 켜기
		
		System.out.println("4)------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new SmartTelevision());
	}

}
