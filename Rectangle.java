package projekt;

public class Rectangle extends Shape {

	private int width;
	private int height;
	private boolean field;

	public Rectangle(int x, int y, char fill, int width, int height, boolean field) { // neda
																						// sa
																						// dat
																						// ako
																						// abseratk

		super(x, y, fill);

		this.width = width;
		this.height = height;
		this.field = field;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHelloMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Rectangle(int with, int height) {

		super();

		this.width = width;
		this.height = height;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {

		String vrat = "";
		vrat += posun_y();
		for (int i = 0; i < this.height; i++) {
			vrat += posun_x();
			for (int j = 0; j < this.width; j++) {

				vrat = vrat + zmen();
			}
			vrat = vrat + "\n";
		}

		return vrat;
	}

	public String toString1() {
		Line line = new Line(0, 0, super.getFill(), width, false);
		String vrat = "";
		vrat += posun_y();
		for (int i = 0; i < this.height; i++) {
			vrat += posun_x();

			vrat = vrat + line.toString();

			vrat = vrat + "\n";
		}

		return vrat;
	}

	public String toString2() {

		Line line = new Line(0, 0, super.getFill(), this.width, false);

		String t = "";
		t = t + posun_y();

		t = t + posun_x();
		line.setLength(this.width);
		line.setFill('o');
		t = t + line.toString();
		t = t + " \n";

		for (int i = 0; i < this.height - 2; i++) {
			t = t + posun_x();
			if (field == false) {
				t = t + line.toString();
			} else {
				line.setLength(1);
				t = t + line.toString();
				line.setFill(' ');
				line.setLength(width - 2);
				t = t + line.toString();
				line.setLength(1);
				line.setFill('o');
				t = t + line.toString();
			}

			t = t + "\n";
		}

		t = t + posun_x();
		line.setLength(this.width);
		line.setFill('o');
		t = t + line.toString();

		return t;
	}

	public String toString(boolean dnu) {

		String s = "";

		Line line = new Line(0, 0, getFill(), 10, false);

		s += s += posun_y();

		for (int i = 0; i < this.height; i++) {

			if (dnu == false) {
				s += posun_x();

				if (i == 0 || i == this.height - 1) {
					s += line.toString(0, this.width, false, true, false);
				}

				else {
					s += (line.toString(i, this.width, false, true, false));
				}

				s += "\n";
			} else {
				s += posun_x();
				if (i == 0 || i == this.height - 1) {
					s += line.toString(0, this.width, false, true, true);
				}

				else {
					s += (line.toString(i, this.width, false, true, true));
				}
				s += "\n";

			}
		}
		return s;

	}

}
