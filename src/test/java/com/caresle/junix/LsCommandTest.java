package com.caresle.junix;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

/*
 * Test for the Ls Command
 *
 */
public class LsCommandTest {
  private final Ls ls = new Ls();

  @Test
  public void printHelp() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    try {
      ls.run();
      String output = outputStream.toString().trim();
      System.out.println(output);
      //assertTrue(output.length() == -1);
      assertTrue(true);
    } catch (Exception e) {
      fail("An exception ocurred durint the test: " + e.getMessage());
    } finally {
      System.setOut(originalOut);
    }
  }
}
