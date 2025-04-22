package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("I am on the document upload page")
    public void iAmOnTheDocumentUploadPage() {
        page.navigateToUploadPage();
    }

    @When("I select the {string} option")
    public void iSelectTheOption(String option) {
        page.selectUploadOption(option);
    }

    @Then("the system should display options for {string} and {string}")
    public void theSystemShouldDisplayOptionsFor(String single, String multiple) {
        Assert.assertTrue(page.isOptionDisplayed(single));
        Assert.assertTrue(page.isOptionDisplayed(multiple));
    }

    @When("I choose {string}")
    public void iChoose(String mode) {
        page.selectUploadMode(mode);
    }

    @Then("a single box should be enabled to upload the file")
    public void aSingleBoxShouldBeEnabledToUploadTheFile() {
        Assert.assertTrue(page.isSingleUploadBoxEnabled());
    }

    @Then("multiple boxes should be displayed for each required document")
    public void multipleBoxesShouldBeDisplayedForEachRequiredDocument() {
        Assert.assertTrue(page.areMultipleUploadBoxesDisplayed());
    }
}