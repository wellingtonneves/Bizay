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

WebUI.navigateToUrl('https://www.360imprimir.pt/')

WebUI.click(findTestObject('Object Repository/Site 360/Page_360imprimir  A maior loja de produtos _34e3ac/div_Materiais de Marketing'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_Imprimir online de Materiais de Market_591caa/span_Cartes de Visita 55 x 85 mm (Formato E_093126'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_500 por 9,80   Imprimir Cartes de Visi_30d9fd/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_Modelos de Cartes de Visita 360imprimir/span_Ver Design'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_Modelos de Cartes de Visita 360imprimir/button_Escolher este design'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_Crie o(s) seu(s) Cartes de Visita 85 x_4ecf43/a_Fechar'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_Crie o(s) seu(s) Cartes de Visita 85 x_4ecf43/div_Finalizar'))

WebUI.click(findTestObject('Object Repository/Site 360/Page_Carrinho de Compras/div_Seguinte'))

WebUI.closeBrowser()

