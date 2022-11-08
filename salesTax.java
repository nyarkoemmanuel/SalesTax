import java.util.Scanner;
public class salesTax {
    public static void main(String[] args) {
        Scanner nyarko = new Scanner(System.in);

        double purchase,stateSaleTax=0.04,countySalesTax=0.02,totalSalesTax,totalSales;



        System.out.println("Enter your amount of purchase");
        purchase= nyarko.nextDouble();

        totalSalesTax = stateSaleTax + countySalesTax;
        totalSales= purchase + totalSalesTax;

        System.out.println("Purchase=" + purchase);

        System.out.println("state Sale Tax=" + totalSalesTax);

        System.out.println("county Sales Tax=" + countySalesTax);

        System.out.println("The Total Sales Tax=" +stateSaleTax);

        System.out.println("In all ,The Total Sales is  " +totalSales );
    }
    }
