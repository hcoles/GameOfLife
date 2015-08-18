package com.ncrcoe.gameoflifekata;

// pulls in some custom assertions that may help debugging when your tests fail
import static com.ncrcoe.gameoflifekata.GridAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

  GameOfLife testee;

  @Before
  public void SetUp() {
    testee = new GameOfLife();
  }

  @Test
  public void shouldReturnAValidGrid() {
    boolean[][] actual = testee.advance(empty8By4Grid());
    assertThat(actual).isNotNull();
  }
  
  @Test
  public void shouldProduceEmptyGridWhenGivenEmptyGrid() {
    boolean[][] actual = testee.advance(empty8By4Grid());
    assertThat(actual).isEqualTo(empty8By4Grid());
  }
  
  private boolean[][] empty8By4Grid() {
    return new boolean[4][8];
  }
  
}
