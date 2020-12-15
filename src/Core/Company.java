package Core;

public abstract class Company {
	abstract void laptop();

}

class lenovo extends Company {
	void laptop() {
		System.out.println("laptop buying");
	}
}

class hp extends Company {
	void laptop() {
		System.out.println("laptop bought");
	}
}

class dell extends Company {
	void laptop() {
		System.out.println("new laptop");
	}
}

class mac extends Company {
	void laptop() {
		System.out.println("Macfgthhthty");
	}
}
