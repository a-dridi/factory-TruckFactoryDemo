public class TruckFactory {

	public Truck getTruck(String truckManufacturer) {
		if(truckManufacturer != null) {
			if(truckManufacturer.equalsIgnoreCase("Volvo")) {
				return new Volvo();
			} else if (truckManufacturer.equalsIgnoreCase("Man")) {
				return new Man();
			}
		} 
		return null;
	}
	
}