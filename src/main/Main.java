package main;

import main.dataCreation.DataDictionary;
import main.htmlCreator.AppendStringToHTML;
import main.htmlCreator.createHtmlHelper;
import main.jsPropertiesResources.MapValueAnalyzer;
import main.resources.ResourcePath;

public class Main {

	public static void main(String[] args) {

		createHtmlHelper.appendTXTtoHTML(ResourcePath.oneHeaderHTML);
//		
		String getUserName = System.getProperty("user.name");
		String generateHTML_username = "<h3 class='sub-title-w3-agileits'>"+getUserName+"</h3>";
		String getUserEmail = "<a href='mailto:info@example.com'>mam@example.com</a>";
		AppendStringToHTML.AddStringToHTML(generateHTML_username);
		AppendStringToHTML.AddStringToHTML(getUserEmail);
//		
		createHtmlHelper.appendTXTtoHTML(ResourcePath.twoDivsAfterUserName);
//		
//		// For Cards
		int numberOfIteration = 3; // Determine iteration - get The count of generated HAR files from the folder
		String generateHTML_iterationNumber = String.valueOf(numberOfIteration)+"&nbsp";
		AppendStringToHTML.AddStringToHTML(generateHTML_iterationNumber);
//		
//		// 2nd card
		createHtmlHelper.appendTXTtoHTML(ResourcePath.threeIteratableFiles);
		AppendStringToHTML.AddStringToHTML(generateHTML_iterationNumber);
//		
//		//3rd card
		createHtmlHelper.appendTXTtoHTML(ResourcePath.fourTask);
		AppendStringToHTML.AddStringToHTML(generateHTML_iterationNumber);
//		
//		//4th card
		createHtmlHelper.appendTXTtoHTML(ResourcePath.fiveAnalysis);
		AppendStringToHTML.AddStringToHTML(generateHTML_iterationNumber);
//		
//		//6th close Card 
		createHtmlHelper.appendTXTtoHTML(ResourcePath.sixCardcloser);
		
		// Virtual Data Creation - Simulating The 9 Fields HAR value - PIE CHART GENERATION
		MapValueAnalyzer.getSubMapValues(DataDictionary.getDataDictionary(), numberOfIteration);
		
		
		// 7th Pie chart - Average
		
		
		// 8th Script for BAR chart - Individual Analysis
		
		// 9th - Footer
		createHtmlHelper.appendTXTtoHTML(ResourcePath.ningthFooter);
	}

}
