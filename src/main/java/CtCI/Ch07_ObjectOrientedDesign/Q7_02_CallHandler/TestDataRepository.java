package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class TestDataRepository {

	private static Map<Long, Employee> employees;

	static {
		employees = new HashMap<>();
		employees.put(1L, new Employee(1L, Employee.Type.AGENT, "Apple", false));
		employees.put(2L, new Employee(2L, Employee.Type.MANAGER, "Banana", false));
		employees.put(3L, new Employee(3L, Employee.Type.MANAGER, "Coconut", true));
		employees.put(4L, new Employee(4L, Employee.Type.AGENT, "Durian", true));
		employees.put(5L, new Employee(5L, Employee.Type.DIRECTOR, "Eggplant", true));
		employees.put(6L, new Employee(6L, Employee.Type.AGENT, "Fig", true));
		employees.put(7L, new Employee(7L, Employee.Type.AGENT, "Grape", false));
		employees.put(8L, new Employee(8L, Employee.Type.MANAGER, "Kiwi", false));
		employees.put(9L, new Employee(9L, Employee.Type.AGENT, "Lemon", true));
	}

	public static Map<Long, Employee> getEmployeeMap() {
		return employees;
	}

	public static List<Employee> getEmployeeList() {
		return new ArrayList<>(employees.values());
	}

	public static Customer getRandomCustomer() {
		long id = (long) (Math.random() * 100);
		return new Customer(id, "Customer #" + id,String.format("I'm the customer, %d.", id));
	}

}
