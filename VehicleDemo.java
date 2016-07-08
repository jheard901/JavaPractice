
//exploring classes in java
class Vehicle
{
	int passengers; //max passengers 
	int fuelc;		//fuel capacity in gallons
	int mpg;		//miles per gallon
}


class VehicleDemo
{
	public static void main(String args[])
	{
		Vehicle carA = new Vehicle();
		Vehicle carB = new Vehicle();
		Vehicle carAlpha = carA; //this creates an object reference to car A (anything done to carAlpha actually happens to carA)
		
		carA.passengers = 6;
		carA.fuelc = 46;
		carA.mpg = 27;
		int rangeA = carA.fuelc * carA.mpg;
		
		carB.passengers = 2;
		carB.fuelc = 20;
		carB.mpg = 16;
		int rangeB = carB.fuelc * carB.mpg;
		
		
		//car A
		System.out.println("Car A has a max of " + carA.passengers + " passengers. With a fuel capacity of " + carA.fuelc
			+ " gallons and approximately " + carA.mpg + " miles per gallon, this car can travel for " + rangeA
			+ " miles until needing to refuel.");
		
		//car B
		System.out.println("\nCar B has a max of " + carB.passengers + " passengers. With a fuel capacity of " + carB.fuelc
			+ " gallons and approximately " + carB.mpg + " miles per gallon, this car can travel for " + rangeB
			+ " miles until needing to refuel.");
			
		//car C
		carAlpha.passengers -= 2;
		carAlpha.fuelc -= 28;
		carAlpha.mpg -= 6;
		int rangeC = carAlpha.fuelc * carAlpha.mpg;
		System.out.println("\nCar Alpha is a nickname for car A. Car A now has a max of " + carA.passengers + " passengers. With a fuel capacity of "
			+ carA.fuelc + " gallons and approximately " + carA.mpg + " miles per gallon, now this car can travel only for "
			+ rangeC + " miles until needing to refuel.");
	}
}

































