package sec01.exam06;

//��ø �������̽� ����
public class Button {
	// Ŭ���� Button�� �ʵ�
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
