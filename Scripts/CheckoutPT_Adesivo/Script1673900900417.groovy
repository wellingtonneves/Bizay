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

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.setText(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Iniciar sesso/input__UserName'), 'dcilurzo1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Iniciar sesso/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Iniciar sesso/button_Iniciar sesso'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Debora Syone/p_Autocolantes'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Imprimir online de Autocolantes desde _637398/span_Vinil 297 x 420 mm (A3) Sem extra'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_10 Vinil Publicitrio 13,99   Vinil Per_3bf95e/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Vinil - Crie os seus Designs  Personal_c0144a/span_Ver Design'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Vinil - Crie os seus Designs  Personal_c0144a/button_Escolher este design'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Crie o(s) seu(s) Vinil 100 x 138 cm/a_Fechar'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Crie o(s) seu(s) Vinil 100 x 138 cm/div_Finalizar'))

WebUI.click(findTestObject('Object Repository/CheckoutPT_adesivo/Page_Carrinho de Compras/div_Seguinte'))

WebUI.closeBrowser()

