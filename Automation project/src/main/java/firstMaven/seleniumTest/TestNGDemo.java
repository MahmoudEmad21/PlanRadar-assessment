package firstMaven.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	FirefoxDriver driver;

	@BeforeTest
	public void openURL ()
	{

		String FirfoxPath = System.getProperty("user.dir")+"\\resourses\\geckodriver.exe";


		System.setProperty("webdriver.gecko.driver", FirfoxPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.com");
	}

	@Test
	public void findElementAll()
	{
		WebElement allButton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/a/i"));
		allButton.click();
	}

	@Test
	public void findElementComputer() 
	{
		WebElement computer = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[8]/a/div"));
		computer.click();
	}

	@Test
	public void selectComputerAndTablet() 
	{
		WebElement computerAndTablet = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[6]/li[5]/a"));
		computerAndTablet.click();
	}

	@Test
	public void selectSamsung() 
	{
		WebElement samsungButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul/li[3]/span/a/div/label/i"));
		samsungButton.click();
	}
	@Test
	public void selectProduct() 
	{
		WebElement selectProduct = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span"));
		selectProduct.click();
	}
	@Test
	public void addCart() 
	{
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
	}
	@Test
	public void goCart()
	{
		WebElement goToCart = driver.findElement(By.id("nav-cart-text-container"));
		goToCart.click();
	}
	@Test
	public void deleteProduct()
	{
		WebElement deleteProduct = driver.findElement(By.name("submit.delete.C98b13b99-195d-4ae2-a4bf-d4179c061a7a"));
		deleteProduct.click();
	}

	@AfterTest
	public void close ()
	{
		driver.quit();
	}


}
