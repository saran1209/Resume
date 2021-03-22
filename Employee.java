
public class Employee {
	private long empNo;
	private String name;
	private String designation;
	private double basicPay;
	
	public Employee(){
		
	}
	public Employee(long empNo, String name, String designation, double basicPay) {

		this.empNo = empNo;
		this.name = name;
		this.designation = designation;
		this.basicPay = basicPay;
}
	
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	public long getEmpNo() {
		return this.empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public void generateSalarySlip() {
		System.out.println("------------------------------------------------------");
		System.out.println("\t\t ABC Company");
		System.out.println("------------------------------------------------------");
		System.out.println("\t\t Salary Slip");
		System.out.println("Month: Jan \t\t\t Year:2021");
		System.out.println("------------------------------------------------------");
		System.out.println("Emp Id : "+ this.empNo + "\t\t\t" + " Year : "+ this.name);
		System.out.println("Designation : "+ this.designation + "\t\t" + " Basic Pay : "+ this.basicPay);
		System.out.println("CCA : 150 \t\t\t HRA : 200");
		System.out.println("Tax : 135 \t\t\t Net Salary : 1215");
		System.out.println("------------------------------------------------------");
	}
}
