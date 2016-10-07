package seo.dale.algorithm.dynamic.companyInvestment;

import java.util.Scanner;

/**
 * http://comganet.github.io/dp/2016/06/03/dp-1013
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
