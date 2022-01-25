package it92.shenfeld.Lab6;

import java.util.Arrays;

public class AirLine {
    private AirPlane[] airPlanes;
    private int size;

    public AirLine(int size) {
        this.airPlanes = new AirPlane[size];
        this.size = 0;
    }

    public void sort() {
        Arrays.sort(airPlanes);
    }

    public AirPlane findByFuelConsumption(int A, int B) {
        AirPlane[] r = new AirPlane[size];
        int i = 0;
        for (AirPlane car : airPlanes)
            if (car.getFuelConsumption() >= A && car.getFuelConsumption() <= B) r[i++] = car;
        for (AirPlane res : r)
            if (res != null) return res;
        return null; 
    }

    public void add(AirPlane car) {
        try {
            airPlanes[size++] = car;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float getCargoCapacity() {
        int result = 0;
        for (AirPlane car : airPlanes)
        	result += car.getCargoCapacity();
        return result;
    }
    public float getSeats() {
        int result = 0;
        for (AirPlane car : airPlanes)
        	result += car.getSeats();
        return result;
    }

    public String toString() {
        return Arrays.toString(airPlanes);
    }

}
