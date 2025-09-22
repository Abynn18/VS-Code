abstract class User {
abstract void showMessage();
    public void displayUserType(){
    System.out.println("User type selected");

}
}
class AdminUser extends User {
    void showMessage() {
        System.out.println("Welcome, Admin!");
    }
}
class GuestUser extends User {
    void showMessage() {
        System.out.println("Welcome, Guest!");
    }

    
}

public class UserTest {
    public static void main(String[] args) {
        AdminUser admin = new AdminUser();
        admin.showMessage();
        admin.displayUserType();

        GuestUser guest = new GuestUser();
        guest.showMessage();
        guest.displayUserType();
    }


    
}
