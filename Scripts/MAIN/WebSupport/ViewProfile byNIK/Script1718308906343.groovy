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

WebUI.click(findTestObject('Comet/mainMenu', [('txt') : 'Customer Support']))

WebUI.click(findTestObject('Comet/mainMenu child', [('txtMenu') : 'View Profile']))

WebUI.click(findTestObject('Comet/div containsClass', [('classTxt') : 'dropdown-label']))

WebUI.click(findTestObject('Comet/searchbyNIK'))

WebUI.setText(findTestObject('Comet/input formcontrolname', [('txtInput') : 'searchValue']), NIK)

WebUI.click(findTestObject('Comet/btn containsText', [('txtBtn') : 'Search Customer']))

WebUI.waitForPageLoad(3)

WebUI.takeFullPageScreenshotAsCheckpoint('ViewProfilebyNIK page')

