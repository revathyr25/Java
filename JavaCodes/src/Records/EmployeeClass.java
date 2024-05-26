package Records;

public class EmployeeClass {
    private final String empName;
    private final int empId;

    public EmployeeClass(String empName,int empId){
        this.empName=empName;
        this.empId=empId;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpId(String empName){
        return empId;
    }

    public String toString() {
        return "employeeName: " + empName + " employeeId: " + empId;
    }

}
