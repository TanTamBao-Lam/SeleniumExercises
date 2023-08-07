import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx02 {
    public static void main(String[] args) throws InterruptedException {
        /*
            Launch a new Chrome browser.
            Open ToolsQA Practice Automation Page for Switch Windows: https://demoqa.com/browser-windows/
            Use this statement to click on a New Browser Window button
                "driver.findElement(By.id("New Browser Window")).click();"
            Close the browser using close() command
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows/");
        Thread.sleep(5000);

        //Open new browser windows.
        driver.findElement(By.id("windowButton")).click();

        driver.close();
    }
}
