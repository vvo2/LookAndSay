package edu.cnm.deepdive.lookandsay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * for the "look-and-say" problem in the final exam
 *
 */
public class JUnit4Test {

  @Test
  public void checkThisOut() throws Exception {
    assertEquals("one", "1");
    assertEquals("two", "11");
    assertEquals("three", "111");
    assertEquals("one", "2");
    assertEquals("two", "22");
    assertEquals("three", "222");
    assertEquals("one", "3");
    assertEquals("two", "33");
    assertEquals("three", "333");
  }
}