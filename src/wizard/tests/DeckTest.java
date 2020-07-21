package wizard.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import wizard.game.Deck;

class DeckTest {

	@Test
	void testtakeRandom() {
		Deck d = new Deck();
		for (int i = 0; i < 60; i++) {
			assertNotNull(d.takeRandom());
		}
		
		assertNull(d.takeRandom());
	}

}
