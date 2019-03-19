package zad_7_1;

public abstract class Vehicle {
    private String name;
   public abstract double getFuelNeeds();
   public abstract double getDistance();

    public String toString(){
        return name;
    }

    public Vehicle(String name) {
        this.name = name;
    }
}
