public class mark {
    public static void main(String[] args){
    int[] marks= new int[5];
    marks[0]=78;
    marks[1]=82;
    marks[2]=91;
    marks[3]=65;
    marks[4]=34;
    int total=0;
    double average;
    int i;
    
    for( i=0;i<marks.length;i++){
         total += marks[i];
            if (marks[i]<35) {
                System.out.println(i+")"+"mark =" +marks[i]+" Result : Fail ");
                break;
            }
           
            }
            
            average = total / (double)marks.length;
            System.out.println("Total Marks ="+total);
            System.out.println("Average Marks ="+average);
           
                 
                 if(average>=90){
                     System.out.println("Result : Grade A");
                 }
                 else if (average>=75 ){
                     System.out.println("Result : Grade B");
                 }
                 else if (average>=60){
                     System.out.println("Result : Grade C");
                 }
                 else{
                     System.out.println("Result : Fail");
                 }
                }
            }
                
   

