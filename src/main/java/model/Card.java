package model;

public interface Card {

  /**
   * Gets the color of the card.
   * @return the color of the card
   */
  CardColor getColor();

  /**
   * Checks if the card has been flipped.
   * @return true if the card is flipped, false otherwise
   */
  boolean isFlipped();
}
