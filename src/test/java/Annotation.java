import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation {
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser98766(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kitty\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@DataProvider(name="login")
	public Object [][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="adkjhkj";
		data[1][1]="fifif";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		return data;
		
	}
	@Test(dataProvider="login")
	@Parameters({"Username","Password"})
	public void login(String Username,String Password){
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
	}
}
