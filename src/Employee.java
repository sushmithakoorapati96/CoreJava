
public class Employee {

	
		float salary = 10000;
	}

	class programmer extends Employee {
		int bonus = 11111;

		public static void main(String[] args) {
			programmer p = new programmer();
			System.out.println("programmer salary is"+p.bonus);
			System.out.println("programmer salary is"+p.salary);

		}

	}
