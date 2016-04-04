package seo.dale.algorithm.bruteforce.tsp;

import java.util.Random;

public class TSP {

    public static void solveMe(int n) {
        double[] xPos = new double[n];
        double[] yPos = new double[n];
        for (int i = 0; i < n; i++) {
            xPos[i] = Math.random() * 100;
            yPos[i] = Math.random() * 100;
        }
        Math.random();
        double[][] c = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = Math.sqrt(Math.pow(xPos[i] - xPos[j], 2) + Math.sqrt(Math.pow(yPos[i] - yPos[j], 2)));
            }
        }



    }
}
