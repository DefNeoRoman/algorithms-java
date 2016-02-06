package topcoder;

import java.util.*;

/**
http://community.topcoder.com/stat?c=problem_statement&pm=2913&rd=5849
 */
public class UserName {

	public static String newMember(String[] existingNames, String newName) {
		// 1) Extract the names starting with new name. (O(n))
		List<Integer> numsStartingWithNewName = extractNumsStratingWithNewName(existingNames, newName);
		// System.out.println("numsStartingWithNewName = " + numsStartingWithNewName);
		if (numsStartingWithNewName.isEmpty()) {
			return newName;
		}
		
		// 2) SuggestVarient. (O(n))
		String varient = suggestVarient(numsStartingWithNewName, newName);
		// System.out.println("varient = " + varient);
		
		return varient;
	}
	
	private static List<Integer> extractNumsStratingWithNewName(String[] existingNames, String newName) {
		List<Integer> nums = new ArrayList<Integer>();
		for (String existingName : existingNames) {
			if (existingName.startsWith(newName)) {
				String numStr = existingName.substring(newName.length());
				if (numStr.length() == 0) {
					numStr = "0";
				}
				nums.add(Integer.valueOf(numStr));
			}
		}
		return nums;
	}
	
	
	private static String suggestVarient(List<Integer> nums, String newName) {
		Collections.sort(nums);

		int varient = 0;
		for (int n : nums) {
			if (varient == n) {
				varient++;
			} else {
				break;
			}
		}
		
		return varient == 0 ? newName : newName + varient;
	}
	
}
