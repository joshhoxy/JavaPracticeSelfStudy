package sec01.wrapup.exam01;

public class SoundableExample {

	
	private static void printSound(Soundable soundable) {
		soundable.sound();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSound(new Dog());
		printSound(new Cat());
		
	}
	


}
