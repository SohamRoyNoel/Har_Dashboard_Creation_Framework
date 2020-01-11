package main.htmlCreator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import main.resources.ResourcePath;

public class AppendStringToHTML {

	public static void AddStringToHTML(String getLineToAppend) {
		try {
		    Files.write(Paths.get(ResourcePath.getOutputHTMLpath), getLineToAppend.getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		}
	}
	
}
