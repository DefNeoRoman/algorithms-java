package testdome;

import java.util.*;
import java.text.SimpleDateFormat;

public class MovieNight {
	public static Boolean canViewAll(Collection<Movie> movies) {
		List<Movie> moveList = new ArrayList<>(movies);
		Collections.sort(moveList, (a, b) -> a.getStart().compareTo(b.getStart()));
		for (int i = 0; i < moveList.size() - 1; i++) {
			Date currEndDate = moveList.get(i).getEnd();
			Date nextStartDate = moveList.get(i + 1).getStart();
			if (nextStartDate.compareTo(currEndDate) < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
		movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));
		movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));

		System.out.println(MovieNight.canViewAll(movies));
	}
}

class Movie {
	private Date start, end;

	public Movie(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return this.start;
	}

	public Date getEnd() {
		return this.end;
	}
}