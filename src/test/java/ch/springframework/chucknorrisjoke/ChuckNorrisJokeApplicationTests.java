package ch.springframework.chucknorrisjoke;

import ch.springframework.chucknorrisjoke.controllers.DisplayMessageController;
import ch.springframework.chucknorrisjoke.services.DisplayService;
import ch.springframework.chucknorrisjoke.services.QuoteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChuckNorrisJokeApplicationTests {

	private DisplayMessageController displayMessageController;

	@BeforeEach
	void init() {
		displayMessageController = new DisplayMessageController(new QuoteService());
	}

	@Test
	void contextLoads() {

	}

}
