package com.damoa.toyProject.common;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.damoa.toyProject.menu.model.dao.PostMapper;
import com.damoa.toyProject.user.model.dao.UserMapper;

public class Template {
	private static String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:log4jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "DAMOA";
	private static String PASSWORD = "DAMOA";
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession() {
		
		if(sqlSessionFactory == null) {
			Environment environment =
					new Environment("dev"
									, new JdbcTransactionFactory()
									, new PooledDataSource(DRIVER, URL, USER, PASSWORD));
			
			Configuration configuration = new Configuration(environment);
			/* 인터페이스의 하위객체를 등록해줘야 한다. 
			 * MenuMapper.class = DAO이자 Mapper인 녀석을 Mapper로 configuration에다가 등록해준다.*/
			configuration.addMapper(PostMapper.class);
		
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
			sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
		} 
		return sqlSessionFactory.openSession(false);
	}
}