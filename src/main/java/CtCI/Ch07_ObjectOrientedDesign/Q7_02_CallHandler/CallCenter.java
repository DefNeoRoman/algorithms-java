package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class CallCenter {

	private long startTime;

	private CallQueue callQueue;
	private EmployeePool employeePool;

	public CallCenter(EmployeePool employeePool) {
		startTime = System.currentTimeMillis();
		this.employeePool = employeePool;
	}

	public boolean isInBusinessHours() {
		long currentTime = System.currentTimeMillis();
		return currentTime - startTime < 10 * 1000;
	}

	public void dispatchCall(Customer customer) {
		System.out.println(customer + " is being dispatched.");
		Call call = new Call(customer);

		Employee employee = employeePool.getAvailable();
		call.assignEmployee(employee);

		call.process();
	}

}
