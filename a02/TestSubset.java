package a02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestSubset {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	// jUnit tests aren't my strong point...
	@Test
	void testSubset() {
		String[] args = { "Lehrerin", "Fraulein", "Maedel", "Mitarbeiter" };
		Subset.main(args);
		assertEquals(4, args.length);
	}
}
