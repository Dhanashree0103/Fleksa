import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
public class FleksaTest {
	
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\JavaSoft\\ChromeDriverFolder\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
final String ANSI_GREEN = "\u001B[32m";
final String ANSI_RED = "\u001B[31m";
final String ANSI_RESET = "\u001B[0m";
	driver.get("https://prodtestv3.fleksa.de/");
	Thread.sleep(5000);
	//Test 1 : website Load
String pageSource = driver.getPageSource();
if (pageSource.contains("Kitchen Delights")) {
System.out.println("\u001B[32mTest 1 passed"); // Print test passed in green color
} else {
System.out.println("\u001B[31mTest 1 failed"); // Print test failed in red color
}
Thread.sleep(2000);
	//Test 2 : I can see MENU
if (pageSource.contains("MENU")) {
System.out.println("\u001B[32m Test 2 : I can see MENU"); // Print test passed in green color
} else {
System.out.println("\u001B[31m Test 2 : I can see MENU"); // Print test failed in red color
}
driver.get("https://prodtestv3.fleksa.de/en/menu/c3695b45-4595-4be2-8087-306dcf11a37a");
Thread.sleep(2000);
	//Test 3 : I can see Full MENU
if (pageSource.contains("Desserts")) {
System.out.println("\u001B[32m Test 3 : I can see Full Menu"); // Print test passed in green color
} else {
System.out.println("\u001B[31m Test 3 : failed"); // Print test failed in red color
}
	//Test 4 : I can see ADD and click
driver.findElement(By.xpath("//*[@id=\"245\"]/div[1]/div[2]/div[2]/div/div/button")).click();
Thread.sleep(2000);
if (pageSource.contains(" Add")) {
System.out.println("\u001B[32m Test 4 : I can see ADD And click Add"); // Print test passed in green color
} else {
System.out.println("\u001B[31m Test 4 : failed "); // Print test failed in red color
}
	//Test 5 : I can see Order Type - Choose PickUp
driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/div/ul/li[2]/button/div/div/div[2]/h3")).click();
Thread.sleep(4000);
if (pageSource.contains("Pickup")) {
System.out.println("\u001B[32m Test 5 : I can see Pickup And click Pickup"); // Print test passed in green color
} else {
System.out.println("\u001B[31m Test 5 : failed "); // Print test failed in red color
}
	//Test 6 : I can see Confirm
if (pageSource.contains("Confirm")) {
System.out.println("\u001B[32m Test 6 : I can see Confirm"); // Print test passed in green color
} else {
System.out.println("\u001B[31m Test 6 : failed "); // Print test failed in red color
}
	//Test 7 : I can Click Confirm
driver.findElement(By.xpath(" //*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/div/div/div[3]/button")).click();
Thread.sleep(2000);
if (pageSource.contains("Total")) {
System.out.println("\u001B[32m Test 7 : I Clicked on Confirm"); // Print test passed in green color
} else {
System.out.println("\u001B[31m Test 7 : failed "); // Print test failed in red color
}
Thread.sleep(4000);
//Test Final
WebElement button = driver.findElement(By.xpath("//*[@id=\"googlepay-container\"]/span/div/button/div/div[1]"));
// Check if the button is clickable
if (button.isEnabled()) {
// Button is clickable
button.click();
System.out.println("\u001B[32mTest passed"); // Print test passed in green color
} else {
// Button is not clickable
System.out.println("\u001B[31mTest failed"); // Print test failed in red color
}
}}

