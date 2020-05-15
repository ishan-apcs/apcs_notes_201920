public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public Reservation requestRom(String guestName) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }

    public Reservation cancelAndReassign(Reservation res) {
        int index = res.getRoomNumber();
        if (waitList.size() > 0) {
            rooms[index] = new Reservation(waitList.get(0), index);
            waitList.remove(0);
        } else {
            rooms[index] = null;
        }
        return rooms[index];
    }
}