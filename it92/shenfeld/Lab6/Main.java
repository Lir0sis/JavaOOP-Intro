package it92.shenfeld.Lab6;

public class Main {
    public static void main(String[] args) {
        
        AirLine airLine = new AirLine(5);
        
        airLine.add(new AirBusA600(20, 200, 250, 10.5f));
        airLine.add(new AirBusA600(21, 160, 220, 17.5f));
        airLine.add(new BlackburnBeverley(18, 210, 111, 9.5f));
        airLine.add(new AntonovAn2(11, 140, 223, 25.5f));
        airLine.add(new AntonovAn2(13, 150, 250, 25.5f));
        
        System.out.println(airLine);
        
        System.out.println(airLine.getSeats());
        System.out.println(airLine.getCargoCapacity());
        airLine.sort();
        System.out.println(airLine);
        
    }
}
