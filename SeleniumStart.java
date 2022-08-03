import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.className("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("Submit")).click();
		//driver.findElement(By.linkText("/index.php/auth/requestPasswordResetCode\">Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your password")).click();
		String start=driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println(start);
	}

}
