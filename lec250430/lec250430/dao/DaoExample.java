package lec250430.dao;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.update();
	}
	
	public static void main(String args[]) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
