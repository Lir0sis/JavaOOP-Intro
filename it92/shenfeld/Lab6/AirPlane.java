package it92.shenfeld.Lab6;

public class AirPlane implements Comparable<AirPlane>{
    private int fuelConsumption;
    private int seats;
    private int flightDistance;
    private float cargoCapacity;

    public AirPlane(int fuelConsumption, int flightDistance, int seats, float cargoCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.flightDistance = flightDistance;
        this.seats = seats;
        this.cargoCapacity = cargoCapacity;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }
    
    public int getSeats() {
        return seats;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public String toString() {
    	return "(" + fuelConsumption + ", " + flightDistance + ", " + seats + ", " + cargoCapacity + ")";
    }
    
    public int compareTo(AirPlane t) {
        return Integer.compare(flightDistance, t.getFlightDistance());
    }

}
