package amazon.KoreaSdeChallenge;

import java.util.*;

public class Solution2 {

    private static Map<String, List<String>> friendMap;
    private static Map<String, List<String>> courseMap;

    static {
        friendMap = new HashMap<>();
        friendMap.put("Dale", Arrays.asList("Junior", "John"));

        courseMap = new HashMap<>();
        courseMap.put("Dale", Arrays.asList("CS 101", "ENG 102"));
        courseMap.put("Junior", Arrays.asList("ENG 101", "CS 102"));
        courseMap.put("Junior", Arrays.asList("CS 102", "LIT 101"));
    }

    static class Course implements Comparable<Course> {

        String name;
        int count;

        public Course(String name) {
            this.name = name;
            count = 1;
        }

        public void addCount() {
            count++;
        }

        @Override
        public boolean equals(Object other) {
            return this.name.equals(((Course) other).name);
        }

        @Override
        public int compareTo(Course other) {
            return this.count - other.count;
        }
    }

    public List<String> getRankedCourses(String user) {
        Set<Course> courseSet = new TreeSet<>();

        for (String friend : getDirectFriendsForUser(user)) {
           for (String course : getAttendedCoursesForUser(friend)) {
               if (courseSet.contains(course)) {
                   for (Course object : courseSet) {
                       if (course.equals(object)) {
                           object.addCount();
                       }
                   }
               } else {
                   Course object = new Course(course);
                   courseSet.add(object);
               }
           }
        }

        ArrayList<String> courseList = new ArrayList<>();
        for (Course object : courseSet) {
            courseList.add(object.name);
        }

        return courseList;
    }

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    public List<String> getDirectFriendsForUser(String user) {
        return friendMap.get(user);
    }

    public List<String> getAttendedCoursesForUser(String user) {
        return courseMap.get(user);
    }

}
