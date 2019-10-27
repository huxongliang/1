package pool;

public class DBTest {

	public static void main(String[] args) {
		try {
		// TODO 自动生成的方法存根		
		System.out.println(ConPool.getIntance().toString("MySql"));
		System.out.println(ConPool.getIntance().toString("SqlServer"));
		
		long Time1 = System.currentTimeMillis();
		for(int i = 0; i< 50000; i++){
			ConPool.getIntance().getCon("MySql");
		}
		long Time2 = System.currentTimeMillis();
		System.out.println("使用连接池连接MySql数据库用时：" +(Time2 - Time1) + "ms");
		
		long Time3 = System.currentTimeMillis();
		for(int i = 0; i< 50000; i++){
			ConPool.getIntance().getCon("SqlServer");
		}
		long Time4 = System.currentTimeMillis();
		System.out.println("使用连接池连接SqlServer数据库用时：" +(Time4 - Time3) + "ms");
		
		long Time5 = System.currentTimeMillis();
		for(int i = 0; i< 100; i++){
				MySqlDAO.getMySqlConnection();			
		}
		long Time6 = System.currentTimeMillis();
		System.out.println("未使用连接池连接MySql数据库用时：" +(Time6 - Time5) + "ms");
		
		long Time7 = System.currentTimeMillis();
		for(int i = 0; i< 100; i++){
				MySqlDAO.getSqlServerConnection();			
		}
		long Time8 = System.currentTimeMillis();
		System.out.println("未使用连接池连接SqlServer数据库用时：" +(Time8 - Time7) + "ms");
		
		System.out.println(ConPool.getIntance().toString("MySql"));
		System.out.println(ConPool.getIntance().toString("SqlServer"));
		}
		 catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	}
}