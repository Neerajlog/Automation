package Selectors;

public class BajajSelector {

	//driver
	public static String drivertorun="webdriver.chrome.driver";
	 public static String driverPath="C:\\Users\\NEERAJ\\Downloads\\chromedriver_win32/chromedriver.exe";
	
	
	//visite google
	public static String visit_google ="https://www.google.com/";
	
	//selectors
	protected static String google_Xapth ="//input[@name='q']";
	
	protected static String bajaj_link="//h3[contains(text(),'Bajaj Finserv Health - Your Personalized Healthcare Platform')]";
	
	protected static String search_bar="//input[@id='searchBarInput']";
	public static String value="Doctor";
	protected static String First_result="#__next > div.css-dgynh5 > div:nth-child(5) > div.css-1lwfv71 > div > div.css-1q66mfy > div.css-apwxfg > div > div:nth-child(1) > a > div";
	protected static String select_slot="div.MuiGrid-container > div:nth-child(2) > div.MuiPaper-root > div.MuiCardContent-root > div.flex-column > div:nth-child(2) > div:nth-child(1) > div.slotTimeContainer > a:nth-child(1)";
}
