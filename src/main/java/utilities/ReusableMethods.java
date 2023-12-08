package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static java.lang.Math.abs;
import static utilities.DriverFactory.getDriver;

public class ReusableMethods {

    public void click(By by){
        WebElement element = getDriver().findElement(by);
        element.click();
    }

    public void sendKeys(By by, String value){
        WebElement element = getDriver().findElement(by);
        element.sendKeys(value);
    }

    public String getTextOfElement(By by){
        return getDriver().findElement(by).getText();
    }

    public boolean isDisplayed(By by){
        WebElement element = getDriver().findElement(by);
        return element.isDisplayed();
    }

    public boolean isClickable(By by){
        WebElement element = getDriver().findElement(by);
        return element.isDisplayed();
    }

    public boolean isElementContains(By by, String value){
        WebElement element = getDriver().findElement(by);
        String x = element.getText();
        return x.contains(value);
    }

    public ReusableMethods waitFor(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void scrollDown(int pixels){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0, " + abs(pixels) + ");", "");
    }
}
