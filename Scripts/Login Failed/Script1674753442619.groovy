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

WebUI.openBrowser('https://alpha.360imprimir.pt/')

WebUI.click(findTestObject('LoginNewUser - Variable/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('LoginNewUser - Variable/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.callTestCase(findTestCase('UserPdw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LoginNewUser - Variable/Page_Iniciar sesso/button_Iniciar sesso'))

WebUI.click(findTestObject('LoginNewUser - Variable/Page_Fazer Login/div_xDados de login invlidos'))

WebUI.closeBrowser()
