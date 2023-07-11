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
		System.setProperty("webdriver.chrome.driver",  "E:\\JAVA\\JavaSoft\\ChromeDriverFolder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

     final String ANSI_GREEN = "\u001B[32m";
     final String ANSI_RED = "\u001B[31m";
     final String ANSI_RESET = "\u001B[0m";

    	driver.get("https://prodtestv3.fleksa.de/");
    	Thread.sleep(5000);


//Test 1 : website Load
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Kitchen Delights")) {
            System.out.println("\u001B[32m   Test 1 : passed");  // Print test passed in green color
        } else {
            System.out.println("\u001B[31m   Test 1 : failed");  // Print test failed in red color
        }
        Thread.sleep(2000);
        
        
        
        
//Test 2 : I can see MENU
        if (pageSource.contains("MENU")) {
            System.out.println("\u001B[32m   Test 2 : I can see MENU");  
        } else {
            System.out.println("\u001B[31m  Test 2 : I can see MENU");   
        }
        driver.get("https://prodtestv3.fleksa.de/en/menu/c3695b45-4595-4be2-8087-306dcf11a37a");
        Thread.sleep(2000);
        
        
        
        
       
//Test 3 : I can see Full MENU
        if (pageSource.contains("Desserts")) {
            System.out.println("\u001B[32m   Test 3 : I can see Full Menu");  
        } else {
            System.out.println("\u001B[31m  Test 3 : failed");  
        }
        
        
        

      	//Test 4 : I can see ADD and click
        driver.findElement(By.xpath("//*[@id=\"245\"]/div[1]/div[2]/div[2]/div/div/button")).click();
            Thread.sleep(2000);
            if (pageSource.contains(" Add")) {
                System.out.println("\u001B[32m   Test 4 : I can see ADD And click Add");  
           } else {
               System.out.println("\u001B[31m  Test 4 : failed ");  
           }
           
                   

//Test 5 : I can see Order Type - Choose PickUp
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/div/ul/li[2]/button/div/div/div[2]/h3")).click();
        Thread.sleep(4000);
         if (pageSource.contains("Pickup")) {
                 System.out.println("\u001B[32m   Test 5 : I can see Pickup And click Pickup");  
          } else {
           System.out.println("\u001B[31m  Test 5 : failed ");  
            }
                              
                                      
                               
                                                              
//Test 6 : I can see  Confirm
           if (pageSource.contains("Confirm")) {
                System.out.println("\u001B[32m   Test 6 : I can see Confirm");  
              } else {
            System.out.println("\u001B[31m  Test 6 : failed ");  
                                                                    }
                                      
           
                                                                            
  //Test 7 : I can Click  Confirm
                                                                         
          driver.findElement(By.xpath(" //*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/div/div/div[3]/button")).click();
                 Thread.sleep(2000);
           if (pageSource.contains("Total")) {
                    System.out.println("\u001B[32m   Test 7 : I Clicked on Confirm");  
           } else {
                System.out.println("\u001B[31m  Test 7 : failed ");  
            }
             Thread.sleep(5000);
        
                                                                            
                                                                            
                                                                            
  //Test 8 : Go To CheckOut and Final test
                                                                            
          driver.findElement(By.xpath(" //*[@id=\"__next\"]/div/div[3]/div[3]/div/div/div[3]/div/div[2]/div[3]/a/p")).click();
             Thread.sleep(2000);
                                                                            
                                                                           
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/input")).sendKeys("Dhanashree Shinde");
        driver.findElement(By.xpath("  /html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("dhanashreeshinde0103@gmail.com");
        driver.findElement(By.xpath(" /html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]/div/div/div[3]/div[1]/div[1]/div/input")).sendKeys("8421090583");


        if (pageSource.contains("Dhanashree Shinde")) {
            System.out.println("\u001B[32m   Test 8 : All Test Are Passed");  
        } else {
            System.out.println("\u001B[31m  Test 8 : failed ");  
        }
     
        driver.quit();        
        
        
    }
    
    
}


