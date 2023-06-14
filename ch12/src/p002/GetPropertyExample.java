package p002;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		System.out.println("---------------");
		System.out.println("key: value");
		System.out.println("---------------");
		Properties props=System.getProperties();
		Enumeration<Object> en=props.keys();
		while(en.hasMoreElements()) {
			String key=(String)en.nextElement();
			String value=System.getProperty(key);
			System.out.printf("%-40s: %s\n",key,value);
		
//		Set<Object> keys=props.keySet();
//		for(Object obj:keys) {
//			String key=(String)obj;
//			String value=System.getProperty(key);
//			System.out.printf("%-40s: %s\n",key,value);
		}

	}

}
