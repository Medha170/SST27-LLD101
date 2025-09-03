package exercise;

import java.util.stream.Collectors;

public class EmployeeLDAPAdapter implements Employee {
    private EmployeeLDAP employeeLDAP;

    EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP){
        this.employeeLDAP = new EmployeeLDAP(employeeLDAP.attrKeys().stream().collect(Collectors.toMap(k -> k, k -> employeeLDAP.get(k))));
    }

    @Override
    public String getId() {
        return employeeLDAP.get("uid");
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.get("givenName");
    }

    @Override
    public String getLastName() {
        return employeeLDAP.get("sn");
    }

    @Override
    public String getEmail() {
        return employeeLDAP.get("mail");
    }
    
}
