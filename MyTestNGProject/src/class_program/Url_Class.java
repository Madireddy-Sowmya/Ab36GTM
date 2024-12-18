package class_program;

import java.net.MalformedURLException;
import java.net.URL;

public class Url_Class {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL u1 = new URL("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.3");
		System.out.println(u1.getHost());
		System.out.println(u1.getPath());
		System.out.println(u1.getPort());
		System.out.println(u1.getProtocol());

	}

}
