import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
/*import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import org.openqa.selenium.Keys as Keys*/ import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://alpha.360imprimir.pt/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'), 
    30)

WebUI.verifyElementClickable(findTestObject('CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.enhancedClick(findTestObject('Object Repository/CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/button_Aceito'))

WebUI.waitForElementVisible(findTestObject('CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'), 
    30)

WebUI.enhancedClick(findTestObject('Object Repository/CreatioNewUserPT/Page_360imprimir  Grfica Online, Produtos P_a22487/a_Entrar  Registar'))

WebUI.waitForElementVisible(findTestObject('Page_Iniciar sesso/div_Criar Conta_Mobile'), 30)

WebUI.verifyElementClickable(findTestObject('Page_Iniciar sesso/div_Criar Conta_Mobile'))

WebUI.enhancedClick(findTestObject('Page_Iniciar sesso/div_Criar Conta_Mobile'))

WebUI.setText(findTestObject('Mobile Window/Page_Iniciar sesso/input_Email_UserName'), 'sy892syone@gmail.com')

WebUI.setText(findTestObject('Mobile Window/Page_Iniciar sesso/input_Confirmar Email_ConfirmUserName'), 'sy892syone@gmail.com')

WebUI.setEncryptedText(findTestObject('Mobile Window/Page_Iniciar sesso/input_Senha_Password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Mobile Window/Page_Iniciar sesso/input_Confirmar senha_ConfirmPassword'), 'aeHFOx8jV/A=')

WebUI.enhancedClick(findTestObject('Mobile Window/Page_Iniciar sesso/input_Termos e Condies_gpdrCheckbox'))

WebUI.enhancedClick(findTestObject('Mobile Window/Page_Iniciar sesso/div_Criar Conta'))

WebUI.closeBrowser()

