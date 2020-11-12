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

  // first edge case is what happens when I addLast when the Head is already empty.
  // I thought my if else statement would cover this... halp
  @Test
  void addLastTest() {
    LinkedListDeque<String> test = new LinkedListDeque<String>();
    test.addFirst("First");
    test.addLast("Last");
    assertEquals(lastString, test.get(1));
  }

  // which direction should the "isEmpty" method be communicating?
  // hung me up for a second
  // i.e. I read it as answering a Q isEmpty?
  // also I see an edge where we've added to the tail and it being wrong
  // Would a size = 0 solve this? but I'm getting a boolean error
  // @Test
  // void isEmptyTest() {
  //   LinkedListDeque<String> test = new LinkedListDeque<String>();
  //   test.addFirst("First");
  //   assertEquals(false, test.isEmpty());
  // }

  // How the heck you test print method? I'm guessing and checking w/ Stackexchange
  // buuuuut not learning anything from it so I need to back up
  // @Test
  // void printDequeTest() {
  //   LinkedListDeque<String> test = new LinkedListDeque<String>();
  //   test.addFirst("First");
  //   assertTrue(test.contains("First"));
  // }

  // @Test
  // void getRecursiveTest() {
  //   LinkedListDeque<String> test = new LinkedListDeque<String>();
  //   test.addFirst("First");
  //   // test.addLast("Last");
  //   assertEquals(firstString, test.getRecursive(0));
  // }
  // Write tests for each method

  // Think about covering all edges of the conditional statements

  // @getBeforeBound

  // @getAfterBound

  // @getHead

} 