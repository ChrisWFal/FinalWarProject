import java.util.Scanner;
public class WarGreeting
	{
	static String name;
	static String play;
	public static void greet()
		{
		System.out.println("Hello there! Whats your name?");
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		
		System.out.println("Nice to meet you " + name + "! Do you want to play war?");
		Scanner userInput2 = new Scanner(System.in);
		play = userInput2.nextLine();
		switch(play)
			{
			case "Yes":
				{
				System.out.println("Alright lets play!");
				Deck.dealAndPlay();
				break;
				}
			case "yes":
				{
				System.out.println("Alright lets play!");
				Deck.dealAndPlay();
				break;
				}
			case "Sure":
				{
				System.out.println("Alright lets play!");
				Deck.dealAndPlay();
				break;
				}
			case "sure":
				{
				System.out.println("Alright lets play!");
				Deck.dealAndPlay();
				break;
				}
			case "No":
				{
				System.out.println("Why did you even bother running me then....");
				System.exit(0);
				break;
				}
			case "no":
				{
				System.out.println("Why did you even bother running me then....");
				System.exit(0);
				break;
				}
			case "Nah":
				{
				System.out.println("Why did you even bother running me then....");
				System.exit(0);
				break;
				}
			case "nah":
				{
				System.out.println("Why did you even bother running me then....");
				System.exit(0);
				break;
				}
			}
		}
	}
