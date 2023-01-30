import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alpha.360imprimir.es/')

WebUI.click(findTestObject('Object Repository/FlyerES/Page_360imprimir  Servicios de impresin, pr_956dfa/a_Iniciar Sesin  Registrar'))

WebUI.click(findTestObject('Object Repository/FlyerES/Page_Iniciar Sesin/div_Ya es cliente de 360imprimir        Int_b631a5'))

WebUI.setText(findTestObject('Object Repository/FlyerES/Page_Iniciar Sesin/input__UserName'), 'd1syone@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/FlyerES/Page_Iniciar Sesin/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/FlyerES/Page_Iniciar Sesin/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/FlyerES/Page_Debora Syone/span_Ms productos'))

WebUI.click(findTestObject('Object Repository/FlyerES/Page_Debora Syone/p_Los ms vendidos'))

WebUI.click(findTestObject('Purchase- Variable/Page_Debora Syone/p_Flyers - NM'))

WebUI.click(findTestObject('Purchase- Variable/Page_4000 Flyers  20,89   Imprimir Flyers  _fa7b9f/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Purchase- Variable/Page_Plantillas de Flyer barato al precio ms bajo/span_Ver Diseo'))

WebUI.click(findTestObject('Purchase- Variable/Page_Plantillas de Flyer barato al precio ms bajo/button_Escoger este diseo'))

WebUI.click(findTestObject('Purchase- Variable/Page_Cree su(s) Flyers - NM 99 x 210 mm (DL_b171ea/a_Cerrar'))

WebUI.click(findTestObject('Purchase- Variable/Page_Cree su(s) Flyers - NM 99 x 210 mm (DL_b171ea/div_Finalizar'))

WebUI.click(findTestObject('Purchase- Variabl/Page_Carrito de Compras/div_Siguiente'))

WebUI.closeBrowser()

