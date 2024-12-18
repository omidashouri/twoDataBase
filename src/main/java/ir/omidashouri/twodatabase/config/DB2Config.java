package ir.omidashouri.twodatabase.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@ConditionalOnProperty(value = "spring.datasource2.jdbc-url")
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryOracle",
basePackages = {"ir.omidashouri.twodatabase.repository.oracle"})
public class DB2Config {

    @Value("${spring.datasource.ddl-auto}")
    private String ddlAuto;

    @Bean(name = "datasource2")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "entityManagerFactoryOracle")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryOracle(
            EntityManagerFactoryBuilder builder, @Qualifier("datasource2") DataSource dataSource) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", ddlAuto);
        properties.put("show_sql", true);
//        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        return builder.dataSource(dataSource).packages("ir.omidashouri.twodatabase.entity.oracle")
                .persistenceUnit("ds1").properties(properties).build();
    }

    @Bean(name = "transactionManagerOracle")
    public PlatformTransactionManager transactionManagerOracle(
            @Qualifier("entityManagerFactoryOracle") EntityManagerFactory entityManagerFactoryOracle) {
        return new JpaTransactionManager(entityManagerFactoryOracle);
    }

    @Bean
    public EntityManagerFactoryBuilder entityManagerFactoryBuilder() {
        return new EntityManagerFactoryBuilder(new HibernateJpaVendorAdapter(), new HashMap<>(), null);
    }
}
