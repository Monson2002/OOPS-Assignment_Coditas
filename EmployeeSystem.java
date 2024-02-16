package Employee;

class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void displayDetails(){
        System.out.println("Name of the Employee: " + name);
        System.out.println("Employee Id: " + id);
    }
}

class FullTimeEmployee extends Employee{
    private double salary;
    private String benefits;
    public FullTimeEmployee(String name, int id, double salary, String benefits){
        super(name, id);
        this.salary = salary;
        this.benefits = benefits;
    }
    @Override
    public double calculateSalary(){
        return salary;
    }
    public void displayFullTimeEmployeeDetails(){
        displayDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Benefits: " + benefits);
    }
}
class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
    public void displayPartTimeEmployeeDetails(){
        displayDetails();
        System.out.println("Hourly Rate is: " + hourlyRate);
        System.out.println("Hours Worked are: " + hoursWorked);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Monson", 101, 90000.0, "Work from Home");

        fullTimeEmployee.displayFullTimeEmployeeDetails();
        System.out.println("The salary is: " + fullTimeEmployee.calculateSalary());
        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Aman", 102, 50.0, 20.0);

        partTimeEmployee.displayPartTimeEmployeeDetails();
        System.out.println("Calculated Salary: " + partTimeEmployee.calculateSalary());
    }
}