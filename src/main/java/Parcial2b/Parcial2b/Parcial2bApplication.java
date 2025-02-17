package Parcial2b.Parcial2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"Parcial2b.Parcial2b", "controller"})
public class Parcial2bApplication {

	public static void main(String[] args) {
		SpringApplication.run(Parcial2bApplication.class, args);
	}

}