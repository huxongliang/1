package staticProxy;
public class Main {
	public static void main(String[] args) {
        Star person=new Star();
        Myproxy myproxy=new Myproxy(person);
        myproxy.sing("¶öÀÇ´«Ëµ");
    }
}
