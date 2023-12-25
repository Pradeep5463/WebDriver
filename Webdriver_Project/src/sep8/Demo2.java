package sep8;


public class Demo2 {

	public static void main(String[] args) {
		String str1 = "Selenium";
		String str2 = "Manual";
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("strings are equal");
		}
		else
		{
			try {
				throw new Error("strings are not equal");
			} catch (Throwable t) {
				System.out.println(t.getMessage());
			}
		}

	}

}
