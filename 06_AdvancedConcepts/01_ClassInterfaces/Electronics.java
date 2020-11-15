public class Electronics implements Payments, PrintMessage {

    int count;
    String name; 
    Double price; 
    Boolean delivery;

    public Electronics(int count, String name, Double price, Boolean delivery) {
        this.count = count;
        this.name = name;
        this.price = price; 
        this.delivery = delivery; 
    }

    @Override // from interface Payments
    public double getPaymentTotal() {
        if (delivery) {
            return (count * price) + 2.0; 
        } else {
            return (count + price); 
        }
    }

    @Override // from interface PrintMessage
    public String printIt() {
        return "Welcome at Electronics Department: ";
    }

    @Override // inherited from the defult class
    public String toString() {
        return "- Name: " + name + " | " + 
                 "Count: " + count + " | " + 
                 "Price: " + getPaymentTotal(); 
    }
    
}
