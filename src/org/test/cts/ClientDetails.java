package org.test.cts;

public class ClientDetails extends CompanyDetails{
	public void clientId() {

	System.out.println("Client Id Is 333");
	}
	public static void main(String[] args) {
		ClientDetails c = new ClientDetails();
		c.employeeId();
		c.companyName();
		c.companyId();
		c.empAge();
	
	}
}
