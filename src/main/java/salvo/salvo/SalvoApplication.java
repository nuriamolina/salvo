package salvo.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);

	}
	@Bean
	public CommandLineRunner initData(PlayerRepository repository) {
		return (args) -> {
			// save a couple of players
			repository.save(new Player("nuria", "nuria@ubiqum.com"));
			repository.save(new Player("ricard", "ricard@ubiqum.com"));
			repository.save(new Player("albert", "albert@ubiqum.com"));

		};
	}

}
