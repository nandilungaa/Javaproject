public class Invoice {

    private String number;
    private String description;
    private int nbItems;
    private double price;

    public Invoice(){}


    public Invoice(String theNumber, String theDescription, int theNbItems, double thePrice ){
        this.number = theNumber;
        this.description = theDescription;
        this.nbItems = theNbItems;
        this.price = thePrice;
    }


    //methods(getters and setters)
    public String getNumber(){
        return this.number;
    }

    public String getDescription() {
        return description;
    }

    public int getNbItems() {
        return nbItems;
    }

    public double getPrice() {
        return price;
    }


    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNbItems(int nbItems) {
        this.nbItems = nbItems;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // access modifier(public, private, default, protected)
    // retunr type(int, double, String,  float,  void)
    // method name
    /// we open the paranthesis and we put the arrguments()parameteres

    public double getInvoiceAmount(){

        // check if quantity is not positive
        if(this.nbItems < 0){
            this.nbItems = 0;
        }

        if(this.price <0){
            this.price= 0.0;
        }

        double totalAmount = this.nbItems * this.price;

        return totalAmount;
    }

}
