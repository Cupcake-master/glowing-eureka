public class Task_6 {
    public static void main(String[] args) {
        String customerName = args[0];
        double amount = Double.parseDouble(args[1]);
        boolean isFulfilled = Boolean.parseBoolean(args[2]);
        PurchaseOrder purchaseOrder = new PurchaseOrder(customerName, amount);
        try {
            purchaseOrder.setStatus(isFulfilled);
        } catch (OrderAlreadyFulfilledException e) {
            System.out.println(e.getMessage());
        }
    }

    public static class PurchaseOrder {
        private String customerName;
        private double amount;
        private boolean isFulfilled;

        public PurchaseOrder(String customerName, double amount) {
            this.customerName = customerName;
            this.amount = amount;
            this.isFulfilled = false;
        }

        public void fulfillOrder() {
            this.isFulfilled = true;
        }

        public boolean isFulfilled() {
            return this.isFulfilled;
        }

        public void setStatus(boolean isFulfilled) throws OrderAlreadyFulfilledException {
            if (isFulfilled) {
                throw new OrderAlreadyFulfilledException("The order is already completed and its status cannot be changed.");
            }else{
                System.out.println("OK");
            }
        }
    }

    public static class OrderAlreadyFulfilledException extends Exception {
        public OrderAlreadyFulfilledException(String message) {
            super(message);
        }
    }
}
