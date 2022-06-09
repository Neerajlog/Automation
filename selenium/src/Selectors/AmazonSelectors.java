package Selectors;

public class AmazonSelectors {

	//driver
	public static String drivertorun="webdriver.chrome.driver";
	 public static String driverPath="C:\\Users\\NEERAJ\\Downloads\\chromedriver_win32/chromedriver.exe";
	
	
 // login
	protected static String number=""; //please write your number
	protected static String password="";//please write your password
	
	
	//Go to site
	protected static String Amazon="https://www.amazon.in";
	
	//selctors
	
	protected static String SignXapth="//div[@id=\"nav-tools\"]/a[2]";
	
	protected static String DropDown="//select[@id='searchDropdownBox']";
	protected static String DropDown_value="Electronics";
	
	protected static String Search_bar="//input[@id='twotabsearchtextbox']";
	public  static String Search_bar_value="Iphone 12";
	
	public static String LinkText="Apple iPhone 12 (128GB) - Black";
	
	protected static String addToCart="//div[starts-with(@id,'addToCart_feature_div')]/div/span/span/span/input";
	
	protected static String cart_details="//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input";
	
	
}
