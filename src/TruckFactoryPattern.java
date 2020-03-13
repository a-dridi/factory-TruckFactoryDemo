
public class TruckFactoryPattern {

	public static void main(String[] args) {
		TruckFactory truckFactory = new TruckFactory();

		Truck manObj = truckFactory.getTruck("Man");
		Truck volvoObj = truckFactory.getTruck("Volvo");

		manObj.start();
		volvoObj.start();
	}

}
