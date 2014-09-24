import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deck
	{
	 static boolean keepPlaying = true;
	 static String playerOneCurrent;
	 static String playerTwoCurrent;
	 static int playerOneCard;
	 static int playerTwoCard;
	 static int counterOne = 0;
	 static int counterTwo = 0;
	 static String stop;
	 static ArrayList <Cards> deck = new ArrayList <Cards>();
	 //static ArrayList <Cards> playerOneHand = new ArrayList<Cards>();
	 //static ArrayList <Cards> playerTwoHand = new ArrayList<Cards>();
	public static void addCards()
		{
		deck.add(new Cards("Ace of clubs", 1));
		deck.add(new Cards("Ace of diamonds", 1));
		deck.add(new Cards("Ace of hearts", 1));
		deck.add(new Cards("Ace of spades", 1));
		deck.add(new Cards("Two of clubs", 2));
		deck.add(new Cards("Two of diamonds", 2));
		deck.add(new Cards("Two of hearts", 2));
		deck.add(new Cards("Two of spades", 2));
		deck.add(new Cards("Three of clubs", 3));
		deck.add(new Cards("Three of diamonds", 3));
		deck.add(new Cards("Three of hearts", 3));
		deck.add(new Cards("Three of spades", 3));
		deck.add(new Cards("Four of clubs", 4));
		deck.add(new Cards("Four of diamonds", 4));
		deck.add(new Cards("Four of hearts ", 4));
		deck.add(new Cards("Four of spades", 4));
		deck.add(new Cards("Five of clubs", 5));
		deck.add(new Cards("Five of diamonds", 5));
		deck.add(new Cards("Five of hearts", 5));
		deck.add(new Cards("Five of spades", 5));
		deck.add(new Cards("Six of clubs", 6));
		deck.add(new Cards("Six of diamonds", 6));
		deck.add(new Cards("Six of hearts", 6));
		deck.add(new Cards("Six of spades", 6));
		deck.add(new Cards("Seven of clubs", 7));
		deck.add(new Cards("Seven of diamonds", 7));
		deck.add(new Cards("Seven of hearts", 7));
		deck.add(new Cards("Seven of spades", 7));
		deck.add(new Cards("Eight of clubs", 8));
		deck.add(new Cards("Eight of diamonds", 8));
		deck.add(new Cards("Eight of hearts", 8));
		deck.add(new Cards("Eight of spades", 8));
		deck.add(new Cards("Nine of clubs", 9));
		deck.add(new Cards("Nine of diamonds", 9));
		deck.add(new Cards("Nine of hearts", 9));
		deck.add(new Cards("Nine of spades", 9));
		deck.add(new Cards("Ten of clubs", 10));
		deck.add(new Cards("Ten of diamonds", 10));
		deck.add(new Cards("Ten of hearts", 10));
		deck.add(new Cards("Ten of spades", 10));
		deck.add(new Cards("Jack of clubs", 11));
		deck.add(new Cards("Jack of diamonds", 11));
		deck.add(new Cards("Jack of hearts", 11));
		deck.add(new Cards("Jack of spades", 11));
		deck.add(new Cards("Queen of clubs", 12));
		deck.add(new Cards("Queen of diamonds", 12));
		deck.add(new Cards("Queen of hearts", 12));
		deck.add(new Cards("Queen of spades", 12));
		deck.add(new Cards("King of clubs", 13));
		deck.add(new Cards("King of diamonds", 13));
		deck.add(new Cards("King of hearts", 13));
		deck.add(new Cards("King of spades", 13));
		
		}
	public static void dealAndPlay()
		{
		Collections.shuffle(deck);
		while(keepPlaying = true)
			{
			playerOneCard = deck.get(0).getCardValue();
			playerOneCurrent = deck.get(0).getCardName();
			deck.remove(0);
			
			System.out.println("You drew a... ");
			Timer.timer();
			System.out.println(playerOneCurrent);
			System.out.println("");
			
			playerTwoCard = deck.get(0).getCardValue();
			playerTwoCurrent = deck.get(0).getCardName();
			deck.remove(0);
			
			Timer.timer();
			System.out.println("And your opponent drew a... ");
			Timer.timer();
			System.out.println(playerTwoCurrent);
			Timer.timer();
			System.out.println("");
			
			if(playerOneCard > playerTwoCard)
				{
				System.out.println("You won this hand!");
				counterOne ++;
				}
			if(playerTwoCard > playerOneCard)
				{
				System.out.println("You lost this hand!");
				counterTwo ++;
				}
			System.out.println("Do you want to keep playing? yes or no");
			Scanner userInput = new Scanner(System.in);
			stop = userInput.nextLine();
			switch(stop)
				{
				case "No":
					{
					if(counterOne > counterTwo)
						{
						System.out.println("The final score was " + counterOne + " to " + counterTwo + " you win! See ya next time!");
						}
					if(counterOne<counterTwo)
						{
						System.out.println("The final score was " + counterOne + " to " + counterTwo + " you lose! See ya next time!");
						}
					keepPlaying = false;
					System.exit(0);
					break;
					}
				case "no":
					{
					if(counterOne > counterTwo)
						{
						System.out.println("The final score was " + counterOne + " to " + counterTwo + " you win! See ya next time!");
						}
					if(counterOne<counterTwo)
						{
						System.out.println("The final score was " + counterOne + " to " + counterTwo + " you lose! See ya next time!");
						}
					keepPlaying = false;
					System.exit(0);
					break;
					}
				case "Yes":
					{
					System.out.println("Ok lets keep playing.");
					break;
					}
				case "yes":
					{
					System.out.println("Ok lets keep playing.");
					break;
					}
				}
			}
		}
	}
