package sec05;

public class ShopService {
	// ���� �ʵ�
	private ShopService shopService = new ShopService();
	
	// ������
	private ShopService() {
		
	}
	//�޼ҵ�
	public ShopService getInstance() {
		return shopService;
	}
}
