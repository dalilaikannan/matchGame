package model;

import java.util.ArrayList;
import java.util.Collections;

public class MatchGameModel implements GameModel {
  private int movesLeft;
  private final int numOfCards;
  private ArrayList<Card> cards;
  private Grid gameBoard;

  public MatchGameModel(int numOfCards) {
    if (numOfCards <= 1 || numOfCards > 7) {
      throw new IllegalArgumentException("numOfCards must be between 2 and 7");
    }
    // this is the number of unique cards
    this.numOfCards = numOfCards;
    cards = new ArrayList<>();
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

  public ArrayList<Card> getCards() {
    return cards;
  }

  @Override
  public void setUp() {
    // movesLeft equals number of matches * 1.5 (rounds up for odd num of matches) (ex. 3 matches 5 moves)
    double temp = (double) numOfCards / 2;
    movesLeft = (int) (numOfCards  + Math.ceil(temp));
    gameBoard = new MatchGrid(numOfCards);

    // sets up the cards, assigns a color and shuffles them so they end up in
    // randomized positions when playing
    for (int i = 0; i< numOfCards; i++) {
      if (i == 0) {
        cards.add(new MatchCard(CardColor.Red));
        cards.add(new MatchCard(CardColor.Red));
      } else if (i == 1) {
        cards.add(new MatchCard(CardColor.Orange));
        cards.add(new MatchCard(CardColor.Orange));
      } else if (i == 2) {
        cards.add(new MatchCard(CardColor.Yellow));
        cards.add(new MatchCard(CardColor.Yellow));
      } else if (i == 3) {
        cards.add(new MatchCard(CardColor.Green));
        cards.add(new MatchCard(CardColor.Green));
      } else if (i == 4) {
        cards.add(new MatchCard(CardColor.Blue));
        cards.add(new MatchCard(CardColor.Blue));
      } else if (i == 5) {
        cards.add(new MatchCard(CardColor.Purple));
        cards.add(new MatchCard(CardColor.Purple));
      } else {
        cards.add(new MatchCard(CardColor.Pink));
        cards.add(new MatchCard(CardColor.Pink));
      }
    }
     Collections.shuffle(cards);
  }

  @Override
  public boolean checkMatch(Card card1, Card card2) {
    if (card1 == null || card2 == null) {
      throw new IllegalArgumentException("card1 and/or card2 are null");
    }
    return card1.getColor() == card2.getColor();
  }

  public void playTurn(Card card1, Card card2) {
    if (checkMatch(card1, card2)) {
      card1.isFlipped();
    }
  }
}
