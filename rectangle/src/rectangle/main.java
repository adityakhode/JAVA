package rectangle;

public class main {

	public static void main(String[] args) 
	{
		while (true){
		rect r1 = new rect();
		r1.get_length();
		r1.get_width();
		r1.get_color();
		r1.find_area();
		System.out.println("Area of rectangle is : "+r1.area);
		rect r2 = new rect();
		r2.get_length();
		r2.get_width();
		r2.get_color();
		r2.find_area();
		System.out.println("Area of rectangle is : "+r2.area);
		if(r1.area == r2.area)
		{
			if(r1.colour.toLowerCase().equals(r2.colour.toLowerCase()))
			{
				System.out.println("Two rectangles are equal");
				
			}
			else
			{
				System.out.println("Rectangles are not maching");
			}
			
		}
		else
		{
			System.out.println("Rectangles are not maching");
		}
	}
	}

}
