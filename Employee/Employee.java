package Employee;

/**
 * Class stores employee information
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String nme, int id, String dep, String pos) {
        name = nme;
        idNumber = id;
        department = dep;
        position = pos;
    }

    public Employee(String nme, int id) {
        name = nme;
        idNumber = id;
        department = "";
        position = "";
    }

    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public void setName(String nme) {
        name = nme;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        idNumber = id;
    }

    public int getId() {
        return idNumber;
    }

    public void setDepartment(String dept) {
        department = dept;
    }

    public String getDepartment() {
        return department;
    }

    public void setPosition(String pos) {
        position = pos;
    }

    public String getPosition() {
        return position;
    }
}