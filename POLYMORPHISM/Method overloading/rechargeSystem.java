public class rechargeSystem {
    void recharge(int amount) {
        System.out.println("Recharged ₹" + amount + " using balance.");
    }

    void recharge(String mobileNumber, int amount) {
        System.out.println("Recharged ₹" + amount + " to mobile: " + mobileNumber);
    }

    void recharge(String mobileNumber, String operator, int amount) {
        System.out.println("Recharged ₹" + amount + " to " + mobileNumber + " via " + operator);
    }

    public static void main(String[] args) {
        rechargeSystem rs = new rechargeSystem();
        rs.recharge(199);                              
        rs.recharge("9876543210", 299);              
        rs.recharge("9876543210", "Airtel", 399); 
    }
}
