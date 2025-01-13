package model;

public class MatchCard implements Card{
  private CardColor color;
  private boolean isFlipped;

  public MatchCard(CardColor color) {
    this.color = color;
    isFlipped = false;
  }

  /**
   * Gets the color of the card.
   *
   * @return the color of the card
   */
  @Override
  public CardColor getColor() {
    return color;
  }

  /**
   * Checks if the card has been flipped.
   *
   * @return true if the card is flipped, false otherwise
   */
  @Override
  public boolean isFlipped() {
    return this.isFlipped;
  }
}
