
public class TestPolumorphism {

	public static void main(String[] args) {

		Bank b = new Sbi();
		System.out.println("sbi rate of inetrst" + b.getRateOfInterest());
		Bank s = new Icici();
		System.out.println("icici rate of interst" + s.getRateOfInterest());
		Bank i = new Axis();
		System.out.println("Axis rate of intst" + i.getRateOfInterest());

	}

}
