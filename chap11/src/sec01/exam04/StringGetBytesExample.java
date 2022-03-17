package sec01.exam04;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			String str2 = new String(bytes2);
			System.out.println("bytes2 -> String: " + str2 );
			
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			String str3 = new String(bytes3);
			System.out.println("bytes3 -> String: "+ str3);
			// -> 디코딩 에러: 인코딩은 UTF-8 로 해놓고 디코딩은 charset은 지정 안해서 기본인 시스템 디코딩 문자셋 이용됨 => 인코딩과 디코딩의 문자셋이 달라서 오류 발생
			
		}
		catch (Exception e){
			
		}
		
		
	}

}
