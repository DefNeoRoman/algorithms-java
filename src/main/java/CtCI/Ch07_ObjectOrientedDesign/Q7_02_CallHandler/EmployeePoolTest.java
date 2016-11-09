package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class EmployeePoolTest {

	private Map<Long, Employee> employees;
	EmployeePool pool = new EmployeePool();

	@Before
	public void setUp() {
		employees = TestDataRepository.getEmployeeMap();
		employees.values().forEach(pool::add);
	}

	@Test
	public void test() {
		assertEquals(employees.get(4L), pool.getAvailable());
		assertEquals(employees.get(6L), pool.getAvailable());
		assertEquals(employees.get(9L), pool.getAvailable());
		assertEquals(employees.get(3L), pool.getAvailable());
		assertEquals(employees.get(5L), pool.getAvailable());

		try {
			System.out.println(pool.getAvailable());
			fail();
		} catch (RuntimeException e) {
		}

	}

}