public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int countElectronicsByMaker(String maker) {
        int count = 0;
        for (Gizmo gizmo : purchases) {
            if (gizmo.isElectronic() && gizmo.getMaker().equals(maker)) {
                count++;
            }
        }
        return count;
    }

    public boolean hasAdjacentEqualPair() {
        if (purchases.size() > 1) {
            for (int i = 0; i < purchases.size() - 1; i++) {
                if (purchases.get(i).equals(purchases.get(i + 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    public Gizmo getCheapestGizmoByMaker(String maker) {}
    /**
     * The Gizmo class would need a variable to store a price as well as a method to
     * retrieve that price variable. Its constructor would also need to take the
     * price as a parameter, and set the price class variable equal to the parameter
     * of the constructor.
     * 
     * The price variable in Gizmo would either be an int or a double. The method to
     * retrieve that price would have the same return type as the price variable
     * itself, and would do nothing more than return the price variable. The Gizmo
     * constructor would need to set the price class variable equal to its local
     * price value, from its parameters. Finally, the getCheapestGizmoByMaker method
     * would contain a Gizmo object that is not initialized. The method would also
     * require 2 for loops that iterate over the entire purchases List. The first
     * loop contains an if statement that checks if the Gizmo object in the method
     * variable is null, as well as if the Gizmo object at the current index has the
     * same maker value as the String parameter. If both conditions are true, the
     * variable is set to the Gizmo at the current index. Once this is done, the for
     * loop will no longer check each Gizmo object in the purchases List, as the
     * method variable will no longer be null and that condition in the if statement
     * will no longer be satisfied. After this for loop, there must be an if
     * statement to check if the method variable is still null, which would indicate
     * that there are no Gizmos from the specified maker. If this is true, the
     * method should return null. After this if statement, another for loop must
     * iterate through the entire List as before, checking if the Gizmo at each
     * index is from the specified maker and has a lower price than the Gizmo method
     * variable. If both conditions are true, the method variable must be set to the
     * Gizmo at the current index. After this for loop has completed, the Gizmo
     * method variable will contain the Gizmo from the specified maker with the
     * lowest price. This variable can now be returned, as the last statement in the
     * method.
     */
}
