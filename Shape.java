package projekt;

public abstract class Shape {

	private int x;
	private int y;
	private char fill;

	public Shape(int x, int y, char fill) {
		this.x = x;
		this.y = y;
		this.fill = fill;
	}

	public Shape() {

	}

	public int getX() {

		return x;

	}

	public boolean setX(int x) {
		if (x < 0)
			return false;
		this.x = x;
		return true;
	}

	public abstract String getHelloMessage();

	public int getY() {

		return y;
	}

	public boolean setY(int y) {
		if (y < 0)
			return false;
		this.y = y;
		return true;
	}

	public char getFill() {
		return fill;
	}

	public void setFill(char fill) {
		this.fill = fill;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", fill=" + fill + "]";
	}

	public String posun_x() {
		String medzera = " ";

		if (x > 0) {
			for (int i = 0; i < x; i++) {

				medzera += " ";
			}
		}

		return medzera;
	}

	public String posun_y() {
		String medzera = " ";

		if (y > 0) {
			for (int i = 0; i < y; i++) {
				medzera += "\n";
			}
		}

		return medzera;

	}

	public char zmen() {
		return this.fill;

	}

}
