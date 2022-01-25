package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class Baseconfig {

	public static String  getValue(String value) throws Exception {

		String path = "./config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		return pro.get(value).toString();

		/*pro.get(value);		
		Object data = pro.get(value);
		getValue(value);*/	

	}

}
