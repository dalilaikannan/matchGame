package model;

public interface GameModel {
  /**
   * Creates all the cards given a number, 2 of each. Adds them all to
   * the grid. Defines the number of moves left
   */
  void setUp();

  /**
   * Gets the number of moves left.
   * @return the number of moves left in the game.
   */
  int getMovesLeft();

  /**
   * Gets the number of cards on the board.
   * @return the number of cards (unique cards, not total)
   */
  int getNumOfCards();
}
