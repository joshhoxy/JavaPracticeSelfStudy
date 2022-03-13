package sec05;

public class ShopService {
	// 정적 필드
	private ShopService shopService = new ShopService();
	
	// 생성자
	private ShopService() {
		
	}
	//메소드
	public ShopService getInstance() {
		return shopService;
	}
}
