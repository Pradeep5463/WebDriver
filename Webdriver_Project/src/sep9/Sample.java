package sep9;


public class Sample {
    //static global  variables
	static int x,y,z;
	static double a,b,c;
	public static void add()
	{
		x=345;
		y=55;
		z=x+y;
		System.out.println(z);
	}
	public static void division()
	{
		a=65543;
		b=675;
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// calling static method with class name
	    Sample.division();
	    Sample.add();
	    
		
		
		

	}

}
