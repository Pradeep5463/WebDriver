package sep9;


public class DemoNonStatic {
    //non static global  variables
	int x,y,z;
	double a,b,c;
	public void add()
	{
		x=789;
		y=78;
		z=x+y;
		System.out.println(z);
	}
	public void division()
	{
		a=76855;
		b=768;
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// creating reference object to call non static method
	    DemoNonStatic obj = new DemoNonStatic();
	    obj.add();
	    obj.division();
	    
	    
		
		
		

	}

}
