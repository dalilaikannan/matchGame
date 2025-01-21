package model;

public interface Grid {

  /**
   * Returns the color of a card at a certain location.
   * @param row of the card to be retrieved
   * @param col of the card to be retrieved
   * @return color of the card at the given row and col
   */
  public CardColor getCardColor(int row, int col);
}
