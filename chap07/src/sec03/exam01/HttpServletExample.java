package sec03.exam01;

public class HttpServletExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method(new LoginServlet());
		
		method(new FileDownServlet());
		
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
