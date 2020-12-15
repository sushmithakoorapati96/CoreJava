
public class Bullet {
		void run() {
			System.out.println("running");

		}
	}

	class Splendor extends Bullet {
		void run() {
			System.out.println("running vth 60km");
		}

		public static void main(String args[]) {
			Bullet s = new Splendor();
			s.run();

		}
	}


