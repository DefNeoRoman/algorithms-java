package seo.dale.algorithm.search;

import java.io.*;
import java.util.List;

import org.junit.Test;

public class SpellCheckerTest {

	@Test
	public void test() throws IOException {
		InputStream inputStream = getClass().getResourceAsStream("SpellChecker.txt");
		List<String> wrongList = SpellChecker.check(inputStream);
		System.out.println(wrongList);
	}

}
