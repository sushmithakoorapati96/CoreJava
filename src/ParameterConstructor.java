
public class ParameterConstructor {

	int id;
	String name;
    //creating a parameterized constructor  

	ParameterConstructor(int i, String n) {
		id = i;
		name = n;
	}
    //method to display the values  

	void disply() {
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {
	    //creating objects and passing values  

		ParameterConstructor p1 = new ParameterConstructor(123, "sushmitha");
		ParameterConstructor p2 = new ParameterConstructor(124, "Kurapati");
		
	    //creating objects and passing values  

		p1.disply();
		p2.disply();

	}

}
