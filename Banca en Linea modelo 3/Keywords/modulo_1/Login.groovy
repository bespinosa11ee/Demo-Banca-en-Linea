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

public class Login {

	//ingresar usuario
	@Keyword
	def ingresar_usuario(user) {

		TestObject usuario = findTestObject('Object Repository/Modulo 1/Login/ingresar usuario')

		if (WebUI.waitForElementClickable(usuario, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(usuario, user)
			WebUI.takeScreenshot("Screenshot/Login/Ingreso_Usuario_${timestamp()}.png")
			WebUI.comment("ingreso usuario correctamente")
			KeywordUtil.markPassed("ingreso usuario correctamente")
		} else {
			KeywordUtil.markWarning("no ingreso usuario")
			WebUI.takeScreenshot("Screenshot/LoginError/No_ingreso_Usuario.png")
		}
	}

	// ingresa contrasena
	@Keyword
	def ingresar_Contrasena(pass) {

		TestObject password = findTestObject('Object Repository/Modulo 1/Login/ingresar password')


		if (WebUI.waitForElementClickable(password, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(password, pass)
			WebUI.takeScreenshot("Screenshot/Login/Ingreso_Contrasena_${timestamp()}.png")
			WebUI.comment("ingreso contrasena correctamente")
			KeywordUtil.markPassed("ingreso contrasena correctamente")
		} else {
			KeywordUtil.markWarning("no ingreso contrasena")
			WebUI.takeScreenshot("Screenshot/Login_Error/No_ingreso_contrasena_${timestamp()}.png")
		}
	}



	// Hacer clic en el boton Login
	@Keyword
	def boton_Login() {

		TestObject btnLogin = findTestObject('Object Repository/Modulo 1/Login/boton login')

		if (WebUI.waitForElementClickable(btnLogin, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(btnLogin)
			WebUI.takeScreenshot("Screenshot/BotonLogin/hizo_click_${timestamp()}.png")
			WebUI.comment("ingreso contrasena correctamente")
			KeywordUtil.markPassed("ingreso contrasena correctamente")
		} else {
			KeywordUtil.markWarning("no ingreso contrasena")
			WebUI.takeScreenshot("Screenshot/Login_Error/No_ingreso_contrasena_${timestamp()}.png")
		}
	}


	// Cerrar Sesion
	@Keyword
	def Logout() {

		TestObject logout = findTestObject('Object Repository/Modulo 1/Login/boton logout')


		if (WebUI.waitForElementClickable(logout, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(logout)
			WebUI.takeScreenshot("Screenshot/BotonLogin/hizo_click_${timestamp()}.png")
			WebUI.comment("Cerrar sesion correctamente")
			KeywordUtil.markPassed("cerro sesion correctamente")
		} else {
			KeywordUtil.markWarning("no hizo clic en cerrar sesion")
			WebUI.takeScreenshot("Screenshot/Logout_Error/No_cerro_Sesion_${timestamp()}.png")
		}
	}


	private String timestamp() {
		return new Date().format('yyyyMMdd_HHmmss')
	}
}
