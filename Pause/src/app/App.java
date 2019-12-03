package app;

import java.util.concurrent.TimeUnit;

public class App {
    /* public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        hey(2);
    }

    public static void hey (int howLong) {
        try {
            TimeUnit.SECONDS.sleep(howLong);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    } */
    public static void main(String[] args) {
        int[][] m = {{1,2,3,4},{5,6,7,8}};
        displayMatrix(m);
    }

    public static void displayMatrix(int[][] m)
    {
        for(int r = 0; r < m.length; r++)
        {
            for(int c = 0; c < m.length; c++)
                System.out.print(m[r][c] + " ");
            System.out.println();
        }
    }

}