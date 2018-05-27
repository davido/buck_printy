package org.gerritcon.mv2016;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class PrintyTest {
  //  @Before
  //public void setUp() {
  //assumeTrue(false);
  //}

  @Test
  public void test_passed() {
    assertEquals("foo", "foo");
  }

  @Test
  public void test_failed() {
    assertEquals("foo", "bar");
  }

  @Test
  public void test_assumption_violation() {
    assumeTrue(false);
  }
}
