package sec01.exam06;

//중첩 인터페이스 예제
public class Button {
	// 클래스 Button의 필드
	OnClickListener listener;

	void setOnClickListener (OnClickListener listener){
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
	
}
