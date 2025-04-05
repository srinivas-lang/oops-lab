abstract class Purchase {
    abstract double calculateTotalAmount();
}

class OnlinePurchase extends Purchase {
    private double itemCost, shippingCost;

    OnlinePurchase(double itemCost, double shippingCost) {
        this.itemCost = itemCost;
        this.shippingCost = shippingCost;
    }

    double calculateTotalAmount() {
        return itemCost + shippingCost;
    }
}

class InPersonPurchase extends Purchase {
    private double itemCost, discount;

    InPersonPurchase(double itemCost, double discount) {
        this.itemCost = itemCost;
        this.discount = discount;
    }

    double calculateTotalAmount() {
        return itemCost - discount; // Total = Item cost - Discount
    }
}

public class Checkout {
    public static void main(String[] args) {
      
        Purchase onlineOrder = new OnlinePurchase(800, 40);  
        
        Purchase inStoreOrder = new InPersonPurchase(800, 120);  

        System.out.println("Total for your online order: $" + onlineOrder.calculateTotalAmount());
        System.out.println("Total for your in-person store purchase: $" + inStoreOrder.calculateTotalAmount());
    }
}