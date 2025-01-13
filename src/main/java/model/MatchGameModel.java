package model;

public class MatchGameModel implements GameModel {
  private int movesLeft;
  private final int numOfCards;

  public MatchGameModel(int numOfCards) {
    if (numOfCards <= 1 || numOfCards > 7) {
      throw new IllegalArgumentException("numOfCards must be between 2 and 7");
    }
    // this is the number of unique cards
    this.numOfCards = numOfCards;
    setUp();
  }

  @Override
  public int getMovesLeft() {
    return movesLeft;
  }

  @Override
  public int getNumOfCards() {
    return numOfCards;
  }

  @Override
  public void setUp() {
    // movesLeft equals number of matches * 1.5 (rounds up for odd num of matches) (ex. 3 matches 5 moves)
    double temp = (double) numOfCards / 2;
    movesLeft = (int) (numOfCards  + Math.ceil(temp));
  }
}
