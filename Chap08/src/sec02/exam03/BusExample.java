package sec02.exam03;

public class BusExample {
	public static void main(String args[]) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		// vehicle.checkFare(); -> 컴파일에러: vehicle 인터페이스에는 checkFare 메소드가 없음
		
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
		
	}
}
