package practice_4;

public class Company {
    static String companyName;
    final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company's name is " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

}
