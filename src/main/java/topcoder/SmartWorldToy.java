package topcoder;

import java.util.*;

/**
Problem Statement
    	The toy company "I Can't Believe It Works!" has hired you to help develop educational toys. The current project is a word toy that displays four letters at all times. Below each letter are two buttons that cause the letter above to change to the previous or next letter in alphabetical order. So, with one click of a button the letter 'c' can be changed to a 'b' or a 'd'. The alphabet is circular, so for example an 'a' can become a 'z' or a 'b' with one click. 



In order to test the toy, you would like to know if a word can be reached from some starting word, given one or more constraints. A constraint defines a set of forbidden words that can never be displayed by the toy. Each constraint is formatted like "X X X X", where each X is a string of lowercase letters. A word is defined by a constraint if the ith letter of the word is contained in the ith X of the contraint. For example, the constraint "lf a tc e" defines the words "late", "fate", "lace" and "face". 



You will be given a String start, a String finish, and a String[] forbid. Calculate and return the minimum number of button presses required for the toy to show the word finish if the toy was originally showing the word start. Remember, the toy must never show a forbidden word. If it is impossible for the toy to ever show the desired word, return -1.
 
Definition
    	
Class:	SmartWordToy
Method:	minPresses
Parameters:	String, String, String[]
Returns:	int
Method signature:	int minPresses(String start, String finish, String[] forbid)
(be sure your method is public)
    
 
Constraints
-	start and finish will contain exactly four characters.
-	start and finish will contain only lowercase letters.
-	forbid will contain between 0 and 50 elements, inclusive.
-	Each element of forbid will contain between 1 and 50 characters.
-	Each element of forbid will contain lowercase letters and exactly three spaces.
-	Each element of forbid will not contain leading, trailing or double spaces.
-	Each letter within a group of letters in each element of forbid will be distinct. Thus "aa a a a" is not allowed.
-	start will not be a forbidden word.
 */
// a = 97, z = 122
public class SmartWorldToy {
	
	private static SmartWorldToyHelper helper = new SmartWorldToyHelper();
	
	// 26 alphabets ^ 4 letters = 26^4 combinations
	private static Set<String> visit = new HashSet<String>();

	public static int minPresses(String start, String finish, String[] forbid) {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(start, 0));
		visit.add(start);
		
		while (!queue.isEmpty()) {
			// Poll and check if the node equals to the finish.
			Node currentNode = queue.poll();
			System.out.println("# current : " + currentNode);
			
			// 1) If the node equals to the finish, return its cost;
			if (finish.equals(currentNode.data)) {
				return currentNode.cost;
			}

			// 2) Otherwise, Offer its child nodes to the queue.
			List<Node> childNodes = helper.getChildNodes(currentNode, forbid, visit);
			System.out.println("# childs : " + childNodes);
			queue.addAll(childNodes);
		}
		
		return -1;
	}
	
	public static class Node {
		
		public String data;
		public int cost;
		
		public Node(String data, int cost) {
			this.data = data;
			this.cost = cost;
		}

		@Override
		public int hashCode() {
			return data.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			return data.equals(((Node) obj).data);
		}
		
		@Override
		public String toString() {
			return data + "(" + cost + ")";
		}
		
	}
	
	
}
