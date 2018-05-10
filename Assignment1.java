import java.util.Random;
public class Assignment1 {
	
	public static void main(String args[]) {
		
		testEachInteger();
		
		System.out.println();
		
		playOneThousandGames();
		
		System.out.println();
		
		playOneThousandGames();		
	}	
		
	public static int playGame(int chosenNumber) {
		int middle; 
		int upper = 100 , lower = 1, count = 0; 
		while (lower < upper) {
		middle = (upper + lower) / 2;
		count++;
		if (middle < chosenNumber)  
			lower = middle + 1;
		 else 
			upper = middle;
		}
		return count;
	}


	public static void testEachInteger() {
		int countSix = 0, countSeven = 0;
		int questions;
		for (int x = 1; x <= 100; x++) {
		questions = playGame(x);
		if (questions == 6) {
			  countSix++;
		}
		else if (questions == 7) {
			 countSeven++;
		}
		
		System.out.println("For the chosen integer " + x +", the number of questions asked is " + questions);
		
		}
		
	double avg = ((countSeven*7) + (countSix*6)) / 100.0;
		
	System.out.println("The total number of chosen integers where only six questions is asked: " + countSix);
	System.out.println("The total number of chosen integers where only seven questions is asked: " + countSeven);
	System.out.println("The average number of questions asked: " + avg);
	
	}
	
	
	public static void playOneThousandGames() {
		int countSix = 0, countSeven = 0;
		 for (int x = 1; x <= 1000; x++) {	
		//Random rand = new Random(); 
		 int countNumbers = playGame((int) (Math.random()*100)); //1 + rand.nextInt(101); //# 1-100
		 playGame(countNumbers);
		 if (countNumbers == 6) {
			 countSix ++;
		  }
		  else if (countNumbers == 7) {
			 countSeven ++;
		  }
		 }
		
		 double avg2 = ((countSix * 6) + (countSeven * 7)) / 1000.0;
		System.out.println("The total number of games where only six questions is asked: " + countSix);
		System.out.println("The total number of games where only seven questions is asked: " + countSeven);
		System.out.println("The average number of questions asked: " + avg2);
		
	}





}