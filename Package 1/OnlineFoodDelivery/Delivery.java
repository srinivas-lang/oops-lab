public class Delivery {
    private String address;
    private String status;

    public Delivery(String address) {
        this.address = address;
        this.status = "Preparing";
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }

    public void showStatus() {
        System.out.println("Delivery to: " + address);
        System.out.println("Current Status: " + status);
    }
}
