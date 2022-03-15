package sec03.exam01;

public class FileDownServlet extends HttpServlet{
	
	@Override
	public void service() {
		System.out.println("파일을 다운로드합니다.");
	}
}
