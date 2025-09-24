class course {
    public static int track=0;
    static final String location="MashupStack";
    String name;
    int duration;
    course(){
        name="Java";
        duration=6;
        track++;

    }
    course(String name, int duration){
        this.name=name;
        this.duration=duration;
        track++;
    }
     class CourseMaterial  {
        public void display() {
        System.out.println("Materials provided for this course");
        }
    }
     void information(){
        System.out.println("Course Name : "+name);
        System.out.println("Course Duration : "+duration+" months");
   }

    
}
public class trainingcenter {
   
    
    
    public static void main(String[] args) {
        course c1=new course("Python",6);
        course c2=new course();
        course.CourseMaterial cm=c1.new CourseMaterial();
        System.out.println("Training Center Name: "+course.location);
        c1.information();
        c2.information();
        cm.display();
        System.out.println("Total number of courses: "+course.track);
        
        
        

    }
   
    
}
