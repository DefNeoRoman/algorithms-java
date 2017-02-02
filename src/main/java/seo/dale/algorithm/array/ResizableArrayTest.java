package seo.dale.algorithm.array;

import org.junit.Test;

public class ResizableArrayTest {

	@Test
	public void test() {
		ResizableArray resizableArray = new ResizableArray();

		System.out.println("size: " + resizableArray.size());

		for (int i = 0; i < 100; i++) {
			resizableArray.append(i);
		}

		System.out.println("size: " + resizableArray.size());

		for (int i = 0; i < 100; i++) {
			System.out.println(resizableArray.get(i));
		}

		System.out.println("size: " + resizableArray.size());
	}

}