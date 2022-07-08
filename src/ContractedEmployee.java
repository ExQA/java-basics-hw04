public class ContractedEmployee extends Employee { // наследуется от Employee
  //  fix class declaration and declare variables here
  private double hourlyRate;
  private double numberOfHoursWorked;
  private String federalTaxId;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name); // superclass constructor call
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    //  fill in code here and replace the return statement
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    //  fill in code here
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    //  fill in code here and replace the return statement
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    //  fill in code here
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    //  fill in code here and replace the return statement
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    //  fill in code here
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  // fill in code here
  @Override
  public void calculatePay() {
    this.averageMonthlySalary = hourlyRate * numberOfHoursWorked;
  }
}
