package sep6;

import java.io.*;

public class WriteText1 {

	public static void main(String[] args) throws Throwable{
		File f = new File("D:/ Sample.text");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am so lazy to attend class");
		bw.newLine();
		bw.write("But I want job in top mnc");
		bw.newLine();
		bw.write("with 20L package");
		bw.flush();
		bw.close();
		
		
		
		

	}

}
