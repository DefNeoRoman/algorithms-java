package topcoder;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.*;

public class SmartWorldToyTest {

	@Test
	public void test() {
		String start = "aaaa";
		String finish = "zzzz";
		String[] forbid = {"a a a z", "a a z a", "a z a a", "z a a a", "a z z z", "z a z z", "z z a z", "z z z a"};
		int expected = 8;
		int actual = SmartWorldToy.minPresses(start, finish, forbid);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		String start = "aaaa";
		String finish = "bbbb";
		String[] forbid = {};
		int expected = 4;
		int actual = SmartWorldToy.minPresses(start, finish, forbid);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		String start = "aaaa";
		String finish = "mmnn";
		String[] forbid = {};
		int expected = 50;
		int actual = SmartWorldToy.minPresses(start, finish, forbid);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		String start = "aaaa";
		String finish = "zzzz";
		String[] forbid = {"bz a a a", "a bz a a", "a a bz a", "a a a bz"};
		int expected = -1;
		int actual = SmartWorldToy.minPresses(start, finish, forbid);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		String start = "aaaa";
		String finish = "zzzz";
		String[] forbid = {"cdefghijklmnopqrstuvwxyz a a a", 
				 "a cdefghijklmnopqrstuvwxyz a a", 
				 "a a cdefghijklmnopqrstuvwxyz a", 
				 "a a a cdefghijklmnopqrstuvwxyz"};
		int expected = 6;
		int actual = SmartWorldToy.minPresses(start, finish, forbid);
		assertEquals(expected, actual);
	}
	
	@Test
	public void Text() {
		char a = 'a';
		char b = 'b';
		System.out.println((int) 'a');
		System.out.println((int) 'z');
		System.out.println((int) 'm');
		
		System.out.println(Math.abs(-5));
		System.out.println(26 % 12);
	}
	
	@Ignore
	@Test
	public void charTest() {
		char[] c1 = {'a', 'b', 'c', 'd'};
		char[] c2 = {'a', 'b', 'c', 'd'};
		Arrays.equals(c1, c2);
	}
	
}
