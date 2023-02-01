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

WebUI.navigateToUrl('https://alpha.360imprimir.pt/')

WebUI.click(findTestObject('Object Repository/Producto/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.setText(findTestObject('Object Repository/Producto/Page_Iniciar sesso/input__UserName'), 'd1syone@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Producto/Page_Iniciar sesso/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Producto/Page_Iniciar sesso/button_Iniciar sesso'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Debora Syone/div_Mais produtos'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Debora Syone/p_Os Mais Vendidos'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Debora Syone/p_Cartes de Visita - ps'))

WebUI.click(findTestObject('Object Repository/Producto/Page_PromoPrice 10,71 , PromoDiscount 48,29/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Promoes e Descontos  Grfica Online  36_832fe9/span_Ver Design'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Promoes e Descontos  Grfica Online  36_832fe9/button_Escolher este design'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Crie o(s) seu(s) Cartes de Visita - ps_adac70/a_Fechar'))

WebUI.click(findTestObject('Object Repository/Producto/Page_Crie o(s) seu(s) Cartes de Visita - ps_adac70/div_Finalizar'))

WebUI.closeBrowser()

