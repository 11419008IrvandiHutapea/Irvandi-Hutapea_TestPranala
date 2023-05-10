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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/home/register')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_first_name'), 'andri')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'), 'Last')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_email'), 'lastpq@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), 'YyYUMQeuJWy/92bQJMk77Q==')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_name'), 'Last')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_form-control btn-log bor_48151b'), '82653962343')

WebUI.click(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your state  province (optional)nullE_5336fa'), 
    'Eastern Cape', true)

WebUI.click(findTestObject('Object Repository/Page_Register/input_By clicking this box, I accept the,an_f76ab8'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Configuration/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Configuration/input_Yes_questions30'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Configuration/label_Yes'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Configuration/input_Projected annual volume_questions33'), 
    '100000000')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Configuration/button_Submit please wait'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Referral_referral_general'), '13197361')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Trading As_trading_name'), 'skhgg')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'public', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_Description of your products or se_3a74f4'), 
    'admakhadguada')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 1_company_street_no'), 
    'kadgafdakw')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 1_company_street_no'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 2_company_street_name'), 
    'ksdadjabkada')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_City_company_city'), '319731')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ZIP or Postal Code_company_postal_code'), 
    'ksd1')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_City_company_city'), 'medan')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ZIP or Postal Code_company_postal_code'), 
    '131313')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_State  Province  Region_company_state'), 
    'Eastern Cape')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please Select a country --       _1af844'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Website_company_website'), 'kdakhadkad')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Year of incorporation_company_age'), 
    'kadhakxaax')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Email_signatory_email'), 'andri@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ID Number_signatory_id_number'), 
    '23298796')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '8225456785623')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/label_Same as company address'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '82164789087')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Holder_account_holder'), 
    'kadhada')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Number_account_number'), 
    '138731')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Bank_bank'), 'Mandiri')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    'DZ', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Branch Code or Routing Number_branch_code'), 
    'ljdskhds757')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_SwiftBIC_swift_bic'), 'skdshkhs')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_Special Instructions (Optional)_in_1d0905'), 
    'khsdsjgs')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/label_'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Dashboard/i_Mobipaid new UI_fa fa-times fa-2x'))

