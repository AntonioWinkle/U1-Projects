import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Sales {
    public static void main(String[] args) {
        DecimalFormat roundTo2 = new DecimalFormat("0.00");

        String dumbHolder;
        double salePrice;
        int discount, quantity, salesTax;

        dumbHolder = JOptionPane.showInputDialog("How many did you buy?");
        quantity = Integer.parseInt(dumbHolder);

        dumbHolder = JOptionPane.showInputDialog("How much was the sale price?");
        salePrice = Double.parseDouble(dumbHolder);

        dumbHolder = JOptionPane.showInputDialog("How much did they tax you for?");
        salesTax = Integer.parseInt(dumbHolder);

        dumbHolder = JOptionPane.showInputDialog("How much was the discount?");
        discount = Integer.parseInt(dumbHolder);


        double discountPercent = discount/100.0;
        double taxRate = salesTax/100.0;
        double subTotal = salePrice * quantity;
        double taxedTotal = subTotal * (1+taxRate);
        double trueTotal = taxedTotal * discountPercent;

        JOptionPane.showMessageDialog(null, "subtotal: " + roundTo2.format(subTotal));
        JOptionPane.showMessageDialog(null, "Tax total: " + taxRate);
        JOptionPane.showMessageDialog(null, "Total Cost: " + roundTo2.format(trueTotal));

        System.exit(0);
    }
    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
}
