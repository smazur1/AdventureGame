import java.util.Scanner;

public class CarPicker {

	public static void main(String[] args) {

		String vehicle, doors, truckType, sportType, sedanType, truckSize;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the Vehicle Choice Game.");

		System.out.println("This program will pick your next vehicle for you. Ready? ");
		System.out.println("What kind of vehicle do you want - 'car' or 'truck'? ");

		vehicle = keyboard.next();

		if (vehicle.equals("car")) // car
		{
			System.out.println("Do you want '2door' or '4door' ? ");
			doors = keyboard.next();
			if (doors.equals("2door")) // 2 door
			{
				System.out.println("Do you want 'sportscar' or 'economy' car ? ");
				sportType = keyboard.next();
				if (sportType.equals("sportscar")) // sports car
				{
					System.out.println("Congratulations! Your next car is a Chevrolet Corvette!");
				} else // economy car
				{
					System.out.println("Congratulations! Your next car is a Fiat 500!");
				}
			} else // 4 door
			{
				System.out.println("Do you want 'small' or 'large' sedan ? ");
				sedanType = keyboard.next();
				if (sedanType.equals("small")) // small sedan
				{
					System.out.println("Congratulations! Your next car is a Toyota  Corolla!");
				} else // large sedan
				{
					System.out.println("Congratulations! Your next car is a Cadillac Coupe DeVille!");
				}
			}

		} else // truck
		{
			System.out.println("Do you want pickup or van? ");
			truckType = keyboard.next();
			if (truckType.equals("pickup")) // pickup
			{
				System.out.println("Do you want 'fullsize' or 'compact' pickup truck ? ");
				truckSize = keyboard.next();
				if (truckSize.equals("fullsize")) // fullsize pickup
				{
					System.out.println("Congratulations! Your next truck is a Ford F250!");
				} else // compact truck
				{
					System.out.println("Congratulations! Your next truck is a Chevrolet Colorado!");
				}
			} else // van
			{
				System.out.println("Do you want 'mini' van or a 'work' van ? ");
				truckSize = keyboard.next();
				if (truckSize.equals("mini")) // mini van
				{
					System.out.println("Congratulations! Your next van is a Honda Odyssey!");
				} else // work van
				{
					System.out.println("Congratulations! Your next car is a Ford Transit van!");
				}
			}
		}

		keyboard.close();

	}

}
