
public interface Drawable {
	void draw();

}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing");
	}

	class Circle implements Drawable {
		public void draw() {
			System.out.println("draw");
		}
	}

}
