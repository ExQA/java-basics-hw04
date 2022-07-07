public class SalariedEmployee extends Employee {
  //  fix class declaration and declare variables here
  String socialSecurityNumber;
  double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    //  fill in code here
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    //  fill in code here and replace the return statement
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    //  fill in code here
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    //  fill in code here and replace the return statement
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    //  fill in code here
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  // fill in code here
  @Override
  public void calculatePay() {
    this.averageMonthlySalary = fixedMonthlyPayment;
  }
}
