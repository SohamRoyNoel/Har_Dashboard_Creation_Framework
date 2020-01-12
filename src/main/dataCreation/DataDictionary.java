package main.dataCreation;

import java.util.HashMap;



public class DataDictionary {

	public static HashMap<String, HashMap<String,Object>> getDataDictionary() {
		// Virtual Data Creation - Simulating The 9 Fields HAR value
		
		HashMap<String, HashMap<String,Object>> fileNameConstrains = new HashMap<String,HashMap<String,Object>>();
		HashMap<String,Object> valueFromEachOfThoseNineFields = new HashMap<String,Object>();
		valueFromEachOfThoseNineFields.put("A", 10);
		valueFromEachOfThoseNineFields.put("B", 20);
		valueFromEachOfThoseNineFields.put("C", 30);
		valueFromEachOfThoseNineFields.put("D", 10);
		valueFromEachOfThoseNineFields.put("E", 5);
		valueFromEachOfThoseNineFields.put("F", 20);
		valueFromEachOfThoseNineFields.put("G", 1);
		valueFromEachOfThoseNineFields.put("H", 100);
		valueFromEachOfThoseNineFields.put("I", 66);
		fileNameConstrains.put("File1", valueFromEachOfThoseNineFields);
		valueFromEachOfThoseNineFields=	new HashMap<String,Object>();
		valueFromEachOfThoseNineFields.put("A", 10);
		valueFromEachOfThoseNineFields.put("B", 50);
		valueFromEachOfThoseNineFields.put("C", 30);
		valueFromEachOfThoseNineFields.put("D", 90);
		valueFromEachOfThoseNineFields.put("E", 5);
		valueFromEachOfThoseNineFields.put("F", 20);
		valueFromEachOfThoseNineFields.put("G", 10);
		valueFromEachOfThoseNineFields.put("H", 90);
		valueFromEachOfThoseNineFields.put("I", 61);
		fileNameConstrains.put("File2", valueFromEachOfThoseNineFields);
		valueFromEachOfThoseNineFields=	new HashMap<String,Object>();
		valueFromEachOfThoseNineFields.put("A", 10);
		valueFromEachOfThoseNineFields.put("B", 60);
		valueFromEachOfThoseNineFields.put("C", 30);
		valueFromEachOfThoseNineFields.put("D", 2);
		valueFromEachOfThoseNineFields.put("E", 13);
		valueFromEachOfThoseNineFields.put("F", 9);
		valueFromEachOfThoseNineFields.put("G", 15);
		valueFromEachOfThoseNineFields.put("H", 88);
		valueFromEachOfThoseNineFields.put("I", 69);
		fileNameConstrains.put("File3", valueFromEachOfThoseNineFields);
		
		return fileNameConstrains;
	}

}
