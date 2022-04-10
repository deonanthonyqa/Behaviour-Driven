package BDD.CucumberBDD.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigDetails {

	
	public String getPropertyValue(String property) {
		
		
		
		String configPath = System.getProperty("user.dir") + "\\Resources\\Config.properties";
		System.out.println(configPath + "this is config path");
		FileInputStream inputStream = null;

		Properties prop = new Properties();

		try {
			inputStream = new FileInputStream(configPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
return prop.getProperty(property);
	
	}
	
}
