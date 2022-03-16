package sec01.exam06;

public class ButtonExample {
	public static void main(String[] args) {

	Button button = new Button();
	
	// 버튼에 리스너(어느 영역인지표시) 붙이고 -> 터치 
	button.setOnClickListener(new CallListener());
	button.touch();
	
	button.setOnClickListener(new MessageListener());
	button.touch();

	}
}
