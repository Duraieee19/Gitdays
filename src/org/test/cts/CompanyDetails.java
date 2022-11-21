package org.test.cts;

public class CompanyDetails implements EmployeeDetails {
	public void companyName() {
	System.out.println("Company name is CTS");
	}

	public void companyId() {
	System.out.println("Company Id Is 9843");
	}

	@Override
	public void employeeId() {
		System.out.println("Employee Id is 123");
	}

	@Override
	public void empAge() {
    System.out.println("Employee Age is 34");		
	}
}
