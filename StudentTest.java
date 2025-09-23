class Student {
    private String name;
    public String getname(){ 
        return name; 
    }
    private int rollno;
    public int getrollno(){ 
        return rollno; 
    }
    private double percentage;
    public double getpercentage(){ 
        return percentage; 
    }
    public void setname(String name){ 
        this.name=name; 
    }
    public void setrollno(int rollno){ 
        this.rollno=rollno; 
    }
    public void setpercentage(double percentage){ 
        this.percentage=percentage; 
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.setname("Abin");
        s.setrollno(21);
        s.setpercentage(85.5);
        System.out.println("Name: " + s.getname());
        System.out.println("Roll No: " + s.getrollno());
        System.out.println("Percentage: " + s.getpercentage());
    }
}

