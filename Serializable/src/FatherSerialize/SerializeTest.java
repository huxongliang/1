package FatherSerialize;

import FatherandsonSerializable.SerializeTool;
import FatherandsonSerializable.Son;

public class SerializeTest {
	public static void main(String[] args) throws Exception{
		Son t = new Son();
		SerializeTool.serialize(t,"Son");
		SerializeTool.printFileInfo("Son");
	}
}