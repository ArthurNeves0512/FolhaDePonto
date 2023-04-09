package br.com.folhaponto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FolhaDePontoApplication {
	public static void main(String[] args) {
		SpringApplication.run(FolhaDePontoApplication.class, args);
	}

}
