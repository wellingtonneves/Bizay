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

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_360imprimir  Grfica Online, Produtos P_a22487/span_Portugal'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Gr-Bretanha'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_BIZAY  Online Printing Services, Promo_761a6c/a_Login  Register'))

WebUI.setText(findTestObject('Object Repository/CheckoutUK/Page_Login/input__UserName'), 'dcilurzo1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CheckoutUK/Page_Login/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Debora Syone/span_Other products'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Debora Syone/p_Top Sellers'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Debora Syone/p_Business Cards'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Business Cards 500 for 5.80  Cheap Bus_cd68d1/a_Start Purchase'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Templates and Designs - Business Cards  Bizay/span_View Design'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Templates and Designs - Business Cards  Bizay/button_Choose this design'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Create your Business Cards 55 x 85 mm _df4bce/a_Close'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Create your Business Cards 55 x 85 mm _df4bce/div_Finalize'))

WebUI.click(findTestObject('Object Repository/CheckoutUK/Page_Basket/div_Next'))

WebUI.closeBrowser()

