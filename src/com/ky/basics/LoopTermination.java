package com.ky.basics;

public class LoopTermination {
    /**
     * continue,break
     * -------------------------
     * 1 2 3 4 5
     * 1 2 - 4 5
     * 1 - 3 - 5
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("======================");

        for(int j=1; j<=5; j++){
            System.out.println(j);
            if(j==3)
                break;
        }
    }
}
