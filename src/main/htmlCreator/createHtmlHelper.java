package main.htmlCreator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import main.resources.ResourcePath;

public class createHtmlHelper {

	public static void appendTXTtoHTML(String getPositionTXTpath) {
	
		try {
//			new File(ResourcePath.getOutputHTMLpath).createNewFile();
			FileReader fr = new FileReader(getPositionTXTpath);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(ResourcePath.getOutputHTMLpath, true);
			String s;
 
			while ((s = br.readLine()) != null) { 
				fw.write(s); 
				fw.flush();
			}
			br.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
