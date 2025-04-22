package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tc_010Steps {

    private WebDriver driver;
    private tc_010Page page;

    public tc_010Steps(WebDriver driver) {
        this.driver = driver;
        this.page = PageFactory.initElements(driver, tc_010Page.class);
    }

    @Given("que el usuario ha iniciado sesión en la aplicación")
    public void queElUsuarioHaIniciadoSesionEnLaAplicacion() {
        page.login();
    }

    @When("el usuario completa la carga y procesamiento de documentos")
    public void elUsuarioCompletaLaCargaYProcesamientoDeDocumentos() {
        page.uploadAndProcessDocuments();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void elSistemaGeneraElSlipDeSalida() {
        page.verifySlipGenerated();
    }

    @Then("el sistema guarda los documentos originales en el historial de la solicitud")
    public void elSistemaGuardaLosDocumentosOriginalesEnElHistorialDeLaSolicitud() {
        page.verifyDocumentsSavedInHistory();
    }

    @Then("el sistema guarda los datos extraídos en el historial de la solicitud")
    public void elSistemaGuardaLosDatosExtraidosEnElHistorialDeLaSolicitud() {
        page.verifyDataSavedInHistory();
    }
}