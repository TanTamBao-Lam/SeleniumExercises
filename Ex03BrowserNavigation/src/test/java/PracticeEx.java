import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx {
    public static void main(String[] args) throws InterruptedException {

        /*
            Launch new Browser
            Open DemoQA.com website
            Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
            Come back to Home page (Use 'Back' command)
            Again go back to Registration page (This time use 'Forward' command)
            Again come back to Home page (This time use 'To' command)
            Refresh the Browser (Use 'Refresh' command)
            Close the Browser
         */

        String url = "https://demoqa.com/";

        System.out.println("Launching new Browser");
        WebDriver driver = new ChromeDriver();

        System.out.println("Opening DemoQA website");
        driver.get(url);

        Thread.sleep(1000);

        System.out.println("Clicking on Registration link");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        /* *
         * Selenium offered several methods to navigate between webpages.
         * To access to these methods, we need to call its parent interface which is .navigate().
         * Syntax: driver.navigate().navigation_method.
         * */

        System.out.println("Coming back to Home page (Use 'Back' command)");
        //Back method to go back to previous page.
        driver.navigate().back();
        Thread.sleep(1000);

        System.out.println("Going back to Registration page (This time use 'Forward' command)");
        //Forward method to go forward to the last page.
        driver.navigate().forward();
        Thread.sleep(1000);

        System.out.println("Coming back to Home page (This time use 'To' command)");
        //To method to go to specific web page with url.
        driver.navigate().to(url);
        Thread.sleep(1000);

        System.out.println("Refreshing the Browser (Use 'Refresh' command)");
        //Refresh method to refresh the browser.
        driver.navigate().refresh();
        Thread.sleep(1000);

        System.out.println("Closing the browser");
        driver.close();
    }
}
