package pool;

public class DBTest {

	public static void main(String[] args) {
		try {
		// TODO �Զ����ɵķ������		
		System.out.println(ConPool.getIntance().toString("MySql"));
		System.out.println(ConPool.getIntance().toString("SqlServer"));
		
		long Time1 = System.currentTimeMillis();
		for(int i = 0; i< 50000; i++){
			ConPool.getIntance().getCon("MySql");
		}
		long Time2 = System.currentTimeMillis();
		System.out.println("ʹ�����ӳ�����MySql���ݿ���ʱ��" +(Time2 - Time1) + "ms");
		
		long Time3 = System.currentTimeMillis();
		for(int i = 0; i< 50000; i++){
			ConPool.getIntance().getCon("SqlServer");
		}
		long Time4 = System.currentTimeMillis();
		System.out.println("ʹ�����ӳ�����SqlServer���ݿ���ʱ��" +(Time4 - Time3) + "ms");
		
		long Time5 = System.currentTimeMillis();
		for(int i = 0; i< 100; i++){
				MySqlDAO.getMySqlConnection();			
		}
		long Time6 = System.currentTimeMillis();
		System.out.println("δʹ�����ӳ�����MySql���ݿ���ʱ��" +(Time6 - Time5) + "ms");
		
		long Time7 = System.currentTimeMillis();
		for(int i = 0; i< 100; i++){
				MySqlDAO.getSqlServerConnection();			
		}
		long Time8 = System.currentTimeMillis();
		System.out.println("δʹ�����ӳ�����SqlServer���ݿ���ʱ��" +(Time8 - Time7) + "ms");
		
		System.out.println(ConPool.getIntance().toString("MySql"));
		System.out.println(ConPool.getIntance().toString("SqlServer"));
		}
		 catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	}
}