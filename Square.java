package projekt;

public class Square extends Shape{

	/*
	 * Trieda Square size: int toString() - vypis rovnostranneho trojuholnika
	 * podla size
	 * 
	 */
	
	@Override
	public String getHelloMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int size;
	private boolean field;
     public Square(int x, int y, char fill, int size) { // neda sa dat ako abseratk
		
		
		super(x,y,fill);
		this.size = size;
		
		
		// TODO Auto-generated constructor stub
	}
     
     public Square(int x, int y, char fill, int size, boolean field) { // neda sa dat ako abseratk
 		
 		
 		super(x,y,fill);
 		this.size = size;
 		this.field = field;
 		
 		// TODO Auto-generated constructor stub
 	}


	public Square(int size) {
		
		super();
		this.size = size;
      
	}

	@Override
	public String toString() {
		 
		Line line  = new Line(10, false);
		
		String t = "";
         t = t+ posun_y();
         
		for (int i = 0; i < this.size; i++) {
			t =t + posun_x();

			for (int j = 0; j < this.size; j++) {
								t = t + zmen();
			}
			t = t + "\n";
		}

		return t;
	}
	
	

	
	
	
	public String toString(boolean dnu)
	{
		
		
	String s = "";
		
		Line  line = new Line(0, 0, getFill(), 10, false);
		
		s += s += posun_y();
		
		for (int i = 0; i < this.size; i++) {
			
			if(dnu == false)
			{
				s += posun_x();
				
			  if(i == 0  || i == size-1){  
				  s += line.toString(0, size, false, true, false);
				  }
		         
			  else{ 
				   s += (line.toString(i,size, false, true,false));
				  }

				s += "\n";
			}
			else
			{
				s += posun_x();
				if(i == 0  || i == size-1){  
					  s += line.toString(0, size, false, true, true);
					  }
			         
				  else{ 
					   s += (line.toString(i,size, false, true,true));
					  }
				s += "\n";
				
				
			}
		}
		
		
		
		
		return s;

	}
	
	
	
	
	
	
	
	
	
	public String toString1() {

		Line line = new Line(0, 0, super.getFill(), size, false);

		String t = "";
		t = t + posun_y();

		t = t + posun_x();
		line.setLength(this.size);
		line.setFill('o');
		t = t + line.toString();
		t = t + " \n";

		for (int i = 0; i < this.size - 2; i++) {
			t = t + posun_x();
			if (field == false) {
				t = t + line.toString();
			} else {
				line.setLength(1);
				t = t + line.toString();
				line.setFill(' ');
				line.setLength(size - 2);
				t = t + line.toString();
				line.setLength(1);
				line.setFill('o');
				t = t + line.toString();
			}

			t = t + "\n";
		}

		t = t + posun_x();
		line.setLength(this.size);
		line.setFill('o');
		t = t + line.toString();

		return t;
	}
	
	
	

}
