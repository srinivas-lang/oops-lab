interface Transaction {
    void process();
}

class UPI implements Transaction {
    public void process() {
        System.out.println("Payment completed through UPI");
    }
}

class NetBanking implements Transaction {
    public void process() {
        System.out.println("Payment completed through Net Banking");
    }
}

public class trans {
    public static void main(String[] args) {
        Transaction t1 = new UPI();
        t1.process();

        Transaction t2 = new NetBanking();
        t2.process();
    }
}
