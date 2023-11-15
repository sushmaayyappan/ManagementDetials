package com.libraryDetials.library.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfiguration {

    private String databaseurl;
    private String databaseusername;
    private String databasepassword;

    @Bean
    public DataSource mySqlDataSource() {
        DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://127.0.0.1:3306/library");
        dataSourceBuilder.username("sushma");
        dataSourceBuilder.password("Vidharth@01");
        return dataSourceBuilder.build();
    }
}
