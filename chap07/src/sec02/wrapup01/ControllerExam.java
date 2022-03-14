package sec02.wrapup01;

public class ControllerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		
	
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new Aservice());
		controller.service.login();
		
	}

}
