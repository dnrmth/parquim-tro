package com.parquimetro.veiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VeiculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculoApplication.class, args);
	}

}
