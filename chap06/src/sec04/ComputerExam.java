package sec04;

public class ComputerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		System.out.println("-----------매개변수 개수 모를때------------");
		
		int result2 = myCom.sum2(1,2,3,4,5);
		System.out.println("result2: "+ result2);
		
	}

}
