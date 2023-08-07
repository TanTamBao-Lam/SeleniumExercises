import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWebPage {
    public static void main(String[] args) {
        //Declare the drivers
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();
        WebDriver edgeDriver = new EdgeDriver();

        //Open web pages with different browser
        System.out.println("Opening web pages with Chrome, FireFox, and Edge.\n");
        //Chrome - Google.
        chromeDriver.get("https://www.google.com");

        //Firefox - Facebook.
        firefoxDriver.get("https://www.facebook.com");

        //Edge - LinkedIn.
        edgeDriver.get("https://www.linkedin.com");

        System.out.println("Successfully open web pages with browsers. \n");

        //Close all drivers
        System.out.println("Closing all pages.");
        chromeDriver.quit();
        firefoxDriver.quit();
        edgeDriver.quit();
        System.out.println("Pages are closed successfully.");
    }
}
