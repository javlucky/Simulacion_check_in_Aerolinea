package org.example.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://mdb-test.c6vunyturrl6.us-west-1.rds.amazonaws.com:3306/airline");
        config.setUsername("bsale_test");
        config.setPassword("bsale_test");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // Configuración adicional del pool de conexiones
        config.setMinimumIdle(5);
        config.setMaximumPoolSize(20);
        config.setConnectionTimeout(3000);
        config.setIdleTimeout(60000);

        return new HikariDataSource(config);
    }
}
