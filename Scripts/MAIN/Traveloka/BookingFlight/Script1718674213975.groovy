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

WebUI.openBrowser(GlobalVariable.URL_Traveloka)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Traveloka/productNav', [('hrfContains') : 'flight']))

WebUI.setText(findTestObject('Traveloka/inputFilter', [('inputType') : 'input-departure']), departure)

WebUI.sendKeys(findTestObject('Traveloka/inputFilter', [('inputType') : 'input-departure']), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Traveloka/inputFilter', [('inputType') : 'input-destination']), destiny)

WebUI.sendKeys(findTestObject('Traveloka/inputFilter', [('inputType') : 'input-destination']), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Traveloka/inputFilter', [('inputType') : 'passengers-input']))

WebUI.click(findTestObject('Traveloka/editGuestRoom', [('dataType') : 'passengers-stepper-plus-adult', ('idx') : '1']))

WebUI.click(findTestObject('Traveloka/div containsText', [('txt') : 'Done']))

WebUI.click(findTestObject('Traveloka/inputFilter', [('inputType') : 'date-input']))

WebUI.sendKeys(findTestObject('Traveloka/inputFilter', [('inputType') : 'date-input']), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, 
        Keys.ENTER))

WebUI.click(findTestObject('Traveloka/Flight selectSeatclass'))

CustomKeywords.'SupportMethod.selectRandomlyListobject'(findTestObject('Traveloka/div atRole', [('roleName') : 'option']))

WebUI.takeFullPageScreenshotAsCheckpoint('bookingFlight page')

WebUI.click(findTestObject('Traveloka/Flight btnSearch'))

