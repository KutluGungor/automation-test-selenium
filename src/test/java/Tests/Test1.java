package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement element = driver.findElement(By.id("adplus-anchor"));
        ((JavascriptExecutor)driver).executeScript("document.getElementById('fixedban').style.display = 'none';", element);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Kutlu GÜNGÖR");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("kutlugungor58@hotmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.click();
        currentAddress.sendKeys("İstanbul, Türkiye");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("İstanbul, Türkiye");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        /////////////////////////////////

        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        System.out.println(nameText.getText());

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        System.out.println(emailText.getText());

    }
}
