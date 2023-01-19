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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Map prefs = [('intl.accept_languages') : locale]

// Map preferences key to manipulate page's language.
RunConfiguration.setWebDriverPreferencesProperty('prefs', prefs)

if (locale == 'pt') {
    WebUI.openBrowser('https://alpha.360imprimir.pt/')
	WebUI.click(findTestObject('Purchase_Card - Variable/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))
} else if (locale == 'uk') {
    WebUI.openBrowser('https://alpha.bizay.co.uk/')
}

WebUI.click(findTestObject('Purchase_Card - Variable/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.callTestCase(findTestCase('UserPdw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Iniciar sesso/button_Iniciar sesso'))

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Debora Syone/span_Mais produtos'))

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Debora Syone/p_Os Mais Vendidos'))

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Debora Syone/p_Cartes de Visita - ps'))

WebUI.click(findTestObject('Purchase_Card - Variable/Page_PromoPrice 5,13 , PromoDiscount 70,59/div_INICIAR COMPRA'))

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Promoes e Descontos  Grfica Online  36_832fe9/span_Ver Design'))

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Promoes e Descontos  Grfica Online  36_832fe9/button_Escolher este design'))

if (locale == 'pt') {
    WebUI.click(findTestObject('Purchase_Card - Variable/Page_Crie o(s) seu(s) Cartes de Visita - ps_adac70/a_Fechar'))

    WebUI.click(findTestObject('Purchase_Card - Variable/Page_Crie o(s) seu(s) Cartes de Visita - ps_adac70/div_Finalizar'))
} else if (locale == 'uk') {
    WebUI.click(findTestObject('Purchase_Card - Variable/Page_Create your Business Cards 55 x 85 mm _df4bce/a_Close'))

    WebUI.click(findTestObject('Purchase_Card - Variable/Page_Create your Business Cards 55 x 85 mm _df4bce/div_Finalize'))
}

WebUI.click(findTestObject('Purchase_Card - Variable/Page_Carrinho de Compras/div_Seguinte'))

WebUI.closeBrowser()

