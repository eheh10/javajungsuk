package ch11.v2;

import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.Properties;

class PropertiesEx3 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("timeout","30");
		prop.setProperty("language","한글");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		try {
			prop.store(new FileOutputStream(Paths.get("src","ch11","output.txt").toString()), "Properties Example");
			prop.storeToXML(new FileOutputStream(Paths.get("src","ch11","output.xml").toString()), "Properties Example");
		} catch (Exception e){
			e.printStackTrace();
		}

	}
}
