package main.jsPropertiesResources;

import java.util.HashMap;
import java.util.Set;

public class MapValueAnalyzer {

	// Bar Chart
	public static void getMapValues(HashMap<String, HashMap<String,Object>> fileNameConstrains) throws InterruptedException {
		Set keys = fileNameConstrains.keySet();
//		System.out.println("All keys are: " + keys);
		Object[] arr = keys.toArray(); 
		// To get all key: value
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(fileNameConstrains.get(arr[i]));
			BarChartGenerationHelperClass.getBarChartByJSproperties(fileNameConstrains.get(arr[i]), arr[i].toString());
		}
	}

	// Pie Chart
	public static void getSubMapValues(HashMap<String, HashMap<String,Object>> fileNameConstrains, int noOfIterationFORavg) {
		int a = 0; int b = 0; int c = 0; int d = 0; int e = 0; int f = 0; int g = 0; int h = 0; int i1 = 0; 
		Set keys = fileNameConstrains.keySet();
		System.out.println("All keys are: " + keys);
		Object[] arr = keys.toArray(); 
		// To get all key: value
		for (int i = 0; i < arr.length; i++) {
			System.out.println(fileNameConstrains.get(arr[i]));
			Set Subkeys = fileNameConstrains.get(arr[i]).keySet();
			System.out.println(Subkeys);
			Object[] subArr = Subkeys.toArray(); 
			for (int j = 0; j < subArr.length; j++) {
//				System.out.println(fileNameConstrains.get(arr[i]).get(subArr[j]));
				if(subArr[j].toString() == "A") { a += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "B") { b += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "C") { c += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "D") { d += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "E") { e += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "F") { f += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "G") { g += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "H") { h += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
				if(subArr[j].toString() == "I") { i1 += Integer.parseInt(fileNameConstrains.get(arr[i]).get(subArr[j]).toString() ); }
			}
		}
		/*System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);
		System.out.println("E = " + e);
		System.out.println("F = " + f);
		System.out.println("G = " + g);
		System.out.println("H = " + h);
		System.out.println("I = " + i1);*/
		PieChartGenerationHelperClass.getPieChartByJSproperties(a, b, c, d, e, f, g, h, i1, noOfIterationFORavg);
		
	}

}
