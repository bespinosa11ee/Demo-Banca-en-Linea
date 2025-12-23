package modulo_1

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class Navegador {
	
	@Keyword
	def navigate(url) {
		try {
			WebUI.openBrowser('')
			WebUI.takeScreenshot("Screenshots/navigate_openBrowser_${timestamp()}.png")

			WebUI.navigateToUrl(url)
			WebUI.takeScreenshot("Screenshots/navigate_navigateToUrl_${timestamp()}.png")

			WebUI.maximizeWindow()
			WebUI.takeScreenshot("Screenshots/navigate_maximizeWindow_${timestamp()}.png")

			WebUI.comment("Navegación exitosa a: ${url}")
		} catch (Exception e) {
			WebUI.comment("Error al navegar a la URL: ${e.message}")
			WebUI.takeScreenshot("Screenshots/navigate_error_${timestamp()}.png")
			throw e
		}

	}
		private String timestamp() {
		return new Date().format('yyyyMMdd_HHmmss')
	}
}
