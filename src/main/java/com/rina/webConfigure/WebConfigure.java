package com.rina.webConfigure;


import javax.sql.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan("com.rina.repositorys")
public class WebConfigure {
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5434/dbStock");
		ds.setUsername("postgres");
		ds.setPassword("rina");
		return ds;
	}
		
	@Bean
    public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(getDataSource());
	}
	
	@Bean
    public SqlSessionFactoryBean sqlFactorySession(){
		SqlSessionFactoryBean sqlSession=new SqlSessionFactoryBean();
		sqlSession.setDataSource(getDataSource());
		return sqlSession;
		
	}
}
