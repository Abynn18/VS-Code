interface Vehicle {
    public void Start();
    public void Stop();
}
interface Fuelbased {
    public void refuel();
}
class car implements Vehicle, Fuelbased {
    public void Start() {
        System.out.println("Car Started");
    }
    public void Stop() {
        System.out.println("Car Stopped");
    }
    public void refuel() {
        System.out.println("Car is refueling at the station.");
    }
}
class electricScooter implements Vehicle {
    public void Start() {
        System.out.println("Electric scooter powered on.");
    }
    public void Stop() {
        System.out.println("Electric scooter powered off.");
    }

    
}
public class RentalSystem {
    public static void main(String[] args) {
        car myCar = new car();
        electricScooter myScooter = new electricScooter();
        System.out.println("Car Actions:");
        myCar.Start();
        myCar.refuel();
        myCar.Stop();
        System.out.println("\nElectric Scooter Actions:");
        myScooter.Start();
        myScooter.Stop();
    }
    
}
