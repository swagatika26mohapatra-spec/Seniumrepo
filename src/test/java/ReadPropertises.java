import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertises {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Properties prop = new Properties(); // obj creation of the properties file

		FileInputStream io = new FileInputStream(
				"/Users/swagatikamohapatra/eclipse-workspace/Selenium/src/test/java/ReadPropertises.java");

		// load the prop file

		prop.load(io);

		System.out.println(prop.getProperty("browser"));

	}

}
