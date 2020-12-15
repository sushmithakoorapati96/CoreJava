package Core;

public abstract class shape {
	abstract void draw();
}

class Rectangle extends shape {
	void draw() {
		System.out.println("drawing");
	}
}

class circle extends shape {
	void draw() {
		System.out.println("draw");
	}
}

class round extends shape {
	void draw() {
		System.out.println("drawing is completed");
	}

}
