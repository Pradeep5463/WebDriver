package sep9;

public class Pradeep {
     public static void add(int x,int y)
     {
    	 int z = x+y;
    	 System.out.println(z);
     }
     public static String verify_string(String str1,String str2)
     {
    	 String res="";
    	 if(str1.equalsIgnoreCase(str2)) {
    		 res="strings are equal";
    	 }
    	 else {
    		 res="strings are not equal";
    	 }
		return res;
     }
		public static boolean compare_values(int a, int b)
		{
			if(a==b) 
			{
				return true;
			}
			else
			{
				return false;
			}
		}
    	 
     
	public static void main(String[] args) {
		Pradeep.add(100, 200);
		String res = Pradeep.verify_string("hello","hello");
		System.out.println(res);
		boolean obj = Pradeep.compare_values(100, 200);
		System.out.println(obj);
		

	}

}
