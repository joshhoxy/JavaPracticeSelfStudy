package sec02.exam03;

public class BusExample {
	public static void main(String args[]) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		// vehicle.checkFare(); -> �����Ͽ���: vehicle �������̽����� checkFare �޼ҵ尡 ����
		
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
		
	}
}
