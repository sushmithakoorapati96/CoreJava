
public class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class Icici extends Bank {
	float getRateOfInterest() {
		return 7.3f;

	}
}

class Axis extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}
