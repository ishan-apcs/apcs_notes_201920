package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount()); // 0
        System.out.println(pw1.pwGen()); // "chs.3900"
        System.out.println(pw1.pwGen()); // "chs.1132"
        System.out.println(pw1.pwCount()); // 2
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount()); // 2
        System.out.println(pw2.pwGen()); // "A.843055"
        System.out.println(pw2.pwCount()); // 3
        System.out.println(pw1.pwCount()); // 3
    }
}

class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }

    public Invitation(String a) {
        address = a;
        hostName = "Host";
    }

    public String getName() {
        return hostName;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String invite(String person) {
        return "Dear " + person + ", please attend my event at " + address + ". See you then, " + hostName + ".";
    }
}