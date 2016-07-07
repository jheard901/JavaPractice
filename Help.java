// Read a character from the keyboard
class Help
{
	public static void main(String args[])
	throws java.io.IOException
	{
		char choice, ignore;
		
		do
		{
			System.out.println("Favorite Game:");
			System.out.println("1. Dark Souls III");
			System.out.println("2. osu!");
			System.out.println("3. The Witcher III: Wild Hunt");
			System.out.println("4. Starcraft II");
			System.out.println("5. XCOM 2");
			System.out.println("\nChoose one: ");
			//get input
			choice = (char)System.in.read();
			do
			{
				//repeat getting input until user enters something instead of leaving it blank
				ignore = (char)System.in.read();
			} while (ignore != '\n');
		//repeat this loop if the input is not within the range of 1-5
		} while (choice < '1' || choice > '5');
		
		//add space (there should be an std::endl for java though like in C++, I think...)
		System.out.println("");
		
		switch(choice)
		{
			//dark souls
			case '1':
				System.out.println("Dark Souls III - Statistics");
				System.out.println("Hours Played: 300+");
				System.out.println("User Rating: 8.9 / 10");
				System.out.println("Comments: Great gameplay, but gets old once you've 'tried it all'");
				break;
			//osu
			case '2':
				System.out.println("osu! - Statistics");
				System.out.println("Hours Played: 70+");
				System.out.println("User Rating: 9.4 / 10");
				System.out.println("Comments: Always new content regularly released");
				break;
			//the witcher
			case '3':
				System.out.println("The Witcher III: Wild Hunt - Statistics");
				System.out.println("Hours Played: 120+");
				System.out.println("User Rating: 9.7 / 10");
				System.out.println("Comments: Outstanding story and plot writing; superb voice acting and compelling side quests");
				break;
			//starcraft 2
			case '4':
				System.out.println("Starcraft II - Statistics");
				System.out.println("Hours Played: 150+");
				System.out.println("User Rating: 8.7 / 10");
				System.out.println("Comments: Modding is the best part of this game, unless you're actually good at RTS games");
				break;
			//xcom 2
			case '5':
				System.out.println("XCOM 2 - Statistics");
				System.out.println("Hours Played: 60+");
				System.out.println("User Rating: 8.4 / 10");
				System.out.println("Comments: Gameplay gets old rather fast, but is extendable from the mod support");
				break;
			default:
				//this default should never occur since we force users to input
				//a number between 1 - 5 and ignore when users enter no input
				break;
		}
	}
}

































