
package Demo;

import com.learnselenium.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AmazonAtomationSingin {
    public static void main(String[]args){
        WebDriver driver=Base.getDriver();
        driver.get("https://www.amazon.com/");
        
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Yasin Arafat");
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("yasinarafat1194@gmail.com");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("bangladesh");
        driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("bangladesh");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign-In')]")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("yasinarafat1194@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("yasinarafat");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("full synthetic bike oil 20w-50");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
        //int a=driver.findElements(By.className("s-image")).size();
        //System.out.println(a);
    }
}
