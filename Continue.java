// Read a character from the keyboard
class Continue
{
	public static void main(String args[])
	{
		System.out.println("Continue Statement\n");
		int a, b, c;
		
		System.out.println("Example #1.0\n");
		//basic use of continue
		for (a = 0; a <= 25; a++)
		{
			//if the remainder of a / 5 is not zero, then we run continue which ignores
			//doing the rest of the code in the current iteration of the loop and proceeds
			//to check the conditional expression for the next iteration
			if(a%5 != 0)
			{
				continue;
			}
			System.out.println("Multiples of 5: " + a);
		}
		
		//continue used with a label
		System.out.println("\nExample #1.1");
		
		outloop: for(b = 0; b < 8; b++)
		{
			System.out.print("\nPass: " + b + " Values: ");
			for(c = 0; c < 40; c++)
			{
				//print only multiples of 4
				if(c%4 == 0)
				{
					System.out.print(c);
				}
				//continue from the label 'outloop'
				if(c > 15)
				{
					continue outloop;
				}
				//this will be skipped after the forth iteration because of the 'continue'
				if(c%4 == 0)
				{
					System.out.print(" + ");
				}
			}
		}
	}
}

































