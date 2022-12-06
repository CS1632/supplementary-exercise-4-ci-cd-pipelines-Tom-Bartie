package edu.pitt.cs;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

import org.mockito.*;

public class RentACatTest {

	@Test
	public void testPapervsRock5() {
		PaperPlayer p1 = Mockito.mock(PaperPlayer.class);
		RockPlayer p2 = Mockito.mock(RockPlayer.class);
		ScoreBoard sb = Mockito.mock(ScoreBoard.class);
        RockPaperScissors rps = new RockPaperScissors(p1,p2,sb);
        Mockito.when(p1.throwHand()).thenReturn(Hand.PAPER);
        Mockito.when(p2.throwHand()).thenReturn(Hand.ROCK);
        rps.play(5);
	}
}