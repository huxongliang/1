package sonSerializable;

import java.io.Serializable;

import FatherandsonSerializable.Father;

public class Son extends Father implements Serializable {
	private static final long serialVersionUID = 1L;
	private String position = "нч";
}
