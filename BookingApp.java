import java.util.Scanner;
abstract class Ride {
    abstract int calculateFare(int distance);
    public void ridetype(){
        System.out.println("Generic ride");
    } 
}
class AutoRide extends Ride {
    public int calculateFare(int distance){
        return distance * 10;
    }
    public void ridetype(){
        System.out.println("Auto Ride");
    }   
}
class CarRide extends Ride {
     public int calculateFare(int distance){
        return distance * 20;
    }
    public void ridetype(){
        System.out.println("Car Ride");
    }      
}
public class BookingApp {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.print("Choose Auto or Car:");
        String choose= c.nextLine();
        int km=0;
       try {
         System.out.print("Enter the kilometer to travel (a positive integer): ");
         km = c.nextInt();
         if (km < 0) {  
            throw new NumberFormatException("positive integer only ");
        }
    }catch (NumberFormatException e) {
        System.out.println(e.getMessage());
        return;
    } 
        Ride ride;
        switch (choose.toLowerCase()) {
             case "auto":
             ride = new AutoRide();
             break;
             case "car":
             ride = new CarRide();
             break;
             default:
             System.out.println("Invalid choice! Please choose either 'Auto' or 'Car'.");
             return;
            }
            ride.ridetype();
            int fare= ride.calculateFare(km);
            System.out.println("Total fare: " + fare);
            c.close();
        }
    }
