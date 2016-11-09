package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class CallCenterTest {

	private CallCenter callCenter;

	@Before
	public void setUp() {
		EmployeePool employeePool = new EmployeePool();
		List<Employee> employees = TestDataRepository.getEmployeeList();
		employeePool.addAll(employees);
		callCenter = new CallCenter(employeePool);
	}

	@Test
	public void test() throws InterruptedException {
		while (callCenter.isInBusinessHours()) {
			Customer randomCustomer = TestDataRepository.getRandomCustomer();
			callCenter.dispatchCall(randomCustomer);
			Thread.sleep(1000);
		}
	}

}