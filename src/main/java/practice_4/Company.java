package practice_4;

public class Company {
    static String companyName;
    final int employeeID;
    private String employeeName;
    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompaneName() {
        System.out.println("Company's name is " + companyName);
    }

    public String getCompanyName() {
        return this.employeeName;
    }

    public void setCompanyName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

}
