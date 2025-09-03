package exercise;

public class EmployeeCSVAdapter implements Employee{
    private EmployeeCSV employee;
    String[] tokenString;

    public EmployeeCSVAdapter(EmployeeCSV employee) {
        this.employee = new EmployeeCSV(employee.getCsvRow());
        this.tokenString = employee.tokens();
    }

    @Override
    public String getId() {
        return tokenString[0];
    }

    @Override
    public String getFirstName() {
        return tokenString[1];
    }

    @Override
    public String getLastName() {
        return tokenString[2];
    }

    @Override
    public String getEmail() {
        return tokenString[3];
    }
    
}
