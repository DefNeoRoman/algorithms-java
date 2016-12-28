package CtCI.Ch03_StacksAndQueues.Q3_06_Animal_Shelter;

public abstract class Animal {

	private Integer id;
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

}

class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Cat:" + name;
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Dog:" + name;
	}

}