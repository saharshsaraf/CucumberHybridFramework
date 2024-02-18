package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	public static Properties initializeproperties() {

		Properties prop = new Properties();
		File proFile = new File(System.getProperty("user.dir"+"\\src\\test\\resource\\Config\\config.properties"));

		try {
			FileInputStream	fis = new FileInputStream(proFile);
			prop.load(fis);
		} catch (Throwable e) {

			e.printStackTrace();
		}
return prop;
	}

}
