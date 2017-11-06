package T71kuangjia2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {

	public static void main(String[] args) throws IOException {
//		//方法1
//		Properties p = new Properties();
//		p.load(new FileInputStream("config/local.properties"));
//		//读取URL
//		String name = p.getProperty("name");
//		String all = p.toString();
//		System.out.println(all);
		
		//方法2
		InputStream in = readProperties.class.getClassLoader().getResourceAsStream("local.properties");
		Properties p = new Properties();
		p.load(in);
		
		//读取URL
		String url = p.getProperty("url");
		
		System.out.println(url);
		System.out.println(p.toString());

	}

}
