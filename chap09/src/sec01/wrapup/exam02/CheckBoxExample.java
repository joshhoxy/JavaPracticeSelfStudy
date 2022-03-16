package sec01.wrapup.exam02;

public class CheckBoxExample {
	public static void main(String[] args) {
	
		CheckBox chkBx = new CheckBox();
		chkBx.setOnSelectListener(new BackgroundChangeListener());
		chkBx.select();
	}
}
