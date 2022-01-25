package it92.shenfeld.Lab6;

public class AntonovAn2 extends AirPlane {
    public AntonovAn2(int fuelConsumption, int flightDistance, int seats, float cargoCapacity) {
        super(fuelConsumption, flightDistance, seats, cargoCapacity);
    }
    
    @Override
    public String toString() {
    	return "Antonov AN-2 : "+ super.toString();
    }
}
