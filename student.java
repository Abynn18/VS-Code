import java.util.Scanner;
public class student {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        String[] names=new String[n];
        int[] marks=new int[n];
        int i;
        for( i=0;i<n;i++){
            System.out.println("Enter name of student " + (i + 1) + ":");
            names[i]=sc.next();
            System.out.println("Enter marks of " + names[i] + ":");
            marks[i]=sc.nextInt();
        }
        
        int total=0;
        for( i=0;i<n;i++){
            total += marks[i];
        }
        double average=total/(double)n;
        System.out.println("Average Marks: " + average);
         for ( i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
            if (marks[i] < 35) {
                System.out.print(" --> Needs Improvement");
            }
         
        }
        sc.close();
    }



}

