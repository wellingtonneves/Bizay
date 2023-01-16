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

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_360imprimir  Grfica Online, Produtos P_a22487/span_Portugal'))

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Espanha'))

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_360imprimir  Servicios de impresin, pr_956dfa/button_S, quiero'))

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_360imprimir  Servicios de impresin, pr_956dfa/a_Iniciar Sesin  Registrar'))

WebUI.setText(findTestObject('Object Repository/LoginNewUserES/Page_Iniciar Sesin/input__UserName'), 'dcilurzo1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginNewUserES/Page_Iniciar Sesin/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_Iniciar Sesin/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_Debora Syone/a_Mi cuenta'))

WebUI.click(findTestObject('Object Repository/LoginNewUserES/Page_Debora Syone/a_Salir'))

WebUI.closeBrowser()

