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

WebUI.navigateToUrl('https://alpha.bizay.co.uk/')

WebUI.click(findTestObject('Object Repository/Estudo/ShowRecorderWeb/Page_BIZAY  Online Printing Services, Promo_761a6c/a_Login  Register'))

WebUI.setText(findTestObject('Object Repository/Estudo/ShowRecorderWeb/Page_Login/input__UserName'), 'd1syone@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Estudo/ShowRecorderWeb/Page_Login/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Estudo/ShowRecorderWeb/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Estudo/ShowRecorderWeb/Page_Debora Syone/a_My account'))

WebUI.click(findTestObject('Object Repository/Estudo/ShowRecorderWeb/Page_Debora Syone/a_Logout'))

WebUI.closeBrowser()

