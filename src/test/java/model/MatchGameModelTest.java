package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchGameModelTest {
  private GameModel matchGameModel;

  @BeforeEach
  public void setUp() {
    matchGameModel = new MatchGameModel(3);
  }

  @Test
  public void testCheckMatch() {
    Card card1 = new MatchCard(CardColor.Pink);
    Card card2 = new MatchCard(CardColor.Purple);
    Card card3 = new MatchCard(CardColor.Pink);
    Card card4 = null;

    assertFalse(matchGameModel.checkMatch(card1, card2));
    assertTrue(matchGameModel.checkMatch(card1, card3));
    assertThrows(IllegalArgumentException.class, () -> matchGameModel.checkMatch(card1, null));
  }
}