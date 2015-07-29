package projekt;

import javax.print.Doc;

public class Triangle extends Shape {

	private int size = 0;
	private boolean field;
	
	public Triangle(int x, int y, char fill, int size, boolean field) { // neda sa dat ako abseratk
		
		
		super(x,y,fill);
			
		this.size =size;
		this.field = field;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getHelloMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Triangle(int size)
	{
		super();
		this.size = size;
		
	}
	


	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String h = "";
		if (this.size < 0) {
			System.out.println("zaporne cislo");
			return null;
		}
      int i = 0;
      
        h +=  posun_y();
		while (i < this.size) {

			h = h + posun_x();
			h = h + printChars(size - i- 1 , ' ');
			h = h + printChars(1 * (i + 1) + i, zmen());
			h = h + "\n";
			i++;
		}

		return h;

	}
	
	
	String toString(boolean dnu) {
		
		String s = "";

		Line line = new Line(0, 0, getFill(), 10, false);

		s += s += posun_y();

		for (int i = 0; i < this.size; i++) {

			if (dnu == false) {
				s += posun_x();
				s += line.toString(this.size - i, this.size, true, false, false);
				s += line.toString(i * 2 + 1, this.size, false, false, false);
				s += "\n";
			} else {
				s += posun_x();
				s += line.toString(this.size - i, this.size, true, false, false);
				s += line.toString(i * 2 + 1, this.size, false, false, true);
				s += "\n";

			}
		}

		return s;
	
	}
	
	
	
	
	
	
	
	
	
	public String toString3() {
		// TODO Auto-generated method stub
		String h = "";
		if (this.size < 0) {
			System.out.println("zaporne cislo");
			return null;
		}
      int i = 0;
      
        h +=  posun_y();
		while (i < this.size) {

			h = h + posun_x();
			h = h + lina(size - i- 1 , ' ');
			h = h + lina(1 * (i + 1) + i, 'o');
			h = h + "\n";
			i++;
		}

		return h;

	}
	
	
	
	
	
	
	
	
	public String toString1() 
	{
		String h = "";
		if (this.size < 0) {
			System.out.println("zaporne cislo");
			return null;
		}
      int i = 0;
      
        h +=  posun_y();
		

			
			h = h + tlac2(size,'T');
			//h = h + printChars(1 * (i + 1) + i, zmen());
			
		

		return h;
	}
	
	
	

	public int getSize() {
		return size;
	}

    private String tlac2(int size, char typ)
    {
    	String h = "";
    	
    	Line line = new Line(0,0,typ,size, false);
    	
    	for(int i = 1; i <= size; i ++)
    	{
    		line.setLength(i);
    		h += posun_x();
    		h += line.toString();
    	
    		
    	}
    	
    	return h;
    	
    }

    
    private String lina(int si, char znak)
    {
    	String h = "";
    	
    	Line line = new Line(1,1,znak,si, false);
    	
        h = line.toString();
    	return h;
    	
    }







	public void setSize(int size) {
		this.size = size;
	}



	private String printChars(int length, char c) {
		String g = "";
		for (int i = 0; i < length; i++) {
			g = g + c;
		}
		return g;

	}
	
	
	public String toString2() {

		Line line = new Line(0, 0, super.getFill(), this.size, false);

		String t = "";
		t = t + posun_y();

		t = t + posun_x();
		line.setLength(this.size-1);
		line.setFill(' ');
		t = t + line.toString();
		line.setLength(1);
		line.setFill(getFill());
		t = t + line.toString();
		
		int pomoc = 1;
		t = t + " \n";

		for (int i = size-2; i > 0; i--) {
			t = t + posun_x();
			if (field == false) {
				t = t + line.toString();
			} else {
				
				line.setLength(i);
				line.setFill(' ');
				t = t + line.toString();
				line.setLength(1);
				line.setFill(getFill());
				t = t + line.toString();
				line.setLength(pomoc);
				line.setFill(' ');
				t = t + line.toString();
				line.setLength(1);
				line.setFill(getFill());
				t = t + line.toString();
				pomoc += 2;
			}

			t = t + "\n";
		}
	
		
		t = t + posun_x();
		line.setLength(size*2-1);
		line.setFill('o');
		t = t + line.toString();

		return t;
	}
	
	

}
