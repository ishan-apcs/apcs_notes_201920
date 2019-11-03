/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg14;

/**
 *
 * @author ishanmadan
 */
public class HW14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // problem1();
        // problem2();
        // problem3();
        // problem4();
        problem5();
    }

    public static void problem1() {
        String[][] answers = {
            {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
            {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
            {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
            {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
            {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
            {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"}};
            
            String[] keys = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
            
            double[] grades = new double[answers.length];
    
            for (int i = 0; i < answers.length; i++) { // each iteration is a different student
                int grade = 0;
                for (int j = 0; j < answers[i].length; j++) { // each iteration is a different question (for the same student)
                    if (keys[j].equals(answers[i][j])) {
                        grade++;
                    }
                }
                grades[i] = ((double)grade/keys.length) * 100;
            }
            
            int bestStudent = 0;
            int worstStudent = 0;
    
            for (int i = 0; i < grades.length; i++) {
                System.out.println("Student " + (i+1) + " got a " + grades[i] + ".");
                if (grades[i] > grades[bestStudent]) {
                    bestStudent = i;
                }
                if (grades[i] < grades[worstStudent]) {
                    worstStudent = i;
                }
            }
    
            System.out.println("\nThe best student was student " + (bestStudent+1) + ".");
            System.out.println("The worst student was student " + (worstStudent+1) + ".");
    }
    
    public static void problem2() {
        int[][] rolls = new int[11][2];
        rolls[0][0] = 2;
        rolls[1][0] = 3;
        rolls[2][0] = 4;
        rolls[3][0] = 5;
        rolls[4][0] = 6;
        rolls[5][0] = 7;
        rolls[6][0] = 8;
        rolls[7][0] = 9;
        rolls[8][0] = 10;
        rolls[9][0] = 11;
        rolls[10][0] = 12;

        int limit = 10000;
        for (int i = 0; i < limit; i++) {
            int rand1 = (int)(Math.random() * 6 + 1);
            int rand2 = (int)(Math.random() * 6 + 1);

            int sum = rand1 + rand2;

            rolls[sum-2][1]++;
            System.out.println(i);
        }
        
        String line = "\n+----+-------+";

        System.out.println(line);

        for (int[] row : rolls) {
            // System.out.println(row[0] + ":\t" + row[1]);
            System.out.print("|");
            System.out.printf("%3d", row[0]);
            System.out.printf("%-9s", (" | " + row[1]));
            System.out.println("|" + line);
        }
    }

    public static void problem3() {
        boolean[] array = new boolean[1000];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                for (int j = i+1; j < array.length; j++) {
                    if (j % i == 0) {
                        array[j] = false;
                    }
                }
            }
        }

        System.out.println("Prime Numbers:");

        for (int i = 0; i < array.length; i++) {
            if (array[i])
                System.out.println(i);
        }
    }

    public static void problem4() {
        double[][] points = {{-1,3},{-1,-1},{1,1},{2,0.5},{2,-1},{3,3},{4,2},{4,-0.5}};

        double[][] closest = new double[points.length][5];
        // 0 is x1, 1 is y1, 2 is x2, 3 is y2, 4 is distance
        final double LIMIT = 999;

        for (int i = 0; i < closest.length; i++) {
            closest[i][4] = LIMIT;
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i; j < points.length; j++) {
                double distance = (double)(Math.round(Math.sqrt(Math.pow(points[j][0] - points[i][0], 2) + Math.pow(points[j][1] - points[i][1], 2)) * 1000))/1000;
                if (distance != 0) {
                    if (closest[0][4] > distance) {
                        closest[0][0] = points[i][0];
                        closest[0][1] = points[i][1];
                        closest[0][2] = points[j][0];
                        closest[0][3] = points[j][1];
                        closest[0][4] = distance;
                        
                        for (int k = 1; k < closest.length; k++) {
                            for (int l = 0; l < closest[0].length; l++) {
                                closest[k][l] = 0;
                            }
                        }
                    } else if (closest[0][4] == distance) {
                        int k;
                        for (k = 0; k < closest.length; k++) {
                            if (closest[k][4] != distance) {
                                break;
                            }
                        }
                        closest[k][0] = points[i][0];
                        closest[k][1] = points[i][1];
                        closest[k][2] = points[j][0];
                        closest[k][3] = points[j][1];
                        closest[k][4] = distance;
                    }
                }
            }
        }

        for (double[] element1 : closest) {
            if (element1[4] != 0) {
                System.out.println("Point (" + element1[0] + ", " + element1[1] + ") and point (" + element1[2] + ", " + element1[3] + ") are " + element1[4] + " apart.");
            }
        }
    }

    public static void problem5() {
        String[][] brackets = new String [16][2];
        
        brackets[0][0] = "{}";
        brackets[1][0] = "";
        brackets[2][0] = "{}{}";
        brackets[3][0] = "{";
        brackets[4][0] = "}";
        brackets[5][0] = "}{";
        brackets[6][0] = "{{{}{{}}}}";
        brackets[7][0] = "{{}}}{}"; 
        brackets[8][0] = "{}}{}{";
        brackets[9][0] = "{{{{{}}{{}}}"; 
        brackets[10][0] = "{}}"; 
        brackets[11][0] = "{{}";
        brackets[12][0] = "{{{}}{{}}";
        brackets[13][0] = "{{}{{}{{}}}}"; 
        brackets[14][0] = "}{}{}{"; 
        brackets[15][0] = "{}}{{}";

        String[][] strings = new String[16][0];

        boolean[] matches = new boolean[16];

        for (int i = 0; i < brackets.length; i++) {
            strings[i] = brackets[i][0].split("");
        }

        for (int i = 0; i < matches.length; i++) {
            matches[i] = true;
        }

        for (int i = 0; i < strings.length; i++) { // iterates through each separate string
            int count = 0;
            int j = 0;
            while (count >= 0 && j < strings[i].length) { // iterates through each character in a string
                String string = strings[i][j];
                
                if (string.equals("{")) {
                    count++;
                } else if (string.equals("}")) {
                    count--;
                }

                if (count < 0) {
                    matches[i] = false;
                }
                j++;
            }
            if (count != 0) {
                matches[i] = false;
            }
        }

        int length = 0;

        for (String[] array : strings) {
            if (array.length > length) {
                length = array.length;
            }
        }

        for (int i = 0; i < matches.length; i++) {
            System.out.print("+");
            for (int j = 0; j < length + 2; j++) {
                System.out.print("-");
            }
            System.out.print("+");
            System.out.println("-------+");
            System.out.printf("|%" + (length + 1) + "s", " " + brackets[i][0]);
            System.out.printf(" | %5s |\n", matches[i]);
        }

        System.out.print("+");
        for (int j = 0; j < length + 2; j++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("-------+");
    }
}
