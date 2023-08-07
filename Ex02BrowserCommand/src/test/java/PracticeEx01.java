import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx01 {
    public static void main(String[] args) {
        String url = "https://shop.demoqa.com/";

        /*
            Launch a new Chrome browser.
            Open Shop.DemoQA.com
            Get Page Title name and Title length
            Print Page Title and Title length on the Eclipse Console.
            Get Page URL and verify if it is a correct page opened
            Get Page Source (HTML Source code) and Page Source length
            Print Page Length on Eclipse Console.
            Close the Browser.
         */

        System.out.println("Launching new Chrome browser.\n");
        WebDriver driver = new ChromeDriver();

        System.out.println("Opening Shop.DemoQA.com.\n");
        driver.get(url);

        System.out.println("Getting Page Title name and Title length.\n");
        String title = driver.getTitle();
        int titleLength = title.length();

        System.out.println("Printing Page Title name and Title length.\n");
        System.out.println("Page title: " + title + " - Length: " + titleLength);

        System.out.println("Getting Page URL and verifying if it is a correct page opened");
        String actualURL = driver.getCurrentUrl();

        if (url.equals(actualURL)) {
            System.out.println("Correct page is being opened");
        } else {
            System.out.println("Incorrect page \n\tExpected: " + url + "\n\t Actual: " + actualURL);
        }

        System.out.println("Getting Page Source (HTML Source code) and Page Source length");
        String source = driver.getPageSource();
        int sourceLength = source.length();

        System.out.println("Printing Page Length on Console.");
        System.out.println("Page source length: " + sourceLength);

        System.out.println("Closing the Browser.");
        driver.close();
    }
}
