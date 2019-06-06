package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public String browser() throws IOException {
		FileInputStream fs = new FileInputStream("C:/Users/apoor/Desktop/TestNG/cucumber/src/main/java/properties/config.properties");
		Properties prop= new Properties();
		prop.load(fs);

		String browser = prop.getProperty("browser");
		// TODO Auto-generated method stub
		return browser;

	}
	public String url() throws IOException{
		FileInputStream fs = new FileInputStream("C:/Users/apoor/Desktop/TestNG/cucumber/src/main/java/properties/config.properties");
		Properties prop= new Properties();
		prop.load(fs);

		String url = prop.getProperty("url");
		return url;
	}
	public String area() throws IOException{
		FileInputStream fs = new FileInputStream("C:/Users/apoor/Desktop/TestNG/cucumber/src/main/java/properties/config.properties");
		Properties prop= new Properties();
		prop.load(fs);

		String area = prop.getProperty("area");
		return area;
	}

}
