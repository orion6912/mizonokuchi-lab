package com.example.demo.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class TestDbConfig {
	private BasicDataSource dataSource;

	@Bean
	public DataSource dataSource() {
		String username = "test";
		String password = "test";
		String url = "jdbc:postgresql://35.194.219.12:5432/test";

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		this.dataSource = basicDataSource;
		return basicDataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		// TransactionManager
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
		// TransactionInterceptor
		Properties properties = new Properties();
		properties.setProperty("*", "PROPAGATION_REQUIRED");
		return transactionManager;
	}
}