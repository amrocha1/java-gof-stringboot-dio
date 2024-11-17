package desafio.projeto.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.persistence.Entity;

@EnableFeignClients
@SpringBootApplication
public class DesafioDeProjetoGoFApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDeProjetoGoFApplication.class, args);
	}

}
