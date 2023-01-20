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

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.setText(findTestObject('Object Repository/CreatioNewUserPT/Page_Iniciar sesso/input__UserName'), 'd1syone@gmail.com')

WebUI.setText(findTestObject('Object Repository/CreatioNewUserPT/Page_Iniciar sesso/input__ConfirmUserName'), 'd1syone@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreatioNewUserPT/Page_Iniciar sesso/input__Password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/CreatioNewUserPT/Page_Iniciar sesso/input__ConfirmPassword'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_Iniciar sesso/input_Termos e Condies_gpdrCheckbox'))

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_Iniciar sesso/div_Criar Conta'))

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_Registar Cliente/i_Particular_icon-ok-sign icon-3x'))

WebUI.setText(findTestObject('Object Repository/CreatioNewUserPT/Page_Registar Cliente/input_Apelido_Name'), 'Debora')

WebUI.setText(findTestObject('Object Repository/CreatioNewUserPT/Page_Registar Cliente/input_Apelido_Surname'), 'Syone')

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_Registar Cliente/i_Feminino_icon-ok-sign icon-2x'))

WebUI.setText(findTestObject('Object Repository/CreatioNewUserPT/Page_Registar Cliente/input_Telemvel_Phone'), '961138965')

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_Registar Cliente/input_Telemvel_createClient'))

WebUI.click(findTestObject('Object Repository/CreatioNewUserPT/Page_Debora Syone/button_'))

WebUI.closeBrowser()

