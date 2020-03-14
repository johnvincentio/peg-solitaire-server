package io.johnvincent.server.solitaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolitaireApplication {

	public static void main(String[] args) {
		FromJSONToPOJO.test1();
		FromJSONToPOJO.test2();
		SpringApplication.run(SolitaireApplication.class, args);
	}

}
