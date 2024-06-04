// Nama     : Fikri Azka Pradya
// NIM      : 24060122140171
public abstract class Vehicle {

    public abstract  double calcFuelEfficiency();

    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
    
}

