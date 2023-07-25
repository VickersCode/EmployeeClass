package Employee;
import java.util.ArrayList;

public class EmployeeClass {
    public static void main(String[] args) {

        // Create employee objects
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Add employees to an array
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(susan);
        employees.add(mark);
        employees.add(joy);

        // Display data for each employee
        System.out.println("Name\t\tID Number\tDepartment\tPosition");
        for (Employee i: employees) {
            System.out.println(i.getName() + "\t" + i.getId() + "\t\t" + i.getDepartment() + "\t\t" + i.getPosition());

        }
    }
}
