/**
 * https://discuss.leetcode.com/topic/19931/6-line-java-solution-in-o-n
 */
package leetcode.jumpGame;

public class Reference {
	public boolean canJump(int[] A) {
		int max = 0;
		for(int i=0;i<A.length;i++){
			if(i>max) {return false;}
			max = Math.max(A[i]+i,max);
		}
		return true;
	}
}
