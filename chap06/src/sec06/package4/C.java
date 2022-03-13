package sec06.package4;

import sec06.package3.*;

public class C {
	//필드
	A a1 = new A(true);
	// A a2 = new A(1); -> 컴파일 에러: default 생성자 접근 불가
	// A a3 = new("ddd"); -> 컴파일 에러: private 생성자 접근 불가 
}
