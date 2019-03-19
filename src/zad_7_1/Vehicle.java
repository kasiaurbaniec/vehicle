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
    public double calculateFuelConsumption(){
        return getDistance()*getFuelNeeds();
    }
    public void go(){
        System.out.println("vehicle running");
    }
    public void stop(){
        System.out.println("vegicle stoped");
    }
}
