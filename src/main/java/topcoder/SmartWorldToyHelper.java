package topcoder;

import java.util.*;

import topcoder.SmartWorldToy.Node;

public class SmartWorldToyHelper {

	public List<Node> getChildNodes(Node currentNode, String[] forbid, Set<String> visit) {
		List<Node> nodeList = new ArrayList<Node>();
		for (int i = 0; i < 4; i++) {
			String nextStr = changeLetterAt(currentNode.data, i, true);
			String previousStr = changeLetterAt(currentNode.data, i, false);
			
			if (!visit.contains(nextStr) && !isStrForbidden(nextStr, forbid)) {
				Node nextNode = new Node(nextStr, currentNode.cost + 1);
				nodeList.add(nextNode);
				visit.add(nextStr);
			}
			
			if (!visit.contains(previousStr) && !isStrForbidden(previousStr, forbid)) {
				Node previousNode = new Node(previousStr, currentNode.cost + 1);
				nodeList.add(previousNode);
				visit.add(previousStr);
			}
		}
		return nodeList;
	}
	
	public String changeLetterAt(String current, int index, boolean next) {
		char[] charArray = current.toCharArray();
		
		char candiateChar = charArray[index];
		if (next) {
			if (candiateChar == 'z') {
				candiateChar = 'a';
			} else {
				candiateChar = (char) (candiateChar + 1);
			}
		} else {
			if (candiateChar == 'a') {
				candiateChar = 'z';
			} else {
				candiateChar = (char) (candiateChar - 1);
			}
		}
		
		charArray[index] = candiateChar;
		return new String(charArray);
	}
	
	public boolean isStrForbidden(String str, String[] forbid) {
		for (String forbidStrs : forbid) {
			String[] forbiddenStrTokens = forbidStrs.split(" ");
			
			if (isStrForbiddenToken(str, forbiddenStrTokens)) {
				return true;
			}
			
		}
		return false;
	}
	
	private boolean isStrForbiddenToken(String str, String[] tokens) {
		for (int i = 0; i < 4; i++) {
			if (tokens[i].indexOf(str.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}
	
}