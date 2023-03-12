import java.io.*;
public class TransportationDriver {
	public static void main(String[] args) {
		TransportBike harley = new TransportBike();
		TransportCar toyota = new TransportCar();
		harley.wheels();
		toyota.wheels();
	}
}
