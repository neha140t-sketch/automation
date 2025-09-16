package communityproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Set up ChromeDriver
        
        // Start browser
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://community.gleaminnovations.net/auth/login");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Email field
            WebElement email = wait.until(ExpectedConditions.elementToBeClickable(
                    By.name("email")));
            email.sendKeys("neha.t@gleamxsolutions.com");

            // Password field
            WebElement password = wait.until(ExpectedConditions.elementToBeClickable(
                    By.name("password")));
            password.sendKeys("Neha@123456");

            // Continue button
            // Click login
            driver.findElement(By.id("kt_sign_in_submit")).click();
            
            // 2. Click on "Write a post..." input
            WebElement postBox = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("input[placeholder='Write a post...']")));
            postBox.click();
            // 3. Enter text into the textarea inside the modal
            WebElement postTextarea = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("textarea[placeholder='Write a post...']")));
            postTextarea.sendKeys("test2");
            driver.findElement(By.className("btn btn-secondary")).click();
            
            
            // Wait briefly
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close browser
        }
	}

}
