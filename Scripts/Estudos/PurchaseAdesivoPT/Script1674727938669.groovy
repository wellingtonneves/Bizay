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

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.callTestCase(findTestCase('Regressão/UserPdw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Iniciar sesso/button_Iniciar sesso'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Debora Syone/p_Autocolantes'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Imprimir online de Autocolantes desde _637398/span_Vinil para cho 297 x 420 mm (A3) Sem extra'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_10 Vinil para cho Publicitrio 20,61   _2ea518/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Vinil para cho - Crie os seus Designs _586109/span_Ver Design'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Vinil para cho - Crie os seus Designs _586109/button_Escolher este design'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Crie o(s) seu(s) Vinil para cho 297 x _b98c74/a_Fechar'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Crie o(s) seu(s) Vinil para cho 297 x _b98c74/div_Finalizar'))

WebUI.click(findTestObject('Object Repository/PurchaseAdesivoPT/Page_Carrinho de Compras/div_Seguinte'))

WebUI.closeBrowser()

