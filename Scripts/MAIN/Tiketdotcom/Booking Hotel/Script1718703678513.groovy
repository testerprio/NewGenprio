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

WebUI.openBrowser(GlobalVariable.URL_Tiket)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Tiketdotcom/mainProduct', [('menu') : 'hotel']))

CustomKeywords.'OtherKeyword.allowAllertPermission'()

WebUI.click(findTestObject('Tiketdotcom/div atDatatest', [('divData') : 'destination-input']))

WebUI.setText(findTestObject('Tiketdotcom/input atDatatest', [('inputTxt') : 'destination-search-box']), City)

CustomKeywords.'SupportMethod.selectRandomlyListobject'(findTestObject('Tiketdotcom/div atDatatest', [('divData') : 'hotel-list-item']))

WebUI.click(findTestObject('Tiketdotcom/div containsClass', [('divClass') : 'input_date']))

WebUI.sendKeys(findTestObject('Tiketdotcom/btn containsClass', [('btnClass') : 'Day_day_select']), Keys.chord(Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, Keys.TAB, Keys.TAB, Keys.ENTER))

CustomKeywords.'SupportMethod.selectRandomlyListobject'(findTestObject('Tiketdotcom/div containsClass', [('divClass') : 'passenger_amount']))

CustomKeywords.'OtherKeyword.selectObjectBasedOnIndex'(findTestObject('Tiketdotcom/btn containsClass', [('btnClass') : 'QuantityEditor']), 
    '4')

CustomKeywords.'OtherKeyword.selectObjectBasedOnIndex'(findTestObject('Tiketdotcom/btn containsClass', [('btnClass') : 'QuantityEditor']),
	'4')

WebUI.click(findTestObject('Tiketdotcom/btn contains', [('attr') : 'text()', ('value') : 'Selesai']))

WebUI.click(findTestObject('Tiketdotcom/btn containsClass', [('btnClass') : 'submit']))

