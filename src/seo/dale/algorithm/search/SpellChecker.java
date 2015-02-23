package seo.dale.algorithm.search;

import java.io.*;
import java.net.URL;
import java.util.*;

public class SpellChecker {

	public static List<String> check(InputStream inputStream) throws IOException {
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner scanner = new Scanner(url.openStream());
		
		Set<String> dictionary = new HashSet<String>();
		while (scanner.hasNext()) {
			dictionary.add(scanner.next());
		}
		scanner.close();
		
		List<String> wrongList = new ArrayList<String>();
		scanner = new Scanner(inputStream);
		while (scanner.hasNext()) {
			String[] tokens = scanner.nextLine().split("\\W"); // A non-word character
			for (String token: tokens) {
				if (token.length() > 1 && !dictionary.contains(token.toLowerCase())) {
					wrongList.add(token);
				}
			}
		}
		scanner.close();
		
		return wrongList;
	}
	
}
