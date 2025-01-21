package model;

import java.io.Serializable;

public class MatchGrid implements Grid {
  Card[][] gameBoard;

  public MatchGrid(int numOfCards) {
    // figure out how the layout should work
    this.gameBoard = new Card[numOfCards][numOfCards];
  }

  public CardColor getCardColor(int row, int col) {
    return gameBoard[row][col].getColor();
  }
}                                                                                                                                                                              