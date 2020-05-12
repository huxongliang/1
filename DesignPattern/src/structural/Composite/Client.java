package structural.Composite;

public class Client {
	public static void main(String[] args) {
		MyElement obj1,obj2,obj3,obj4,obj5;
		Plate plate1,plate2,plate3;
		
		//盘子1装苹果和梨
		obj1 = new Apple();
		obj2 = new Pear();
		plate1 = new Plate();
		plate1.add(obj1);
		plate1.add(obj2);
		
		//盘子2装两个香蕉
		obj3 = new Banana();
		obj4 = new Banana();
		plate2 = new Plate();
		plate2.add(obj3);
		plate2.add(obj4);
		
		//盘子3装盘子1和盘子2以及苹果
		obj5 = new Apple();
		plate3 = new Plate();
		plate3.add(obj5);
		plate3.add(plate1);
		plate3.add(plate2);
		
		//吃盘子3即吃光盘子三上的所有水果
		plate3.eat();
		
	}
}
