package org.cs.test.home;

import org.cs.test.login.Employee;

public class Client {
	private void clientId() {
		System.out.println("9009");
	}
	public static void main(String[] args) {
		Client cl = new Client();
		cl.clientId();
		Employee e = new Employee();
		e.empId();
		e.empName();
	}

}
