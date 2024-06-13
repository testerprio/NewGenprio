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

WebUI.openBrowser(GlobalVariable.URL_Genprio)

WebUI.setText(findTestObject('Login/inputText', [('textfieldName') : 'text']), user)

WebUI.setEncryptedText(findTestObject('Login/inputText', [('textfieldName') : 'password']), encripPass)

WebUI.click(findTestObject('Global/btn', [('btnName') : 'btn-submit', ('txt') : 'Login']))

if (WebUI.verifyElementPresent(findTestObject('Login/p-dropdown', [('dropdownName') : 'businessUnit']), 5)) {
    WebUI.click(findTestObject('Login/p-dropdown', [('dropdownName') : 'businessUnit']))

    WebUI.click(findTestObject('Login/optionBU'))

    WebUI.click(findTestObject('Global/btn', [('btnName') : 'btn-submit', ('txt') : 'Pilih']))
}

WebUI.waitForElementPresent(findTestObject('Login/inputOTP4 filled'), 30)

WebUI.click(findTestObject('Global/btn', [('btnName') : 'btn-submit', ('txt') : 'Confirm']))

if (WebUI.verifyElementPresent(findTestObject('Global/p-checkbox', [('ckboxName') : 'acceptTerms']), 15)) {
    WebUI.check(findTestObject('Global/p-checkbox', [('ckboxName') : 'acceptTerms']))

    WebUI.click(findTestObject('Global/btn', [('btnName') : 'btn-submit', ('txt') : 'Lanjut']))
}

