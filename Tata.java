package Abstraction.Interfaces;

public /*abstract*/ class Tata implements Car,SafeCar{
    @Override
    public void engine() {
        System.out.println("Tata engine");
    }


    @Override
    public void gear() {
        System.out.println("Hyundai gear");
    }

    @Override
    public void tyres() {
        System.out.println("MRF tyres");
    }

    @Override
    public void mirrors() {
        System.out.println("Borosil glasses");
    }

    @Override
    public void adas() {
        System.out.println("ADAS level 2");
    }

    @Override
    public void airbags() {
        System.out.println("6 Airbags");
    }
}
