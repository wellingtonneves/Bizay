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

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.setText(findTestObject('Object Repository/CheckoutPT_flyer/Page_Iniciar sesso/input__UserName'), 'dcilurzo1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CheckoutPT_flyer/Page_Iniciar sesso/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Iniciar sesso/button_Iniciar sesso'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Debora Syone/span_Mais produtos'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Debora Syone/p_Os Mais Vendidos'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Debora Syone/p_Flyers da JF'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_4000 Flyers 25,89  Imprimir Flyers Bar_5d5600/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Flyer/span_Ver Design'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Flyer/button_Escolher este design'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Crie o(s) seu(s) Flyers da JF 105 x 14_4b906f/a_Fechar'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Crie o(s) seu(s) Flyers da JF 105 x 14_4b906f/div_Finalizar'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_flyer/Page_Carrinho de Compras/div_Seguinte'))

WebUI.closeBrowser()
