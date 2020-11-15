public class Apparel implements Payments, PrintMessage {
    
    String name;
    Double price;
    Double discount;
    String tag;

    public Apparel(String name, double price, double discount, String tag) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.tag = tag;
    }

    @Override // from interface Payments
    public double getPaymentTotal() {
        if (tag.equals("outlet")) {
            return (price - (price * discount));
        } else {
            return price;
        }
    }

    @Override // from interface PrintMessage
    public String printIt() {
        return "Welcome at Apparel Department:";
    }

    @Override // inherited from the defult class
    public String toString() {
        return "- Name: " + name + " | " + 
                 "Discount: " + discount + " | " + 
                 "Price: " + getPaymentTotal(); 
    }
    
}
