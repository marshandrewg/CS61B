import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListDequeTest {
  
  private final String firstString = "First";
  private final String lastString = "Last";

  @Test
  /* Utility method for printing out empty checks. */
  void addFirstTest() {
    LinkedListDeque<String> test = new LinkedListDeque<String>();
    test.addFirst("First");
    assertEquals(firstString, test.get(0));
    // expected, actual
  }

  @Test
  void addFirst2Test() {
    LinkedListDeque<String> test = new LinkedListDeque<String>();
    test.addFirst("First");
    test.addFirst("Second");
    assertEquals("Second", test.get(0));
    // expected, actual
  }

  @Test

  void addLastTest() {
    LinkedListDeque<String> test = new LinkedListDeque<String>();
    test.addLast("Last");
    assertEquals(lastString, test.get(0));
  }


  // Write tests for each method

  // Think about covering all edges of the conditional statements

  // @getBeforeBound

  // @getAfterBound

  // @getHead

} 