package com.demo.utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PrppertyFileReader extends VariableInitilize{
	
	VariableInitilize initilizeEnv = new VariableInitilize();

		public String getProperties(String key) {
			Properties prop = new Properties();
			String value = null;
			try {
				String path = System.getProperty("user.dir")+"/src/main/resources/envr/"+initilizeEnv.getEnv()+".properties";
				System.out.println(path);			
				File f = new File(path);
				FileReader reader=new FileReader(f);		    
				prop.load(reader);
				System.out.println(prop.getProperty(key));
				value = prop.getProperty(key);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return value;
		}
}

