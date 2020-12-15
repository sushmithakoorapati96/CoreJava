
public class WrapperExample {

	public static void main(String[] args) {

		byte b = 10;
		short s = 12;
		int i = 19;
		long l = 10;
		float f = 10.f;
		double d = 60.D;
		char c = 'a';
		boolean o = true;

		// autoboxing-converting primitives into objects

		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character characterobj = c;
		Boolean booleanobj = o;

		System.out.println("byte obj = " + byteobj);
		System.out.println("byte obj = " + shortobj);

		System.out.println("byte obj = " + intobj);

		System.out.println("byte obj = " + longobj);

		System.out.println("byte obj  = " + floatobj);
		System.out.println("byte obj = " + doubleobj);
		System.out.println("byte obj = " + characterobj);
		System.out.println("byte obj = " + booleanobj);

		// unboxing-converting objects into primitives
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = characterobj;
		boolean boolvalue = booleanobj;

		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);

	}

}
