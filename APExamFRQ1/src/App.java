import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public ArrayList<Integer> screensWithMovies() {
        ArrayList<Integer> screens = new ArrayList<Integer>();
        for (int i = 0; i < screenArr.length; i++) {
            if (screenArr[i] != null) {
                screens.add(i);
            }
        }
        return screens;
    }

    public void updateScreenArr(ArrayList<Movie> moviesToAssign) {
        for (int i = 0; i < screenArr.length; i++) {
            if (screenArr[i] == null) {
                screenArr[i] = moviesToAssign.remove(0);
            }
        }
    }

    /**
     * I would need the Movie class to contain a private boolean called popular. It
     * would be true or false depending on whether a movie is popular or not
     * (respectively). There must be a public getPopularity method in Movie with a
     * return type boolean that returns the value of the popular boolean. The Movie
     * constructor should also set the initial value of the popular boolean, and
     * there should be a public void setPopular method to change that value.
     */
}
