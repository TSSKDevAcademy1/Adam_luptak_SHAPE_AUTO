package projekt;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] ar) {

		String dnu = "";
		boolean typ = false;

		do {

			System.out.println("Zadajte volbu: \n 1 pre Trojuholnik \n 2 pre stvorec \n 3 pre obldznik ");

			dnu = readLine();

			switch (dnu) {
			case "1":
				System.out.println("Zadajte plny alebo prazdny trojuholnik TRUE || FALSE");
				typ = Boolean.valueOf(readLine());
				break;
			case "2":
				System.out.println("Zadajte plny alebo prazdny stvorec TRUE || FALSE");
				typ = Boolean.valueOf(readLine());
				break;
			case "3":
				System.out.println("Zadajte plny alebo prazdny obdlznik TRUE || FALSE");
				typ = Boolean.valueOf(readLine());
				break;
				default: dnu = "end"; break;
 			}

			switch (dnu) {
			case "1":
				System.out.println("Zadajte velkost trojuholnika int: ");
				int size = Integer.valueOf(readLine());
				Triangle tr22 = new Triangle(1, 1, 'o', size, false);
				System.out.println(tr22.toString(typ));
				break;
			case "2":
				System.out.println("Zadajte velkost stvorca int: ");
				int sizess = Integer.valueOf(readLine());
				Square sq22 = new Square(1, 1, 'o', sizess, false);
				System.out.println(sq22.toString(typ));
				break;
			case "3":
				System.out.println("Zadajte velkost obdlznika tvar vyska int: ");
				String sizes = readLine();
				int height = Integer.valueOf(sizes);
				System.out.println("Zadajte velkost obdlznika tvar sirka int: ");
				sizes = readLine();
				int width = Integer.valueOf(sizes);
				Rectangle rt22 = new Rectangle(1, 1, 'o', width ,  height, false);
				System.out.println(rt22.toString(typ));
				break;
			default: dnu = "end"; break;
			}

		} while (dnu.equals("end") == false);

		
		if(dnu == "end")
		{
			
			System.out.println("cav KONIEC");
			System.exit(0);
			System.out.println(" sdsddssssssssssssssss");
		}
		
		System.out.println(" ");
		//
		Line line = new Line(10, 10, 't', 10, true);// vytvori novu instanciu

		// Line ciara
		// line.to
		System.out.println(line.toString());// vykresli vytvorenu instanciu
		//
		Square s = new Square(10, 10, 't', 10);// vytvori novu isntaciu stvorca
		//
		System.out.println(s.toString());// vykresli stvorec
		//
		Rectangle r = new Rectangle(50, 10, 't', 10, 5, true);
		;// vytvori novu instaciu obdlznik
			//
		r.setHeight(10);// nastavi vysku obdlaznika
		r.setWidth(20);// nastavi sirku obdlznika
		//

		System.out.println(r.toString());// vykreslenie obdlznika

		System.out.println(s.toString1());

		Square o = new Square(10, 10, 'o', 10, true);

		Triangle tr2 = new Triangle(10, 10, 'o', 10, true);

		// tr.setSize(10);//nastavi trojuholnik z tr.setSize(pocetriadkov)

		System.out.println(tr2.toString3());// vykresli trojuholnik
		//
		System.out.println("sds ");

		System.out.println(o.toString1());

		System.out.println("sd ");

		System.out.println(r.toString2());

		System.out.println(" ");

		Triangle tr22 = new Triangle(1, 1, 'o', 5, false);

		System.out.println(tr22.toString3());

		System.out.println(tr2.toString2());

		System.out.println(tr2.toString(true));

	}

	private static boolean vrat() {
		System.out.println("prva");
		return false;
	}

	private static boolean vrat2() {
		System.out.println("druha");
		return true;
	}

	public static String readLine() {
		try {
			return input.readLine();
		} catch (IOException e) {
			return null;
		}
	}

}
