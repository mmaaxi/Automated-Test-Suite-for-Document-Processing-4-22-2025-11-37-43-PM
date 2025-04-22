package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    By uploadOption = By.id("upload-option");
    By singleUploadBox = By.id("single-upload-box");
    By multipleUploadBoxes = By.className("multiple-upload-box");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectUploadOption(String option) {
        WebElement uploadDropdown = driver.findElement(uploadOption);
        uploadDropdown.findElement(By.xpath("//option[text()='" + option + "']")).click();
    }

    public boolean isOptionDisplayed(String option) {
        WebElement uploadDropdown = driver.findElement(uploadOption);
        return uploadDropdown.findElement(By.xpath("//option[text()='" + option + "']")).isDisplayed();
    }

    public void selectUploadMode(String mode) {
        WebElement uploadDropdown = driver.findElement(uploadOption);
        uploadDropdown.findElement(By.xpath("//option[text()='" + mode + "']")).click();
    }

    public boolean isSingleUploadBoxEnabled() {
        return driver.findElement(singleUploadBox).isEnabled();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return driver.findElements(multipleUploadBoxes).size() > 0;
    }
}