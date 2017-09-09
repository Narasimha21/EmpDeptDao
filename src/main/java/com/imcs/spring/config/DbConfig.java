package com.imcs.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.imcs")
@Configuration
public class DbConfig {

	@Bean
	DataSource getDataSource() {
		org.apache.commons.dbcp2.BasicDataSource dataSoruce = new BasicDataSource();
		dataSoruce.setDriverClassName("com.mysql.jdbc.Driver");
		dataSoruce.setUrl("jdbc:mysql://localhost:3306/imcs");
		dataSoruce.setUsername("root");
		dataSoruce.setPassword("root");

		return dataSoruce;
	}

}
