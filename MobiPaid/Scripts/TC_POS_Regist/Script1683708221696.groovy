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

WebUI.openBrowser('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Register/Page_Register/input_Login_signatory_first_name'), 'Pransena')

WebUI.setText(findTestObject('Register/Page_Register/input_Login_signatory_last_name'), 'Hut')

WebUI.setText(findTestObject('Register/Page_Register/input_Login_email'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Register/Page_Register/input_Login_password'), '91Aed6jeBGSQu+00Y+kCQQ==')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_name'), 'Pransena')

WebUI.setText(findTestObject('Register/Page_Register/input_land Islands_form-control btn-log border-grey int_tel_input'), 
    '82362300888')

WebUI.selectOptionByValue(findTestObject('Register/Page_Register/div_Your state  province (optional)nullEastern CapeFree StateGautengKwaZulu-NatalLimpopoMpumalangaNorthern CapeNorth WestWestern Cape'), 
    'Free State', true)

WebUI.click(findTestObject('Register/Page_Register/input_By clicking this box, I accept the,and_psa-checkbox'))

WebUI.click(findTestObject('Register/Page_Register/div_Next Step   please wait'))

