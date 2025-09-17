public class average {
    public static void main(String[] args){
        int a[]=new int[5];
        int total=0;
        int i;
        a[0]=20;
        a[1]=15;
        a[2]=30;
        a[3]=0;
        a[4]=25;
        for( i=0;i<a.length;i++){
            total += a[i];
            }
        for( i=0;i<a.length;i++){
            if (a[i]==0) {
                System.out.println(a[i]+" : out of stock");
                break;
            }
            
        }
         System.out.println("Total Stock="+total);
             
               
                if (total<50) {
                    System.out.println("Low stock");
                }
                else if (total>=50 && total<=100) {
                    System.out.println("Moderate Stock ");
                }
                else{
                    System.out.println("Good Stock");
                }
                
            }

          
    }

    

