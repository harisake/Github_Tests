package wdext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		
		FirefoxDriver ff =new FirefoxDriver();
		
		
		//ChromeDriver driver=new ChromeDriver();
		
		ff.get("https://demoqa.com/automation-practice-form");
		ff.manage().window().maximize();
		
		
		boolean display=ff.findElementById("firstName").isDisplayed();
		boolean enable =ff.findElementById("firstName").isEnabled();
		
		if(display == true && enable == true)
		{
		
		ff.findElementById("firstName").sendKeys("admin");
		String valueenterd =ff.findElementById("firstName").getAttribute("value");
		System.out.println(valueenterd);
		//valueenterd.length() >10
		
		}
		
		ff.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		ff.findElementByXPath("//label[@for='gender-radio-1']").click();
		ff.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ff.findElementByXPath("//label[text()='Sports']").click();
		//
		ff.findElementByXPath("//label[@for='hobbies-checkbox-1']").click();
		
		ff.findElementByXPath("//div[@class=' css-tlfecz-indicatorContainer']").click();
		//ff.findElementById("submit").click();
		
		
		//ff.findElementById("gender-radio-2").click();
	
		//ff.close();
		
	}

}

