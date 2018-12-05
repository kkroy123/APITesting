package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object Endpoint
     
    /**
     * <p></p>
     */
    public static Object CountryISOCode
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['userName' : 'ABC', 'Endpoint' : 'reqres.in', 'CountryISOCode' : 'IN'])
        allVariables.put('QA', allVariables['default'] + [:])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        userName = selectedVariables['userName']
        Endpoint = selectedVariables['Endpoint']
        CountryISOCode = selectedVariables['CountryISOCode']
        
    }
}
