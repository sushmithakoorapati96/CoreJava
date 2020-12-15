
public class TestAccount {

	public static void main(String[] args) {

		Account Acc = new Account();
		Acc.setAcnum(1223444);
		Acc.setSalary(123343f);
		Acc.setEmail("sushmtha");
		Acc.setName("kurapati");

		System.out.println(Acc.getAcnum() + " " + Acc.getEmail() + " " + Acc.getName() + " " + Acc.getSalary());
	}

}
