package algospot.NQUEEN;

import java.util.Scanner;

/**
 * http://jjeeuu.tistory.com/13
 */
public class Main2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int loop=scn.nextInt();

		for(int T=0;T<loop;T++){
			int n=scn.nextInt();
			boolean[][] board = new boolean[n][n];
			int ans=0;

			for(int i=0; i<n; i++){
				initBoard(board);
				ans+=putQueen(board,0,i);
			}

			System.out.println(ans);
		}

	}

	static int putQueen(boolean[][] board1, int row, int col){
		board1[row][col]=true;
		boolean[][] board = new boolean[board1.length][board1.length];
		if(row==board1.length-1){
			return 1;
		}
		else{
			int ans=0;
			for(int i=0; i<board.length; i++){
				copyBoard(board,board1);
				if(check(board,row+1,i)){
					ans+=putQueen(board,row+1,i);
				}
			}
			return ans;
		}
	}

	static boolean check(boolean[][] board, int row, int col){
		// 해당 (row,col)에 퀸을 두어도 괜찮을 지 체크 (가로,세로,대각선 확인)
		int n=board.length;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if((i==row&&board[i][j])
						|| (j==col&&board[i][j])
						|| (Math.abs(i-row)==Math.abs(j-col)&&board[i][j])) return false;
			}
		}
		return true;
	}

	static void initBoard(boolean[][] board){
		// 보드 초기화
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board.length; j++){
				board[i][j]=false;
			}
		}
	}

	static void copyBoard(boolean[][] board, boolean[][] board1){
		// 보드 초기화2.. board를 board1로 카피
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board.length; j++){
				board[i][j]=board1[i][j];
			}
		}
	}

}
