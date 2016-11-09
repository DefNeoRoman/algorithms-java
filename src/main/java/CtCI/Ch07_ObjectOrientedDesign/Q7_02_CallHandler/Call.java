package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class Call {

	private Long id;

	private Customer customer;
	private Employee employee;

	public Call(Customer customer) {
		this.customer = customer;
	}

	public void assignEmployee(Employee employee) {
		System.out.println("- " + employee + " has assigned");
		this.employee = employee;
		employee.setBusy();
	}

	public void process() {
		employee.pickUp();
		customer.deliver();
		employee.handle();
		customer.hangUp();
		employee.setFree();
	}
}
