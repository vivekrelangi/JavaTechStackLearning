package Inheritance;

public class Vehicle {
    private int no_of_doors,no_of_seats,no_of_tyres;
    private String name;
    private String transmission;
    private String engine;

    public int getNo_of_doors() {
        return no_of_doors;
    }

    public void setNo_of_doors(int no_of_doors) {
        this.no_of_doors = no_of_doors;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public int getNo_of_tyres() {
        return no_of_tyres;
    }

    public void setNo_of_tyres(int no_of_tyres) {
        this.no_of_tyres = no_of_tyres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
