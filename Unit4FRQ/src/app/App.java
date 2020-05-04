package app;

public class App {
    public static void main(String[] args) throws Exception {
        longestStreak("CCAAAAATTT!");
    }

    public static void longestStreak(String str) {
        String[] array = str.split("");

        int storedCount = 1;
        int count = 1;
        int storedIndex = 0;
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[index])) {
                count++;
            } else {
                count = 1;
                index = i;
            }

            if (count > storedCount) {
                storedCount = count;
                storedIndex = index;
            }
        }

        System.out.println(array[storedIndex] + " " + storedCount);
    }

    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a)
     */
    public int getPlayer2Move(int round) {
        int result;

        if (round % 3 == 0) {
            result = 3;
        } else if (round % 2 == 0) {
            result = 2;
        } else {
            result = 1;
        }

        return result;
    }

    /**Plays a simulated game between two players, as described in part (b)
     */
    public void playGame() {
        int player1 = startingCoins;
        int player2 = startingCoins;
        int rounds = 1;

        while (player1 >= 3 && player2 >= 3 && rounds <= maxRounds) {
            int move1 = getPlayer1Move(rounds);
            int move2 = getPlayer2Move(rounds);

            player1 -= move1;
            player2 -= move2;

            if (move1 == move2) {
                player2++;
            } else if (Math.abs(move1 - move2) == 1) {
                player2++;
            } else if (Math.abs(move1 - move2) == 2) {
                player1 += 2;
            }

            rounds++;
        }

        if (player1 > player2) {
            System.out.println("player 1 wins");
        } else if (player1 < player2) {
            System.out.println("player 2 wins");
        } else {
            System.out.println("tie game");
        }
    }
}