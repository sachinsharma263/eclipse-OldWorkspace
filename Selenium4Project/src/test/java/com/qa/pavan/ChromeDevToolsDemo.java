package com.qa.pavan;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v114.emulation.Emulation;
import org.openqa.selenium.devtools.v114.log.Log;
import org.openqa.selenium.devtools.v114.network.Network;
import org.openqa.selenium.devtools.v114.security.Security;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDevToolsDemo {

	WebDriver driver;

	@Test
	public void loadInsecureWebsite() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		DevTools devTools = ((ChromiumDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Security.setIgnoreCertificateErrors(true));

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

	}

	@Test(enabled = false)
	public void enableNetworkOffline() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		DevTools devTools = ((ChromiumDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Emulation.canEmulate());

		driver.get("https://app.hubspot.com/login");
	}

	@Test(enabled = true)
	public void consoleLogs() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		DevTools devTools = ((ChromiumDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Log.enable());
		devTools.addListener(Log.entryAdded(), entry -> System.out.println(entry.getText()));

		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.id("username")).sendKeys("test");
	}
}
