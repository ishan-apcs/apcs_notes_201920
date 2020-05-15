public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int getTotalBoxes() {
        int count = 0;
        for (CookieOrder order : orders) {
            count += order.getNumBoxes();
        }
        return count;
    }

    public int removeVariety(String cookieVar) {
        int count = 0;
        for (CookieOrder order : orders) {
            if (order.getVariety().equals(cookieVar)) {
                orders.remove(order);
                count += order.getNumBoxes();
            }
        }
        return count;
    }
}
