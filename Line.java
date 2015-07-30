package projekt;

public class Line extends Shape {

	/*
	 * Trieda Line length: int vertical: boolean toString() - vypis ciary podla
	 * dlzky, ak je vertical tak sa vypise vertikalne, ak nie, tak horizontalne
	 * 
	 * 
	 */

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Line(int x, int y, char fill, int size, boolean vertical) { // neda
																		// sa
																		// dat
																		// ako
																		// abseratk

		super(x, y, fill);
		this.length = size;
		this.vertical = vertical;

		// TODO Auto-generated constructor stub
	}

	public Line(int k) {

	}

	public Line(int size, boolean vertical) {

		super();
		this.length = size;
		this.vertical = vertical;

	}

	@Override
	public String getHelloMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean vertical = false;;

	@Override
	public String toString() {

		// if (vertical) {
		// return tlac(this.length, 1);
		//
		// } else {
		//
		// return tlac(1, this.length);
		//
		// }

		return tlac1(this.length);

	}

	private String tlac(int a, int a2) {
		String h = "";
		h += posun_y();
		for (int i = 0; i < a; i++) {
			h += posun_x();
			for (int j = 0; j < a2; j++) {

				h = h + zmen();
			}

			h = h + "\n";
		}

		return h;

	}

	private String tlac(int a2) {
		String h = "";
		h += posun_y();
		for (int j = 0; j < a2; j++) {
			h += posun_x();
			h = h + zmen();
			if (vertical == true) {
				h += posun_x();
				h = h + "\n";

			}
		}

		h = h + "\n";

		return h;

	}

	private String tlac1(int a2) {
		String h = "";
		// h +=posun_y();
		for (int j = 0; j < a2; j++) {
			// h +=posun_x();
			h = h + zmen();
			if (vertical == true) {
				h += posun_x();
				h = h + "\n";

			}
		}

		return h;

	}

	public String toString(int i, int pocet, boolean empty, boolean stvorec, boolean field) {

		int pomoct = i;

		String string = "";
		if (stvorec == true) {

			i = pocet;
			pocet = pomoct;
		}

		for (int j = 0; j < i; j++) {

			if (((j == 0 || j == i - 1 || i == (pocet * 2) - 1) && empty == false && stvorec == false)
					|| ((j == 0 || j == i - 1 || pomoct == 0) && empty == false && stvorec == true)) {
				string += getFill();
			} else {

//				if (field == true) {
//					string += getFill();
//				} else {/// cez ?
//					string += " ";
//				}
				
				string += field ? getFill() : " ";

			}

		}

		return string;
	}

}
