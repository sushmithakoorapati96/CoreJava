
public class TestStringComparision {

	public static void main(String[] args) {

		String s1 = "sushmitha";
		String s2 = "sushmitha";
		String s3 = new String("sushmitha");
		String s4 = "SUSHMITHA";

		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
