import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("I navigate to the file upload page")
    public void i_navigate_to_the_file_upload_page() {
        driver = new ChromeDriver();
        driver.get("http://example.com/file-upload");
        uploadPage = new tc_002Page(driver);
    }

    @When("I upload a valid file with format PDF/DOCX under 50MB")
    public void i_upload_a_valid_file_with_format_pdf_docx_under_50mb() {
        uploadPage.uploadFile("path/to/valid-file.pdf");
    }

    @Then("I should see the file preview with name, size, and type")
    public void i_should_see_the_file_preview_with_name_size_and_type() {
        assert uploadPage.isFilePreviewDisplayed();
        driver.quit();
    }
}