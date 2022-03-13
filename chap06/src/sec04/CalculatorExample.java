package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		double result1 , result2;
		
		result1 = myCal.areaRectangle(10);
		result2 = myCal.areaRectangle(10, 5);
		
		System.out.println("result1: "+ result1 + ", result2:  "+ result2);
		
		
	}

}
