import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileutils {

	public String readdatafromprofile(String Key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Propert.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;
	}
}
