package Selectors;

public class Makemytripselctor {
	
	//driver
	public static String drivertorun="webdriver.chrome.driver";
	 public static String driverPath="C:\\Users\\NEERAJ\\Downloads\\chromedriver_win32/chromedriver.exe";
	 
	//visit website
	protected static String MakeMyTrip="https://www.makemytrip.com";
	
	//selctors
	protected static String RoundTrip="//*[@id=\"root\"]/div/div[2]/div/div/div/ul/li[2]";
	protected static String Frominputselector="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label";
	protected static String Fromvalueselctor="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input";
	protected static String city="Chandigarh, India";
	
	protected static String citySelector="#react-autowhatever-1-section-0-item-0 > div > div.calc60 > p.font14.appendBottom5.blackText";
	protected static String search1="//div[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a";
	
	protected static String departureDateselector="//div[@class=\"DayPicker-Day\"][contains(@aria-label,'25 June 2022')]";
	protected static String returndateselector="//div[@class='DayPicker-Day DayPicker-Day--end DayPicker-Day--selected'][contains(@aria-label,'25 June 2022')]";
	
	protected static String search2="//button[@id=\'search-button\']";
}
