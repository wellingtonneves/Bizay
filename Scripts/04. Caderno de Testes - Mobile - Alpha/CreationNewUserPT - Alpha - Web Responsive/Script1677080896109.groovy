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

WebUI.openBrowser('https://alpha.360imprimir.pt/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/img'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/img'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/img'))

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_Iniciar sesso/div_Criar Conta'), 30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_Iniciar sesso/div_Criar Conta'), 30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/div_Criar Conta'))

WebUI.setText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Email_UserName'), 
    'sy9993@syone.com')

WebUI.setText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Confirmar Email_ConfirmUserName'), 
    'sy9993@syone.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Senha_Password'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Confirmar senha_ConfirmPassword'), 
    'aeHFOx8jV/A=')

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Termos e Condies_gpdrCheckbox'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Termos e Condies_gpdrCheckbox'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/input_Termos e Condies_gpdrCheckbox'))

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_Iniciar sesso/div_Criar Conta'), 30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_Iniciar sesso/div_Criar Conta'), 30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Iniciar sesso/div_Criar Conta'))

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_Registar Cliente/i_Particular_icon-ok-sign icon-3x'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_Registar Cliente/i_Particular_icon-ok-sign icon-3x'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Registar Cliente/i_Particular_icon-ok-sign icon-3x'))

WebUI.setText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Registar Cliente/input_Apelido_Name'), 
    'Syone')

WebUI.setText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Registar Cliente/input_Apelido_Surname'), 
    'Syone')

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_Registar Cliente/i_Feminino_icon-ok-sign icon-2x'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_Registar Cliente/i_Feminino_icon-ok-sign icon-2x'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Registar Cliente/i_Feminino_icon-ok-sign icon-2x'))

WebUI.setText(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Registar Cliente/input_Telemvel_Phone'), 
    '961148765')

WebUI.waitForElementPresent(findTestObject('CreationNewUserPT - Web Responsive/Page_Registar Cliente/input_Telemvel_createClient'), 
    30)

WebUI.waitForElementClickable(findTestObject('CreationNewUserPT - Web Responsive/Page_Registar Cliente/input_Telemvel_createClient'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreationNewUserPT - Web Responsive/Page_Registar Cliente/input_Telemvel_createClient'))

WebUI.closeBrowser()

