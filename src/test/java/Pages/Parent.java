package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {


    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        //scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        // scrollToElement(element);
        element.click();
    }

    public void hoverOverFunction(WebElement element)
    {
        waitUntilVisible(element);
        Actions actions=new Actions(GWD.driver);
        actions.moveToElement(element).build().perform();
    }

    public void selectByVisibleTextFunction(WebElement element, String text)
    {
        waitUntilLoading(element,text);
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }


    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilUrlContains(String text){
        WebDriverWait wait= new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlContains(text));

    }

    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilLoading(WebElement element, String text) {
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));

    }

}
