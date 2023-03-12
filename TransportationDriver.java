import java.io.*;
import java.util.Scanner;
public class TransportationDriver {
	public static void main(String[] args) throws IOException {
		TransportBike harley = new TransportBike();
		TransportCar toyota = new TransportCar();
		String fileName = args[0];
		File inputFile = new File(fileName);
		Scanner input = new Scanner(inputFile);
		String customer1 = input.next();
		String customer2 = input.next();
		harley.wheels();
		toyota.wheels();
		System.out.println(customer1 + " and " + customer2 + " want to purchase a bike.");		
		System.out.println(customer2 + " wants to purchase a car.");
	}
}
