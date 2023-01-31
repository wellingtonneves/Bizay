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

WebUI.click(findTestObject('Estudo/LoginNewUser - Variable/Page_360imprimir  Servicios de impresin, pr_956dfa/a_Iniciar Sesin  Registrar'))

WebUI.setText(findTestObject('Estudo/LoginNewUser - Variable/Page_Iniciar Sesin/input__UserName'), 'd1syone@gmail.com')

WebUI.setEncryptedText(findTestObject('Estudo/LoginNewUser - Variable/Page_Iniciar Sesin/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Estudo/LoginNewUser - Variable/Page_Iniciar Sesin/button_Iniciar Sesin'))

WebUI.click(findTestObject('Purchase- Variable/Page_Debora Syone/span_Ms productos'))

WebUI.click(findTestObject('Purchase- Variable/Page_Debora Syone/p_Los ms vendidos'))

WebUI.click(findTestObject('Purchase- Variable/Page_Debora Syone/p_Tarjetas de Visita'))

WebUI.click(findTestObject('Purchase- Variable/Page_500 Tarjetas de Visita 11,10  Imprimir_c67b97/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Purchase- Variable/Page_Modelos de Tarjetas de Visita baratas/span_Ver Diseo'))

WebUI.click(findTestObject('Purchase- Variable/Page_Modelos de Tarjetas de Visita baratas/button_Escoger este diseo'))

WebUI.click(findTestObject('Purchase- Variable/Page_Cree su(s) Tarjetas de Visita 55 x 85 _ac1b5c/a_Cerrar'))

WebUI.click(findTestObject('Purchase- Variable/Page_Cree su(s) Tarjetas de Visita 55 x 85 _ac1b5c/div_Finalizar'))

WebUI.click(findTestObject('Purchase- Variable/Page_Carrito de Compras/div_Siguiente'))

WebUI.closeBrowser()

