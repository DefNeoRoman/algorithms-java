package seo.dale.algorithm.bruteforce.picnic;

public class PicnicAnswer {

    private int n;
    boolean[][] areFriends;

    public PicnicAnswer(int n, boolean[][] areFriends) {
        this.n = n;
        this.areFriends = areFriends;
    }

    public int countPairings(boolean[] taken) {
        int firstFree = -1;

        // 남은 학생 중 가장 번호가 빠른 학생을 찾는다.
        for (int i = 0; i < n; i++) {
            if (!taken[i]) {
                firstFree = i;
                break;
            }
        }

        // 모든 학생이 짝을 찾았으면 한 가지 방법을 찾은 것이다.
        if (firstFree == -1) {
            return 1;
        }

        int count = 0;
        for (int pairWith = firstFree + 1; pairWith < n; pairWith++) {
            if (!taken[pairWith] && areFriends[firstFree][pairWith]) {
                taken[firstFree] = taken[pairWith] = true;
                count += countPairings(taken);
                taken[firstFree] = taken[pairWith] = false;
            }
        }
        return count;
    }

}
