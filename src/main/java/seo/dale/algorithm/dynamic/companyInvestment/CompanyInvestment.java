package seo.dale.algorithm.dynamic.companyInvestment;

import java.util.Scanner;

/**

http://comganet.github.io/dp/2016/06/03/dp-1013

[ IN ]
4 3
1 4 1 5
2 8 5 10
3 12 11 15
4 16 15 20
[ OUT ]
20
0 0 4

[ IN ]
4 3
1    2   3   4
2    5   9   4
3   15   4  12
4    6   4   7
[ OUT ]
19
3 0 1
 */
public class CompanyInvestment {

    static int M,C;

    static int[][] Money;
    static int[][] D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        C = sc.nextInt();
        Money = new int[M+1][C+1];
        D = new int[M+1][C+1];

        for(int i=1;i<=M;i++){
            int m = sc.nextInt();

            for(int j=1;j<=C;j++){
                Money[m][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int i=1;i<=C;i++){
            for(int j=M;j>=1;j--){
                int max = 0;
                int[] Used = new int[C+1];

                for(int k=j;k>=0;k--){
                    int temp = Money[k][i] + D[j-k][0];

                    if(temp >= max){
                        for(int m=1;m<=C;m++){
                            Used[m] = D[j-k][m];
                        }

                        Used[i] = k;
                        max = temp;
                    }
                }
                D[j] = Used;
                D[j][0] = max;
            }
        }


        System.out.println(D[M][0]);

        for(int j=1;j<=C;j++){
            System.out.print(D[M][j] + " ");
        }
    }

}
