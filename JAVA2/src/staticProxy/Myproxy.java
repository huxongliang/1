package staticProxy;

public class Myproxy implements Action {
	private Star person;
    public Myproxy(Star person) {
        this.person = person;
    }

    public void sing(String name) {
        System.out.println("������֪ͨ���ǣ�");
       this.person.sing(name);
    }
}
