package staticProxy;

public class Myproxy implements Action {
	private Star person;
    public Myproxy(Star person) {
        this.person = person;
    }

    public void sing(String name) {
        System.out.println("代理人通知明星：");
       this.person.sing(name);
    }
}
