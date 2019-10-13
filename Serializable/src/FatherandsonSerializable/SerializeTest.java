package FatherandsonSerializable;

public class SerializeTest {
	public static void main(String[] args) throws Exception{
		Son t = new Son();
		SerializeTool.serialize(t,"Son");
		SerializeTool.printFileInfo("Son");
	}
}