import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class LinkedListDequeTest {
	
	private final String firstString = "First";

	@Test
	/* Utility method for printing out empty checks. */
	void addFirstTest() {
		LinkedListDeque<String> test= new LinkedListDeque<String>();
		test.addFirst("First");
		assertEquals(firstString, test.get(0));
	}

	
} 