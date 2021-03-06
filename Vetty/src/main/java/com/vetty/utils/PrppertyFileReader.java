package com.vetty.utils;

import java.io.File;
import java.io.FileReader;
import java.util.ConcurrentModificationException;
import java.util.Properties;

public class PrppertyFileReader extends VariableInitilize{
	
	VariableInitilize initilizeEnv = new VariableInitilize();

		public String getProperties(String key) throws ConcurrentModificationException {
			Properties prop = new Properties();
			String value = null;
			try {
				@SuppressWarnings("static-access")
				String path = System.getProperty("user.dir")+"/resources/envr/"+initilizeEnv.getEnv()+".properties";
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

