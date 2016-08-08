// Read a character from the keyboard
class FunWithLoops
{
	public static void main(String args[])
	throws java.io.IOException {
		int x, y;
		//experimenting with java's for loop conditional possibilities
		for(x = 100, y = 0; x > 0; x -= 5, y++)
		{
			System.out.println("On Iteration " + y + " the value of x is " + x + "\n");
		}
		
		//experimenting with sleep and reading user input
		//info on sleep = http://stackoverflow.com/questions/3342651/how-can-i-delay-a-java-program-for-a-few-seconds
		System.out.println("\n\nUser Input Loop Example");
		try
		{
			Thread.sleep(500);  //1000 milliseconds = 1 second
		}
		catch (InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		int z;
		System.out.println("Input a char and press enter.");
		//this loop takes in input on each iteration
		for(z = 0; (char) System.in.read() != 'd'; z++)
		{
			System.out.println("Enter 'd' to exit loop. Iteration " + z);
		}
		System.out.println("Loop successfully exited!");
		
		//experimenting with not defining all parts of a for loop
		System.out.println("\n\nEmpty Loop Example");
		int cool = -200; //initializer not in loop defintion
		for(;cool <= 40;)
		{
			System.out.println("Coolness = " + cool);
			cool += 40; //iteration expression not in loop defintion
		}
		System.out.println("Now I'm a little cool! :D");
		
		//loops with no body
		System.out.println("\n\nNo Body Loop Example");
		int total = 0;
		for(int log = 0;log < 5; total += log++)
		{
			//total = sum of log each pass, this happens in the loop definition!
			System.out.println("Pass #" + log + " Total = " + total);
		}
		
		//while loop
		System.out.println("\n\nWhile Loop Example");
		char alphabet = 'a';
		while(alphabet <= 'z')
		{
			System.out.println("Current Alphabet: " + alphabet);
			alphabet++;
		}
		
		//do while loop
		System.out.println("\n\nDo While Loop / Guessing Game Example");
		char usrInpt, ignre, answr = 'k';
		int attmpt = 0;
		do
		{
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");
			//get input
			usrInpt = (char) System.in.read();  //need this twice because it ignores getting input the 1st time for some reason
			usrInpt = (char) System.in.read();
			//discard any other characters in the input buffer
			do
			{
				ignre = (char) System.in.read();
			} while( ignre != '\n');
			//give feedback of user being correct, too high, or too low
			if(usrInpt == answr)
			{
				System.out.println("** CORRECT **");
			}
			else
			{
				String str;
				if(usrInpt > answr)
				{
					//System.out.println("high.");
					str = "high.";
				}
				else
				{
					//System.out.println("low.");
					str = "low.";
				}
				System.out.println("Nope... you are too " + str);
				System.out.println("Try again!\n");
			}
		} while(usrInpt != answr);
	}
}

































