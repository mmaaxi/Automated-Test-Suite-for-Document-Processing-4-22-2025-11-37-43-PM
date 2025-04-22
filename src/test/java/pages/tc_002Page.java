import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By fileInput = By.id("file-upload");
    By filePreview = By.id("file-preview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFilePreviewDisplayed() {
        WebElement previewElement = driver.findElement(filePreview);
        return previewElement.isDisplayed() && 
               previewElement.getText().contains("Name:") &&
               previewElement.getText().contains("Size:") &&
               previewElement.getText().contains("Type:");
    }
}