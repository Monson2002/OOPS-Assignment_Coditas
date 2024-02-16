package Employee;

public class TestEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Monson", 101, 90000.0, "Work from Home");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Aman", 102, 50.0, 20.0);

        fullTimeEmployee.displayFullTimeEmployeeDetails();
        System.out.println();
        partTimeEmployee.displayPartTimeEmployeeDetails();

        System.out.println("Full Time Employee Earnings: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part Time Employee Earnings: " + partTimeEmployee.calculateSalary());
    }
}
