public class TennisGame {
	int player1score;
	int player2score;
	int player1game;
	int player2game;
	final int MAXGAME = 4;
	int counter;
	
	int player1point;
	int player2point;

	public TennisGame() {
		 player1score = 0;
		 player2score = 0;
		 
	}

	
	public void player1Scored() {
		player1score++;
		
		
	}

	public void player2Scored() {
		player2score++;
		
	}

	public String getScore() {
		do {

		if(player1score == 0 && player2score == 0) {
			return "0 - 0";
		}
		else if(player1score==1 && player2score == 0 ) {
			return "15 - 0";
		}
		else if(player1score==0 && player2score == 1) {
			return "15 - 0";
		}
		else if(player1score==1 && player2score == 0 ) {
			return "15 - 0";
		}
		else if(player1score==2 && player2score == 1 ) {
			return "30 - 15";
		}
		else if(player1score==1 && player2score == 2) {
			return "15 - 30";
		}
		
		else if(player1score==2 && player2score == 2 ) {
			return "30 - 30";
		}
		else if(player1score==3 && player2score == 2 ) {
			player1game++;
			counter++;
			return "advantage player1";
		}
		else if(player1score==2 && player2score == 3 ) {
			player1game++;
			counter++;
			return "deuce";
		}
		else if(player1score==3 && player2score == 3 ) {
			return "deuce";
		}
		else if(player1score== 4 && player2score == 3) {
			player1game++;
			counter++;
			return "advantage player1";
		}
		else if(player1score== 3 && player2score == 4) {
			player2game++;
			counter++;
			return "advantage player2";
		}
		
		}while(player1game == 4 || player2game == 4);
	
		
		
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		return "";
	}
	public static void main(String[] args) {
		TennisGame game = new TennisGame();
		//game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
	
		System.out.println(game.getScore());
		
	}
}
