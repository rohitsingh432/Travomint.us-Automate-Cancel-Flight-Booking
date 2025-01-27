package gads.travomintus;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gadstravomintus {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait

        try {
            // Maximize the window and open the website
            driver.manage().window().maximize();
            driver.get("https://us.travomint.com/");
            System.out.println("Website Opened");

            // Wait for the source field to be visible before clicking
            WebElement sourceField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]")));
            sourceField.click();

            // Enter Source Name
            WebElement sourceName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("from")));
            sourceName.sendKeys("AMD");
            System.out.println("Source Name - Entered.");

            // Select Source
            WebElement sourceSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div[2]/p[2]")));
            sourceSelect.click();
            System.out.println("Source City - Selected");

            // Wait and click on the destination field
            WebElement destinationField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div")));
            destinationField.click();

            // Enter Destination Name
            WebElement destinationName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/input")));
            destinationName.sendKeys("DEL");
            System.out.println("Destination Name - Entered");

            // Select Destination
            WebElement destinationSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]")));
            destinationSelect.click();
            System.out.println("Destination City - Selected");

            // Select Travelers Dropdown
            WebElement travellerDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]/div")));
            travellerDropdown.click();

            // Select Child
            WebElement numberOfChild = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/div/div[2]/div[2]/div[2]")));
            numberOfChild.click();

            // Select Infant
            WebElement numberOfInfant = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/div/div[3]/div[2]/div[2]")));
            numberOfInfant.click();

            // Click Done after selecting Travelers
            WebElement done = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/div/div[6]/button/span")));
            done.click();
            System.out.println("Travelers Selected");

            // Search Flights
            WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div/div[2]/button")));
            search.click();
            System.out.println("Searching Flights");

            // Wait for the search results page to load
            Thread.sleep(10000);

            // Select Flight and Click Book
            WebElement book = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/section/div/div/div[2]/div[2]/div/div[3]/div[2]/div/a")));
            book.click();
            System.out.println("Clicked on Book");

            // Wait for the next page
            Thread.sleep(10000);

            // Enter Email
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div/form/div[1]/div/div[1]/div/div[1]/div/input")));
            emailField.sendKeys("rohit.singh@snva.info");
            System.out.println("Email Entered");

            // Enter Phone Number
            WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div/input")));
            phoneField.sendKeys("8929659751");
            System.out.println("Phone Number Entered");
            
            // Scroll down using JavaScriptExecutor
            JavascriptExecutor jss = (JavascriptExecutor) driver;
            jss.executeScript("window.scrollBy(4, 920)");
            System.out.println("Scrolled Down");

            // Click Continue Button
            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
            continueButton.click();

            // Scroll down using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(4, 920)");
            System.out.println("Scrolled Down");

            // Enter First Name
            WebElement adultsFirstField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[1]/div[2]/div[1]/div/div[1]/div/input")));
            adultsFirstField.sendKeys("Rohit");

            // Enter Last Name
            WebElement adultsLastField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[1]/div[2]/div[3]/div/div[1]/div/input")));
            adultsLastField.sendKeys("Test");

            // Select DOB
            WebElement adultsDOB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[1]/div[2]/div[4]/div/div[1]/div/input")));
            adultsDOB.click();

            // Select Date
            WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[4]/button[3]")));
            date.click();
            System.out.println("Adults Details Entered");

            // Enter First Name
            WebElement childFirstField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[2]/div[2]/div[1]/div/div[1]/div/input")));
            childFirstField.sendKeys("Mohit");

            // Enter Last Name
            WebElement childLastField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[2]/div[2]/div[3]/div/div[1]/div/input")));
            childLastField.sendKeys("Test");

            // Select DOB
            WebElement childDOB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[2]/div[2]/div[4]/div/div[1]/div/input")));
            childDOB.click();

            // Select Date
            WebElement childdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[4]/button[4]")));
            childdate.click();
            System.out.println("child Details Entered");
            
             // Enter First Name
            WebElement infantFirstField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[3]/div[2]/div[1]/div/div[1]/div/input")));
            infantFirstField.sendKeys("ronit");

            // Enter Last Name
            WebElement infantLastField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[3]/div[2]/div[3]/div/div[1]/div/input")));
            infantLastField.sendKeys("Test");

            // Select DOB
            WebElement infantDOB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/li[3]/div[2]/div[4]/div/div[1]/div/input")));
            infantDOB.click();

            // Select Date
            WebElement infantdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[4]/button[4]")));
            infantdate.click();
            System.out.println("child Details Entered");
            
            // Click Continue Button After All Details Filled 
            WebElement DetailsAftercontinueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/form/ol/div/div/button")));
            DetailsAftercontinueButton.click();
            System.out.println("All Details Filled and Continue Button Clicked ");
            
            // Click Continue Button Secure Baggage 
            WebElement Securebaggagecontinue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[2]/button")));
            Securebaggagecontinue.click();
            
            // Click PayNow  Button
            WebElement PayNow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div/button")));
            PayNow.click();
            System.out.println("Pay Now Button Clicked ");
            
            // Click Stripe Cancel Button
            WebElement Stripecancel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/header/div/div/a/div/div/div[2]/div/h1")));
            Stripecancel.click();
            System.out.println("Cancel Booking Made Succesfully ");
           
           
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something Went Wrong");
        } finally {
            driver.quit();
        } 
    }
}
