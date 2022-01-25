package it92.shenfeld.Lab6;

public class BlackburnBeverley extends AirPlane {
    public BlackburnBeverley(int fuelConsumption, int flightDistance, int seats, float cargoCapacity) {
        super(fuelConsumption, flightDistance, seats, cargoCapacity);
    }
    
    @Override
    public String toString() {
    	return "Blackburn Beverley : "+ super.toString();
    }
}
