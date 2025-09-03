package exercise;
public class EmployeeDBAdapter implements Employee{
    private EmployeeDB employeeDB;

    EmployeeDBAdapter(EmployeeDB employeeDB){
        this.employeeDB = new EmployeeDB(employeeDB.getId(), employeeDB.getFirstName(), employeeDB.getSurname(), employeeDB.getEmailAddress());
    }

    @Override
    public String getId() {
        return String.valueOf(employeeDB.getId());
    }

    @Override
    public String getFirstName() {
        return employeeDB.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeDB.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeDB.getEmailAddress();
    }
    
}
