package main.jsPropertiesResources;

import main.htmlCreator.AppendStringToHTML;
import main.htmlCreator.createHtmlHelper;
import main.resources.ResourcePath;

public class PieChartGenerationHelperClass {

	public static void getPieChartByJSproperties(int a, int b, int c, int d, int e, int f, int g, int h, int i,  int noOfIterationFORavg) {
		/*System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);
		System.out.println("E = " + e);
		System.out.println("F = " + f);
		System.out.println("G = " + g);
		System.out.println("H = " + h);
		System.out.println("I1 = " + i);*/
		
		createHtmlHelper.appendTXTtoHTML(ResourcePath.tenPieChart1);
		String jsPieAttributeValueString = 
				"[{country: 'a',value:"+ (a/noOfIterationFORavg) + "},{country: 'b', value: "+(b/noOfIterationFORavg)+"},{country: 'c',value: "+(c/noOfIterationFORavg)+"},{country: 'd',value: "+(d/noOfIterationFORavg)+"},{country: 'e',value: "+(e/noOfIterationFORavg)+"},{country: 'f',value: "+(f/noOfIterationFORavg)+"},{country: 'g',value: "+(g/noOfIterationFORavg)+"},{country: 'h',value: "+(h/noOfIterationFORavg)+"},{country: 'i',value: "+(i/noOfIterationFORavg)+"}];";
		AppendStringToHTML.AddStringToHTML(jsPieAttributeValueString);
		createHtmlHelper.appendTXTtoHTML(ResourcePath.tenPieChart2);
		
	}
	
}
