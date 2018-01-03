package com.lianyu.king.generate;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * mybatis generator
 */
public class MapperGenerator {
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//File configFile = new File("generatorConfig.xml");llll
		InputStream configInputStream = MapperGenerator.class.getResourceAsStream("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		if (configInputStream == null)
			System.out.println("error");
		else {
			config = cp.parseConfiguration(configInputStream);

			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
			System.out.println("MyBatis Generator finshed");
			System.out.println("helloWorld");
		}
	}

}
