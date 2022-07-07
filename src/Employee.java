public abstract class Employee implements Payable {
  //  fix class declaration and declare variables here
  private String employeeId;
  private String name;
  protected double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    //  fill in code here
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    //  fill in code here and replace the return statement
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    //  fill in code here
    this.employeeId = employeeId;
  }

  public String getName() {
    //  fill in code here and replace the return statement
    return name;
  }

  public void setName(String name) {
    //  fill in code here
    this.name = name;
  }

  public double getAverageMonthlySalary(){
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "employeeId='" + employeeId + '\'' +
            ", name='" + name + '\'' +
            ", averageMonthlySalary=" + String.format("%.2f", averageMonthlySalary) +
            '}';
  }
}
