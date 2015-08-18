package com.ncrcoe.gameoflifekata;

import java.io.IOException;
import java.util.Random;

import jline.console.ConsoleReader;

import org.junit.Ignore;
import org.junit.Test;

@Ignore("I am not a test. When you are done remove this annotation and run mvn test from the command line. I will not work when run from an IDE")
public class WhenYouAreDoneTest {

  Random rand = new Random();

  @Test
  public void theGameOfLife() throws Exception {
    watch(450);
  }

  private void watch(int generations) throws Exception {
    GameOfLife gof = new GameOfLife();
    ConsoleReader r = new ConsoleReader();
    boolean[][] gen = randomGrid();
    r.clearScreen();
    for (int i = 0; i != generations; i++) {
      gen = gof.advance(gen);
      display(gen, r);
      r.println("Gen " + i);
      r.flush();
      Thread.sleep(100);
      r.clearScreen();
    }

  }

  private boolean[][] randomGrid() {
    boolean[][] grid = new boolean[80][80];
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid.length; col++) {
        grid[row][col] = randomBoolean();
      }
    }
    return grid;
  }

  private boolean randomBoolean() {
    return rand.nextInt(10) > 7;
  }

  private void display(boolean[][] grid, ConsoleReader r) throws IOException {
    for (int row = 0; row != grid.length; row++) {
      for (int col = 0; col != grid[0].length; col++) {
        if (grid[row][col]) {
          r.print("*");
        } else {
          r.print(".");
        }
      }
      r.println();
    }
  }

}

