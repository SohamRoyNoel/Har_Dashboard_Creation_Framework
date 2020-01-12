package main.jsPropertiesResources;

import java.util.HashMap;
import java.util.Set;

import main.htmlCreator.AppendStringToHTML;
import main.htmlCreator.createHtmlHelper;
import main.resources.ResourcePath;

public class BarChartGenerationHelperClass {

	public static void getBarChartByJSproperties(HashMap<String,Object> pulledElements, String fileName) throws InterruptedException {
		
//		[['Element', 'Density'],['Copper', 8.94],['Silver', 10.49],['Gold', 19.30],['Gold', 9.30],['Gold', 19.30],['Gold', 19.30],['Gold', 19.30],['Gold', 19.30],['Platinum', 21.45]]
		createHtmlHelper.appendTXTtoHTML(ResourcePath.elevenBarChart1);
		String barValueTable = "[['Element', 'Performance'],['A', "+ pulledElements.get("A") +"],['B', "+pulledElements.get("B")+"],['C', "+pulledElements.get("C")+"],['D', "+pulledElements.get("D")+"],['E', "+pulledElements.get("E")+"],['F', "+pulledElements.get("F")+"],['G', "+pulledElements.get("G")+"],['H', "+pulledElements.get("H")+"],['I', "+pulledElements.get("I")+"]]";
		AppendStringToHTML.AddStringToHTML(barValueTable);
		createHtmlHelper.appendTXTtoHTML(ResourcePath.elevenBarChart2);
		String identifyElementID = "var chart = new google.charts.Bar(document.getElementById('"+ fileName +"'));";
		AppendStringToHTML.AddStringToHTML(identifyElementID);
		createHtmlHelper.appendTXTtoHTML(ResourcePath.elevenBarChart4);
		String analysisFor = "<h4 class='tittle-w3-agileits mb-4'> Deatiled Analysis For "+ fileName +" </h4>";
		AppendStringToHTML.AddStringToHTML(analysisFor);
		String generateChart = "<div id='"+fileName+"'></div>";
		AppendStringToHTML.AddStringToHTML(generateChart);
		createHtmlHelper.appendTXTtoHTML(ResourcePath.elevenBarChart3);
	}
	
}
