
package Demo;

import com.learnselenium.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Youtubeautomation {
    public static void main(String[]args){
        WebDriver driver=Base.getDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("i love bangladesh");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//body/ytd-app/div[@id='content']/ytd-page-manager[@id='page-manager']/ytd-search[@class='style-scope ytd-page-manager']/div[@id='container']/ytd-two-column-search-results-renderer[@class='style-scope ytd-search']/div[@id='primary']/ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[@id='contents']/ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer']/div[@id='contents']/ytd-video-renderer[1]/div[1]/ytd-thumbnail[1]/a[1]/yt-img-shadow[1]/img[1]")).click();
    }
}
