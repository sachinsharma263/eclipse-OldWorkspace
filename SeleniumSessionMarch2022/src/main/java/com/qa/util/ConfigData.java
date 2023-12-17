package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {

	
	public static Properties getProperties() throws IOException {
		
		FileInputStream fis=new FileInputStream(new File("./src/main/java/com/qa/config/config.properties"));
		
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop;
		
	}
}
