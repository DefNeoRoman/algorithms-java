package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class EmployeePool {

	private List<Employee> employees;

	public EmployeePool() {
		this.employees = new ArrayList<>();
	}

	public EmployeePool(List<Employee> employees) {
		this.employees = employees;
	}

	public void addAll(Collection<Employee> employees) {
		this.employees.addAll(employees);
	}

	public void add(Employee e) {
		employees.add(e);
	}

	public void remove(Employee e) {
		employees.remove(e);
	}

	public Employee getAvailable() {
		Stream<Employee> stream = employees.stream().filter(Employee::isAvailable);
		if (stream.count() == 0) {
			throw new RuntimeException("No employee available.");
		}
		Iterator<Employee> iter = employees.stream().filter(Employee::isAvailable).sorted().iterator();
		return iter.next();
	}

}