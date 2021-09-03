import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a adjective ending with ed: ");
        String adjLib = read.next();

        System.out.print("Enter a noun: ");
        String nounLib = read.next();

        System.out.print("Enter a second noun: ");
        String nounLibTwo = read.next();

        System.out.print("Enter a third noun: ");
        String nounLibThree = read.next();

        System.out.print("Enter a fourth noun: ");
        String nounLibFour = read.next();

        System.out.println("There ain't no rest for the "+adjLib+". "+nounLib+" don't grow on "+nounLibTwo+". "+" I've got "+nounLibThree+" to pay. I've got "+nounLibFour+" to feed. There ain't nothing in this world for free.");
    }

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
}