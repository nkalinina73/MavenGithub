package QAUBER.test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavGit_Feb15 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver mg = new ChromeDriver();
        mg.get("https://www.google.com/");
        Thread.sleep(2000);

        mg.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("ivanka trump");
        Thread.sleep(2000);

        mg.findElement(By.xpath("//*[@id=\"lst-ib\"]")).submit();
        Thread.sleep(2000);

        mg.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("dogs");
        Thread.sleep(2000);

        //mg.close();
    }
}
