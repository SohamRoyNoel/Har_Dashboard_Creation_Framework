package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopy {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("E:\\ME as QA\\DashBoard_FrameWork\\Dynamic_DashBoard_Framework\\src\\test\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("E:\\ME as QA\\DashBoard_FrameWork\\Dynamic_DashBoard_Framework\\src\\test\\output.html", true);
			String s;
 
			while ((s = br.readLine()) != null) { 
				fw.write(s); 
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
