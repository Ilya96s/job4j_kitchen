package ru.job4j.kitchen.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * LiquibaseConfig - конфигурационный класс для настройки Liquibase
 *
 * @author Ilya Kaltygin
 */
@Configuration
public class LiquibaseConfig {

    /**
     * Создает и конфигурирует SpringLiquibase
     *
     * @param ds объект типа DataSource(источник данных)
     * @return объект типа SpringLiquibase
     */
    @Bean
    public SpringLiquibase liquibase(DataSource ds) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/dbchangelog.xml");
        liquibase.setDataSource(ds);
        return liquibase;
    }
}
