import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private String customerName;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(String orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public double total(){
        double total = 0;
        for(OrderItem item : items){
            total += item.total();
        }
        return total;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static class OrderItem {
        private final String productName;
        private final double unitPrice;
        private final int quantity;

        public OrderItem(String productName, double unitPrice, int quantity) {
            this.productName = productName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        double total(){
            return unitPrice * quantity;
        }
    }
}
