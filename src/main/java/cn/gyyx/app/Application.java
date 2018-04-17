package cn.gyyx.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HttpPutFormContentFilter;

import javax.servlet.Filter;

@SpringBootApplication
@MapperScan("cn.gyyx.app.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
    public Filter initializeHttpPutHandler() {
        return new HttpPutFormContentFilter();
    }
}
