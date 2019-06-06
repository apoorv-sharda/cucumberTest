package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import properties.ReadPropertiesFile;

public class AllElements {
	ReadPropertiesFile value = new ReadPropertiesFile();
	public static WebDriver driver;
	
	@FindBy(name="postcode")
	public static WebElement areaCode;
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;
	@FindBy(xpath="//ul[@class='c-sortBy-popoverList']//li[3]//label[1]")
	public static WebElement sort;
	@FindBy(linkText="change location")
	public static WebElement location;
	
	public void openBrowser(){
		if(value.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Users/apoor/Desktop/SeleniumJars/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			
			System.setProperty("webdriver.gecko.driver", "C:/Users/apoor/Desktop/SeleniumJars/geckodriver.exe");
			driver = new FirefoxDriver();
		}PageFactory.initElements(driver, this);
		
	}
	public void url(){
		driver.get("https://www.just-eat.co.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}
	public void assertion(){// to check if the test executed right and the user is at the right path
		String currentUrl= driver.getCurrentUrl();
		String expectedUrl = "https://www.just-eat.co.uk/area/ar51-area51";
		Assert.assertEquals(expectedUrl, currentUrl);
		
	}

}
