public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 350;
        double salesTax = 0;
        final double SALES_TAXRATE = .05;

        salesTax = itemPrice * SALES_TAXRATE;

        System.out.println("The sales tax on a purchase of " + itemPrice + " is $" + salesTax );
    }
}