package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Assignment1 {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();  


driver.get("http://leaftaps.com/opentaps/");

//object.method.method..
driver.manage().window().maximize();

driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Mohana Priya");
driver.findElement(By.id("lastNameField")).sendKeys("GP");
driver.findElement(By.className("smallSubmit")).click();
String text1  = driver.findElement(By.id("viewContact_fullName_sp")).getText();
System.out.println("First Name: "+text1);
String title = driver.getTitle();
System.out.println("Title: "+title);


driver.close();

	}

}
