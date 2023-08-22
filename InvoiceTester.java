public class InvoiceTester {

    public static void main(String[] args) {

        Invoice i1 = new Invoice("A5B6554","Iphone 13",3,999.99);

        System.out.println(i1.getNumber());
        System.out.println(i1.getDescription());
        System.out.println(i1.getNbItems());
        System.out.println(i1.getPrice());


        System.out.println(i1.getInvoiceAmount());
    }
}
