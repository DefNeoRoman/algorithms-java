package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class Employee implements Comparable<Employee> {

	private Long id;
	private Type type;
	private String name;
	private boolean available;

	public Employee(Long id, Type type, String name) {
		this(id, type, name, true);
	}

	public Employee(Long id, Type type, String name, boolean available) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.available = available;
	}

	void pickUp() {
		System.out.println("- " + this + " says... How can I help you?");
	}

	void handle() {
		System.out.println("- " + this + " starts working.");
		try {
			Thread.sleep(type.performance);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("- " + this + " finishes working.");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPerformance() {
		return type.performance;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setBusy() {
		setAvailable(false);
	}

	public void setFree() {
		setAvailable(true);
	}

	private void setAvailable(boolean available) {
		this.available = available;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int compareTo(Employee other) {
		return this.type.priority - other.type.priority;
	}

	@Override
	public String toString() {
		return String.format("[E-%2d] %s %s", id, type, name);
	}

	enum Type {
		AGENT(1, 2000), MANAGER(2, 1000), DIRECTOR(3, 5000);

		int priority;
		int performance;

		Type(int priority, int performance) {
			this.priority = priority;
			this.performance = performance;
		}
	}

}
