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

WebUI.navigateToUrl('https://www.syone.com/')

WebUI.click(findTestObject('Object Repository/Test Web Record/Page_Leading Open Source Solutions in Portu_9d9d25/a_Accept'))

WebUI.click(findTestObject('Object Repository/Test Web Record/Page_Leading Open Source Solutions in Portu_9d9d25/a_Solutions'))

WebUI.click(findTestObject('Object Repository/Test Web Record/Page_Leading Open Source Solutions in Portu_9d9d25/a_QA  Testing Services'))

WebUI.click(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/img'))

WebUI.setText(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/input_Want to get started with QA  Testing _2d8c82'), 
    'SYONE')

WebUI.setText(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/input_Want to get started with QA  Testing _0192e9'), 
    'SYONE')

WebUI.setText(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/input_Want to get started with QA  Testing _484b03'), 
    'SYONE@SYONE.COM')

WebUI.setText(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/input_Want to get started with QA  Testing _9f7abe'), 
    'SYONE')

WebUI.setText(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/input__phone-e08a4a3c-4d83-4f4c-aa78-28a39b_481823'), 
    '+351 9999999')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/select_RoleC-Level  VPHead  DirectorManager_c565cc'), 
    'Analyst', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Web Record/Page_Quality Assurance  Testing Services  Syone/select_DepartmentBoard  ExecutiveMarketingS_0c2d76'), 
    'Operations', true)

WebUI.closeBrowser()

