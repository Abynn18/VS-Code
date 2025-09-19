interface Animals {
    public void makeSound();
    public void move();
}
 class zoo implements Animals {
     public void makeSound() {
        System.out.println("Chirp Chirp");
    }
    public void move() {
        System.out.println("Fly");
    }
}
class dog implements Animals {
        public void makeSound() {
            System.out.println("Bark Bark");
        }
        public void move() {
            System.out.println("Run");
        }
    } 

    public class bird {
        public static void main(String[] args) {
            zoo myBird = new zoo();
            dog myDog = new dog();
            System.out.print("Bird Sound: ");
            myBird.makeSound();
            System.out.print("Bird Movement: ");
            myBird.move();
            System.out.print("Dog Sound: ");
            myDog.makeSound();
            System.out.print("Dog Movement: ");
            myDog.move();
        }
    
        
    }   

