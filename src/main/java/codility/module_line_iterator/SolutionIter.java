package codility.module_line_iterator;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://codility.com/tasks/module_line_iterator/
 * https://codility.com/tickets/tryZNSHA5-7E7/
 */
class SolutionIter implements Iterable<Integer> {

	public static void main(String[] args) {
		String text =
				"137\n" +
				"-104\n" +
				"2 58\n" +
				"  +0\n" +
				"++3\n" +
				"+1\n" +
				" 23.9\n" +
				"2000000000\n" +
				"-0\n" +
				"five\n" +
				" -1";
		InputStream in = new ByteArrayInputStream(text.getBytes());
		Reader reader = new InputStreamReader(in);
		for (Integer x : new SolutionIter(reader)) {
            System.out.println(x);
		}
	}

	private List<Integer> list;

	public SolutionIter(Reader inp) {
		list = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(inp);
		try {
			String line = bufferedReader.readLine();
			while (line != null) {
				line = line.trim();
				if (line.matches("[+-]?(0|[1-9][0-9]*)")) {
					long num = Long.valueOf(line);
					if (-1_000_000_000 <= num && num <= 1_000_000_000) {
						list.add((int) num);
					}
				}
				line = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Iterator<Integer> iterator() {
		return list.iterator();
	}

}
