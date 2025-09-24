class  Employee{

    private String name;
    public String getname(){
        return name;
    }
    private int id;
    public int getid(){
        return id;
    }
    private String department;
    public String getdepartment(){
        return department;
    }
    private Double salary; 
    public Double getsalary(){
        return salary;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setdepartment(String department){
        this.department=department;
    }
    public void setsalary(Double salary){
        this.salary=salary;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("The Employee details are:");
        Employee emp1= new Employee();
        emp1.setname("Abin");
        emp1.setid(1);
        emp1.setdepartment("Hacking");
        emp1.setsalary(15000.0);
        Employee emp2=new Employee();
        emp2.setname("Virat");
        emp2.setid(2);
        emp2.setdepartment("Developing");
        emp2.setsalary(30000.0);
        System.out.println("Details of Employee 1");
        System.out.println("Name: "+emp1.getname());
        System.out.println("ID: "+emp1.getid());
        System.out.println("Department: "+emp1.getdepartment());
        System.out.println("Salary: "+emp1.getsalary());
        System.out.println("Details of Employee 2");
        System.out.println("Name: "+emp2.getname());
        System.out.println("ID: "+emp2.getid());
        System.out.println("Department: "+emp2.getdepartment());
        System.out.println("Salary: "+emp2.getsalary());
    }
}