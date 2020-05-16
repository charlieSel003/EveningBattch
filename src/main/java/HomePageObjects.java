import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womtab;
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement emailid;
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	private WebElement go;
	@FindBy(xpath="//*[@id='columns']/p")
	private WebElement success;

	

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement womenbtn() {
		return womtab;
	}

	
	public void SetEmail(String email){
		setText(emailid, email);
	}


	
	

}
