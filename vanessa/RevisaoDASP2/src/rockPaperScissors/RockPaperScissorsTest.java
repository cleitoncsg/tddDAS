package rockPaperScissors;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsTest {
	ArrayList<String> playerOne;
	ArrayList<String> playerTwo;
	ArrayList<ArrayList<String>> tounament;
	
	@Before
	public void setUp(){
		playerOne = new ArrayList<String>();
		playerTwo = new ArrayList<String>();
		tounament = new ArrayList<ArrayList<String>>();
		
		playerOne.add("John");
		playerTwo.add("Dave");
	}
	
	@Test(expected=NoSuchStrategyError.class)
	public void testThrowsException() throws NoSuchStrategyError {
		playerOne.add("Rock");
		playerTwo.add("P");
		RockPaperScissors.winner(playerOne, playerTwo);
	}
	
	@Test
	public void WinnerTest() throws NoSuchStrategyError {
		playerOne.add("S");
		playerTwo.add("R");
		
		assertEquals(playerTwo, RockPaperScissors.winner(playerOne,playerTwo));
	}
	
	@Test
	public void testDrawGame() throws NoSuchStrategyError {
		playerOne.add("S");
		playerTwo.add("S");
		assertEquals(playerOne, RockPaperScissors.winner(playerOne, playerTwo));
	}
	
	@Test
	public void testTournament() throws NoSuchStrategyError{
		createTounament();
		ArrayList<String> player = new ArrayList<String>();
		player.add("Richard");
		player.add("R");
		
		assertEquals(player,RockPaperScissors.tournament_winner(tounament));
	}
	
	public void createTounament(){
		ArrayList<String> player1 = new ArrayList<String>();
		player1.add("Armando");
		player1.add("P");
		
		ArrayList<String> player2 = new ArrayList<String>();
		player2.add("Dave");
		player2.add("S");
		
		ArrayList<String> player3 = new ArrayList<String>();
		player3.add("Richard");
		player3.add("R");
		
		ArrayList<String> player4 = new ArrayList<String>();
		player4.add("Michael");
		player4.add("S");
		
		ArrayList<String> player5 = new ArrayList<String>();
		player5.add("Allen");
		player5.add("S");
		
		ArrayList<String> player6 = new ArrayList<String>();
		player6.add("Omer");
		player6.add("P");
		
		ArrayList<String> player7 = new ArrayList<String>();
		player7.add("David E.");
		player7.add("R");
		
		ArrayList<String> player8 = new ArrayList<String>();
		player8.add("Richard X.");
		player8.add("P");
		
		tounament.add(player1);
		tounament.add(player2);
		tounament.add(player3);
		tounament.add(player4);
		tounament.add(player5);
		tounament.add(player6);
		tounament.add(player7);
		tounament.add(player8);
	}
}
