// Read a character from the keyboard
class BreakLabels
{
	public static void main(String args[])
	{
		System.out.println("Break Labels\n");
		int x, y, z;
		
		//break labels are only allowed for nested loops within a block
		System.out.println("Example #1.0\n");
		first: for(x = 0; x < 5; x++)
		{
			System.out.println("X Value: " + x);
			second: for(y = 0; y < 5; y++)
			{
				System.out.println("Y Value: " + y);
				third: for(z = 0; z < 5; z++)
				{
					System.out.println("Z Value: " + z);
					//break if z = 3, then jump to the code after the loop labeled 'first'
					if(z == 3)
					{
						break first;
					}
				}
				System.out.println("Finished Z Loop " + y); //shouldn't show
			}
			System.out.println("Finished Y Loop " + x); //shouldn't show
		}
		System.out.println("Finished All Loops");
		
		System.out.println("\nExample #2.0\n");
		x = 0; y = 0; z = 0;
		//using a label before for loop
		before: for(;x < 9; x++)
		{
			//this loop should only once
			for(y = 0;y < 100; y++)
			{
				System.out.println(x + " My favorite number " + y);
				if(y == 1)
				{
					break before;
				}
			}
			System.out.println("This statement will not show when label comes before loop, but it would show if it came after");
		}
		
		System.out.println("\nExample #2.1\n");
		//using a label after for loop
		for(x = 0;x < 9; x++) after: 
		{
			//when break is called in this instance, it jumps directly to the beginning of the labeled loop at its current iteration
			System.out.println("This shows " + x);
			
			//this loop should run x times showing which iteration it is on as the first number
			for(y = 0;y < 100; y++)
			{
				System.out.println(x + " My favorite number " + y);
				if(y == 1)
				{
					break after;
				}
			}
		}
	}
}

































