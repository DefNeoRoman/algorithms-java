package CtCI.Ch03_StacksAndQueues.Q3_06_Animal_Shelter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_06_Animal_Shelter/AnimalQueue.java
 */
public class AnimalQueue {

	private static final AtomicInteger idGen = new AtomicInteger();

	private Queue<Cat> cats = new LinkedList<>();
	private Queue<Dog> dogs = new LinkedList<>();

	public void enqueueAny(Animal animal) {
		int id = idGen.incrementAndGet();
		animal.setId(id);
		if (animal instanceof Cat) {
			cats.offer((Cat) animal);
		} else if (animal instanceof Dog) {
			dogs.offer((Dog) animal);
		}
	}

	public Animal dequeueAny() {
		if (cats.isEmpty()) {
			return dequeueDogs();
		}
		if (dogs.isEmpty()) {
			return dequeueCats();
		}

		Cat cat = peekCats();
		Dog dog = peekDogs();

		return cat.getId() < dog.getId() ? dequeueCats() : dequeueDogs();
	}

	public Animal peekAny() {
		if (cats.isEmpty()) {
			return peekDogs();
		}
		if (dogs.isEmpty()) {
			return peekCats();
		}

		Cat cat = peekCats();
		Dog dog = peekDogs();

		return cat.getId() < dog.getId() ? cat : dog;
	}

	public int size() {
		return cats.size() + dogs.size();
	}

	public Cat dequeueCats() {
		return cats.poll();
	}

	public Cat peekCats() {
		return cats.peek();
	}

	public Dog dequeueDogs() {
		return dogs.poll();
	}

	public Dog peekDogs() {
		return dogs.peek();
	}

	public static void main(String[] args) {
		AnimalQueue animals = new AnimalQueue();
		animals.enqueueAny(new Cat("Callie"));
		animals.enqueueAny(new Cat("Kiki"));
		animals.enqueueAny(new Dog("Fido"));
		animals.enqueueAny(new Dog("Dora"));
		animals.enqueueAny(new Cat("Kari"));
		animals.enqueueAny(new Dog("Dexter"));
		animals.enqueueAny(new Dog("Dobo"));
		animals.enqueueAny(new Cat("Copa"));

		System.out.println(animals.dequeueAny());
		System.out.println(animals.dequeueAny());
		System.out.println(animals.dequeueAny());

		animals.enqueueAny(new Dog("Dapa"));
		animals.enqueueAny(new Cat("Kilo"));

		while (animals.size() != 0) {
			System.out.println(animals.dequeueAny());
		}
	}

}
