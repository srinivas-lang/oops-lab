public class Main {
    public static void main(String[] args) {
        // Create menu items
        MenuItem pizza = new MenuItem("Pizza", 8.99);
        MenuItem burger = new MenuItem("Burger", 5.49);
        MenuItem fries = new MenuItem("Fries", 2.99);

        // Display menu
        System.out.println("Menu:");
        pizza.displayItem();
        burger.displayItem();
        fries.displayItem();

        // Create an order
        Order myOrder = new Order();
        myOrder.addItem(pizza);
        myOrder.addItem(fries);

        // Show order summary
        myOrder.displayOrder();

        // Delivery
        Delivery myDelivery = new Delivery("123 Main Street");
        myDelivery.showStatus();
        
        // Simulate delivery update
        myDelivery.updateStatus("On the way");
        myDelivery.showStatus();
        
        myDelivery.updateStatus("Delivered");
        myDelivery.showStatus();
    }
}
