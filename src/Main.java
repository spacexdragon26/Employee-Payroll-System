abstract class Employee{
    private String name;
    private int id;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public abstract double CalculateSalary();

    @Override
    public String toString(){
        return "Employee[name="+name+", id="+id+", salary="+CalculateSalary()+"]";
    }
}

class FullTimeEmployee extends Employee{


    private double monthlySalary;
    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name,id);
        this.monthlySalary= monthlySalary;

    }
    @Override
    public double CalculateSalary(){
      return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate= hourlyRate;
    }

    @Override
    public double CalculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
