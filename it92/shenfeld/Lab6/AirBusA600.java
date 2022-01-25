package it92.shenfeld.Lab6;

public class AirBusA600 extends AirPlane {
    public AirBusA600(int fuelConsumption, int flightDistance, int seats, float cargoCapacity) {
        super(fuelConsumption, flightDistance, seats, cargoCapacity);
    }
    
    @Override
    public String toString() {
    	return "AirBus A600 : "+ super.toString();
    }
}
