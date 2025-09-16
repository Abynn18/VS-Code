public class task {
    public static void main(String[] args){
        int a[]=new int[5];
        a[0]=90;
        a[1]=71;
        a[2]=50;
        a[3]=69;
        a[4]=89;
        for(int i=0;i<a.length;i++){

        if (a[i]>=90) {
            System.out.println(a[i]+" : Excelent");
            }
        else if(a[i]>= 75 && a[i]<=89){
            System.out.println(a[i]+" : Good");
        }
        else if (a[i]>= 50 && a[i]<=74) {
            System.out.println(a[i]+" : Average");
        } 
        else{
            System.out.println(a[i]+" : Failed");
        }   
    }
}
    
}
