package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class Customer {

	private Long id;

	private String name;

	private String message;

	public Customer(Long id, String name, String message) {
		this.id = id;
		this.name = name;
		this.message = message;
	}

	public void deliver() {
		System.out.printf("- %s says... %s%n", this, message);
	}

	public void hangUp() {
		System.out.printf("- %s says... Thank you!%n", this);
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("[C-%2d] %s", id, name);
	}
}
