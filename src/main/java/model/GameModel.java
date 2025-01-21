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

  /**
   * Takes in 2 cards and tells us if they are a match.
   * @param card1 first card to be compared
   * @param card2 second card to be compared
   * @return true if the cards have the same color
   */
  boolean checkMatch(Card card1, Card card2);
}
