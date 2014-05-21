package rockPaperScissors;

import java.util.ArrayList;

public class RockPaperScissors {

	public static ArrayList<String> winner(ArrayList<String> playerOne, ArrayList<String> playerTwo) throws NoSuchStrategyError {
		if(verifyPlay(playerOne.get(1)) || verifyPlay(playerTwo.get(1)))
			throw new NoSuchStrategyError("Strategy must be one of R,P,S");
		
		if(playerOne.get(1)==playerTwo.get(1))
			return playerOne;
		
		if (playerOne.get(1)=="S"){
			if (playerTwo.get(1)=="P")
				return playerOne;
			else return playerTwo;
		}
		else if (playerOne.get(1)=="P"){
			if (playerTwo.get(1)=="R")
				return playerOne;
			else return playerTwo;
		}
		else{
			if (playerTwo.get(1)=="S") 
				return playerOne;
			else return playerTwo;			
		}
	}

	public static boolean verifyPlay(String play) {
		if ((play != "S") && (play != "P") && (play != "R"))
			return true;
		return false;
	}

	public static ArrayList<String> tournament_winner(
			ArrayList<ArrayList<String>> tounament) throws NoSuchStrategyError {
		
		ArrayList<ArrayList<String>> ganhadoresRodada = new ArrayList<ArrayList<String>>();
		
		if(tounament.size()==2){
			return winner(tounament.get(0), tounament.get(1));
		}

		for(int length=0;length<tounament.size();length+=2){
			System.out.println(length);
			ganhadoresRodada.add(winner(tounament.get(length), tounament.get(length+1)));
			System.out.println(ganhadoresRodada.size());
		}
		
		return tournament_winner(ganhadoresRodada);
	}

}
