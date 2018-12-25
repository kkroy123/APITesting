import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('API-Testing/ListUser'))
WS.verifyElementPropertyValue(response, 'per_page', 3)

WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'data[0].first_name', "George")
WS.verifyElementPropertyValue(response, 'data[0].last_name', "Bluth")
WS.verifyElementPropertyValue(response, 'data[1].first_name', "Janet")
WS.verifyElementPropertyValue(response, 'data[1].last_name', "Weaver")
WS.verifyElementPropertyValue(response, 'data[2].first_name', "Emma")
WS.verifyElementPropertyValue(response, 'data[2].last_name', "Wong")

createresponseuser = WS.sendRequest(findTestObject('API-Testing/CreateUser'))
WS.verifyResponseStatusCode(createresponseuser, 201)

Updateuserresponse=WS.sendRequest(findTestObject('API-Testing/UpdateUser'))

WS.verifyResponseStatusCode(Updateuserresponse, 200)

deleteuserresponse = WS.sendRequest(findTestObject('API-Testing/DeleteUser'))
WS.verifyResponseStatusCode(deleteuserresponse, 200)
/*testing*/

