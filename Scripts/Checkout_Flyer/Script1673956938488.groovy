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
import com.kms.katalon.core.configuration.RunConfiguration


Map prefs = [('intl.accept_languages') : locale]
// Map preferences key to manipulate page's language.

RunConfiguration.setWebDriverPreferencesProperty("prefs", prefs)

if (locale == "uk") {
	
	WebUI.openBrowser("https://www.bizay.co.uk/");
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/span_Portugal'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Gr-Bretanha'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_BIZAY  Online Printing Services, Promo_761a6c/a_Login  Register'))
	
	WebUI.setText(findTestObject('Object Repository/CheckoutUK_flyer/Page_Login/input__UserName'), 'dcilurzo1@gmail.com')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/CheckoutUK_flyer/Page_Login/input__Password'), 'aeHFOx8jV/A=')
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Login/div__input-group'))
	
	WebUI.setEncryptedText(findTestObject('Object Repository/CheckoutUK_flyer/Page_Login/input__Password'), 'aeHFOx8jV/A=')
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Login/button_Login'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Debora Syone/span_Other products'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Debora Syone/p_Top Sellers'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Debora Syone/p_Flyers'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_4000 por 16.91  Cheap Flyers  Leaflet _29c642/div_START PURCHASE'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Flyers and Leaflets - Templates and De_cc4aeb/span_View Design'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Flyers and Leaflets - Templates and De_cc4aeb/button_Choose this design'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Create your Flyers 105 x 148 mm (A6)/a_Close'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Create your Flyers 105 x 148 mm (A6)/div_Finalize'))
	
	WebUI.click(findTestObject('Object Repository/CheckoutUK_flyer/Page_Basket/div_Next'))
	
	WebUI.closeBrowser()
}
else if (locale == "pt")  {
	WebUI.openBrowser("https://alpha.360imprimir.pt/");
	
	//WebUI.navigateToUrl('https://alpha.360imprimir.pt/')
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))
	
	WebUI.setText(findTestObject('Object Repository/Checkout_flyer/Page_Iniciar sesso/input__UserName'), 'dcilurzo1@gmail.com')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Checkout_flyer/Page_Iniciar sesso/input__Password'), 'aeHFOx8jV/A=')
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Iniciar sesso/button_Iniciar sesso'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Debora Syone/span_Mais produtos'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Debora Syone/p_Os Mais Vendidos'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Debora Syone/p_Flyers da JF'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_4000 Flyers 25,89  Imprimir Flyers Bar_5d5600/div_INICIAR COMPRA'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Flyer/span_Ver Design'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Flyer/button_Escolher este design'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Crie o(s) seu(s) Flyers da JF 105 x 14_4b906f/a_Fechar'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Crie o(s) seu(s) Flyers da JF 105 x 14_4b906f/div_Finalizar'))
	
	WebUI.click(findTestObject('Object Repository/Checkout_flyer/Page_Carrinho de Compras/div_Seguinte'))
	
	WebUI.closeBrowser()
}
