package algospot.NQUEEN;

import java.util.Scanner;

/**
 * http://jjeeuu.tistory.com/13
 */
public class Main3 {
	public static int n;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int loop=scn.nextInt();

		for(int T=0;T<loop;T++){
			n=scn.nextInt();
			int[] queens = new int[n];
			int ans=0;

			for(int i=0; i<n; i++){
				ans+=putQueen(queens,0,i);
			}
			System.out.println(ans);
		}

	}

	static int putQueen(int[] queens1, int row, int col){
		queens1[row]=col;
		int[] queens = new int[n];
		if(row==n-1){
			return 1;
		}
		else{
			int ans=0;
			LOOP:
			for(int i=0; i<n; i++){
				copyQ(queens,queens1);
				for(int j=0; j<=row; j++)
					if(queens[j]==i || Math.abs(j-(row+1))==Math.abs(queens[j]-i))
						continue LOOP;
				ans+=putQueen(queens,row+1,i);
			}
			return ans;
		}
	}
	static void copyQ(int[] q1, int[] q2){
		for(int i=0; i<q1.length; i++){
			q1[i]=q2[i];
		}
	}
}
