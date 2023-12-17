package com.qa.selenium4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PDFReaderTest {

	WebDriver driver;
	String url = "https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf";

	@BeforeTest
	public void setup() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get(url);

	}

	@Test
	public void pdfReaderTest() throws IOException {
		URL pdfUrl = new URL(url);
		InputStream ip = pdfUrl.openStream();
		BufferedInputStream bsi = new BufferedInputStream(ip);
		PDDocument pd = PDDocument.load(bsi);

		System.out.println(pd.getNumberOfPages());

		Assert.assertEquals(pd.getNumberOfPages(), 4);

		PDFTextStripper pdf = new PDFTextStripper();
		String text = pdf.getText(pd);
		System.out.println(text);
		
		Assert.assertTrue(text.contains("To deploy this sample in your environment:"));
		
		System.out.println("--------------------");
		pdf.setStartPage(3);
		String text2=pdf.getText(pd);
		System.out.println(text2);
		
		
	}
}
