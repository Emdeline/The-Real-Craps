package craps;
import java.util.Scanner;

public class crapsgamefromhome
	{
		
		
		static int totalDice;
		static String userInput; 
		public static void main(String[] args)
		
		
			{
				greetPlayer();	
				betMoney();
				firstRoll();
				results();
								
				System.out.println("Why do I keep rolling a zero even though its not actually in my code to do. PS I am at home on my macbook doing my homework so I am going to push this to Gitub to get my homework doen! YEE YEE lets go!");
// from home
				
				boolean continueRolling = true;
				while(continueRolling)
					{
						Scanner userInput = new Scanner(System.in);
						System.out.println("Press enter to roll.");
						String fake = userInput.nextLine();
						
						int thirdRoll = (int) (Math.random() * 6 + 1);
						int fourthRoll = (int) (Math.random() * 6 + 1);
						
						int secondDice = thirdRoll + fourthRoll;
						
						System.out.println("Great! You rolled a " + thirdRoll + " also a " + fourthRoll + ". Your grand total is " + secondDice);
						if (secondDice == totalDice)
							{
								System.out.println("YAY! You rolled a " + secondDice + " you win.");
								continueRolling = false;
								
								
							}
						else if (secondDice == 7)
							{
								System.out.println("Hehehe, you rolled a 7, you lose!");
								continueRolling = false;
							}
					}
			}
	
		public static void greetPlayer()
			{
				Scanner userInput = new Scanner(System.in);
				
				
				System.out.println("Howby! Wanna play a game of Craps?");
				System.out.println("First enter your name.");
				String name = userInput.nextLine();
				System.out.println("Nice, now lets get started " + name);
				System.out.println("If you do enter yes, if you do not enter no.");	
				String answer = userInput.nextLine();
				
				
				if (answer.equals ("yes"))
					{
						System.out.println("Alrighty then, lets get this party started!");
					}
				else if (answer.equals ("no"))
							{
								System.out.println("Okay, have a great rest of your day.");
								System.exit(0);
							}

			}
		
		public static void betMoney()
			{
				Scanner betMoney = new Scanner(System.in);
				System.out.println("Lets make things interesting. Wanna bet some money? Just enter the amount that you want to bet below.");
				int number = betMoney.nextInt();
				System.out.println("Nice, THINGS JUST GOT INTERESTING!");
			
			}
		
		public static void firstRoll()
			{
				System.out.println("Time to take your first roll");
				
				int firstRoll = (int) (Math.random() * 6 + 1);
				int secondRoll = (int) (Math.random() * 6 + 1);
				totalDice = firstRoll + secondRoll;
				
				//craps from home lets go
			}
		
		public static void results()
			{
				if (totalDice == 7 || totalDice == 11)
					{
						System.out.println("You won, " + totalDice + " yay...");	
						System.exit(0);
					}
				
				else if (totalDice == 2 || totalDice == 12)
					{
						System.out.println("HA, you lost!" + totalDice + " Oh, sorry.");
						System.exit(0);
					}
				
				else
					{
						System.out.println("You rolled a " + totalDice + ", soooooo lets keep playing ;)");	
					}
				
			}
			
		
	}
