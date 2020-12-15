package Core;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "sushmitha Kurapati";
		String s2 = "sushmitha";

		String s3 = s1.concat(s2);

		char ch = s1.charAt(4);

		System.out.println("charAt = " + ch);// chrAt
		System.out.println("comapreto = " + s1.compareTo(s2));// compareto
		System.out.println("concat = " + s3);// concat
		System.out.println("conatins = " + s2.contains("s1"));// contains
		System.out.println("endswith =  " + s1.endsWith("pati"));// endswith
		System.out.println("equals = " + s1.equals(s2));// equals
		System.out.println("equalsIgnore case = " + s1.equalsIgnoreCase(s2));// equalsIgnoreCase
		System.out.println(s1.lastIndexOf("kurapati"));// Last indexof
		System.out.println("length = " + s1.length());// length
		System.out.println("replace = " + s1.replace('s', 'a'));// replace
		System.out.println("starts with = " + s1.startsWith(s2));//starts with
		System.out.println("substring = " + s1.substring(2,4));//substring
		System.out.println("to lower case = " + s1.toLowerCase());//lower case
		System.out.println("to upper case = " + s1.toUpperCase());//upper case
		System.out.println(s1.trim() + " is a good girl");//trim

	}

}
