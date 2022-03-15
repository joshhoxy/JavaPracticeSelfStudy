package sec02.wrapup.exam01;

public class DaoExample {
	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
