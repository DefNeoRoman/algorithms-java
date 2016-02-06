package seo.dale.algorithm.subest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SubSetTest {

	private SubSet ss = new SubSet();
	
	@Test
	public void test() {
		int[][] expected = {
				{0, 1, 2},
				{0, 1},
				{0, 2},
				{0},
				{1, 2},
				{1},
				{2},
				{}
		};
		
		int[][] expected2 = {
				{0, 1, 2},
				{0, 2},
				{0, 1},
				{0},
				{1, 2},
				{1},
				{2},
				{}
		};
		
		boolean bool = Arrays.equals(expected, expected2);
		System.out.println(bool);
		
		ss.listAllSubSets(3);
	
	}

}
